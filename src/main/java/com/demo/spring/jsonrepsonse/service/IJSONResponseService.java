package com.demo.spring.jsonrepsonse.service;

import java.util.List;

import com.demo.spring.jsonrepsonse.response.IResponseDTO;

public interface IJSONResponseService {

	/**
	 * A dummy service which returns a DTO list consisting the objects requested
	 * by client. This list will be converted into json.
	 * 
	 */
	public List<? extends IResponseDTO> getPeople();
}
