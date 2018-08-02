package com.techlabs.RTO;

public class RTO {
	private String code, state;

	RTO(String code, String state) {
		this.code = code;
		this.state = state;
	}

	public String getCode() {
		return this.code;
	}

	public String getState() {
		return this.state;
	}

}
