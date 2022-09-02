package com.practice.restapi;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
private String name;
private int age;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
private String country;
private boolean voter;
private Address address;
private String language[];


@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", country=" + country + ", voter=" + voter + ", address="
			+ address + ", language=" + Arrays.toString(language) + "]";
}
public String[] getLanguage() {
	return language;
}
public void setLanguage(String[] language) {
	this.language = language;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isVoter() {
	return voter;
}
public void setVoter(boolean voter) {
	this.voter = voter;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
