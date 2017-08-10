package com.zzzhc.demo.controller;

public class BadRequestException extends RuntimeException {
	public BadRequestException() {
		super();
	}

	public BadRequestException(String message) {
		super(message);
	}
}
