package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class Response {
	private int code;
	
	private String mes;
	
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Response(int code, String mes, Object data) {
		super();
		this.code = code;
		this.mes = mes;
		this.data = data;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
