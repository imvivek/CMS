package com.spicejet.cms.to;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class ResponseTo {

	public static final String STATUS_SUCCESS = "SUCCESS";
	public static final String STATUS_ERROR = "ERROR";

	private String status = STATUS_SUCCESS;
	private String errorCode = "0";
	private String message = "";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toJSON() {
		JSONObject json = new JSONObject();

		try {
			json.put("status", getStatus());
			json.put("errorCode", getErrorCode());
			json.put("message", getMessage());

		} catch (JSONException e) {
			System.out.println(e.getMessage());
		}
		return json.toString();
	}

}
