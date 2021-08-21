package com.sample.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sample.model.FinalResult;
import com.sample.model.UserDetails;
import com.sample.model.user.Name;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${api.url}")
	private String API_URL;

	private final String PREFIX = "WeXL";

	@Override
	public FinalResult getResults() {
		FinalResult finalResult = null;
		try {
			ResponseEntity<FinalResult> response = restTemplate.getForEntity(API_URL, FinalResult.class);
			if (response != null) {
				finalResult = response.getBody();
				if (finalResult != null) {
					UserDetails[] userDetails = finalResult.getResults();
					if (userDetails != null && userDetails.length > 0) {
						finalResult.setResults(Arrays.asList(userDetails).stream().map(userDetail -> {
							Name name = userDetail.getName();
							name.setFirst(PREFIX + name.getFirst());
							name.setLast(PREFIX + name.getLast());
							userDetail.setName(name);
							return userDetail;
						}).toArray(UserDetails[]::new));
					}
				}
			}
		} catch (RestClientException e) {
			e.printStackTrace();
		}
		return finalResult;
	}
}