package com.demo.spring.jsonrepsonse.dto;

import com.demo.spring.jsonrepsonse.response.IResponseDTO;

public class PersonDTO implements IResponseDTO {

	private String name;
	private int age;
	private String city;

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

}
