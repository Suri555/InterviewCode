package com.sample.model;

import com.sample.model.location.Location;
import com.sample.model.user.DateOfBirth;
import com.sample.model.user.Login;
import com.sample.model.user.Name;
import com.sample.model.user.Picture;
import com.sample.model.user.Registered;
import com.sample.model.user.UserId;

public class UserDetails {

	private String gender;

	private Name name;

	private Location location;

	private String email;

	private Login login;

	private DateOfBirth dob;

	private Registered registered;

	private String phone;

	private String cell;

	private UserId id;

	private Picture picture;

	private String nat;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public DateOfBirth getDob() {
		return dob;
	}

	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}

	public Registered getRegistered() {
		return registered;
	}

	public void setRegistered(Registered registered) {
		this.registered = registered;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public UserId getId() {
		return id;
	}

	public void setId(UserId id) {
		this.id = id;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	@Override
	public String toString() {
		return "UserDetails [gender=" + gender + ", name=" + name + ", location=" + location + ", email=" + email
				+ ", login=" + login + ", dob=" + dob + ", registered=" + registered + ", phone=" + phone + ", cell="
				+ cell + ", id=" + id + ", picture=" + picture + ", nat=" + nat + "]";
	}
	
	

}
