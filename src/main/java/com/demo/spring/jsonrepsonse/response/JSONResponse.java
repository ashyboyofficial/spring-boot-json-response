package com.demo.spring.jsonrepsonse.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONResponse {

	private Map<String, List<? extends IResponseDTO>> data = new HashMap<String, List<? extends IResponseDTO>>();
	private ResponseStatus status;
	private String message;

	public Map<String, List<? extends IResponseDTO>> getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setData(Map<String, List<? extends IResponseDTO>> data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

}
