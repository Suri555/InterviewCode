package com.sample.model;

import java.util.Arrays;

public class FinalResult {

	private UserDetails[] results;

	private Info info;

	public UserDetails[] getResults() {
		return results;
	}

	public void setResults(UserDetails[] results) {
		this.results = results;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "FinalResult [results=" + Arrays.toString(results) + ", info=" + info + "]";
	}
	
	

}
