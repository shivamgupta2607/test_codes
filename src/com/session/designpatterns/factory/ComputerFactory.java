package com.session.designpatterns.factory;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if (ComputerType.PC.name().equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if (ComputerType.SERVER.name().equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);

		return null;
	}
}