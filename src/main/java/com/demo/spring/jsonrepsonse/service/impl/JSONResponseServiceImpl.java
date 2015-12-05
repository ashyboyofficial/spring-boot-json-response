package com.demo.spring.jsonrepsonse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.spring.jsonrepsonse.dto.PersonDTO;
import com.demo.spring.jsonrepsonse.response.IResponseDTO;

@Service
public class JSONResponseServiceImpl implements com.demo.spring.jsonrepsonse.service.IJSONResponseService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.demo.spring.jsonrepsonse.service.JSONResponseService#getPeople()
	 */
	@Override
	public List<? extends IResponseDTO> getPeople() {

		List<PersonDTO> people = new ArrayList<PersonDTO>();

		// Creating a dummy list of DTO objects
		for (int i = 1; i <= 3; i++) {
			PersonDTO person = new PersonDTO();
			person.setName("Person " + i);
			person.setAge(20 + i);
			person.setCity("City " + i);
			people.add(person);
		}

		return people;
	}

}
