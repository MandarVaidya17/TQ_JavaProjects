package com.custom;

public class InvalidMarks extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidMarks() {
		super();
		
	}
	public InvalidMarks(String message) {
		super(message);
	}
}
