package com.sample.model.location;

public class UserTimeZone {

	private String offset;

	private String description;

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserTimeZone [offset=" + offset + ", description=" + description + "]";
	}
	
	

}
