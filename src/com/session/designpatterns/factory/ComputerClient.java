package com.session.designpatterns.factory;

public class ComputerClient {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(ComputerType.PC.name(), "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER.name(), "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}

}
