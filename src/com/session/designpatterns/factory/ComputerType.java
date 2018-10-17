package com.session.designpatterns.factory;

public enum ComputerType {

	PC("PC"), 
	SERVER("Server");

	private String type;

	ComputerType(String type) {
		this.type = type;
	}
}
