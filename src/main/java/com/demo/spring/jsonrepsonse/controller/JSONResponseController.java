package com.demo.spring.jsonrepsonse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.jsonrepsonse.response.JSONResponse;
import com.demo.spring.jsonrepsonse.response.ResponseStatus;
import com.demo.spring.jsonrepsonse.service.IJSONResponseService;

@RestController
@RequestMapping(value = "/person")
public class JSONResponseController {

	@Autowired
	private IJSONResponseService iJSONResponseService;

	@RequestMapping(method = RequestMethod.GET)
	public JSONResponse getPersonList() {

		JSONResponse jsonResponse = new JSONResponse();

		try {
			jsonResponse.getData().put("responseData", iJSONResponseService.getPeople());
			jsonResponse.setStatus(ResponseStatus.SUCCESS);
			jsonResponse.setMessage("Person list fetched successfully.");
		} catch (Exception e) {
			jsonResponse.setStatus(ResponseStatus.FAILURE);
			jsonResponse.setMessage("Unable to fetch the list.");
		}

		return jsonResponse;
	}
}
