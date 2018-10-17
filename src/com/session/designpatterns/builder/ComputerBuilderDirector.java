package com.session.designpatterns.builder;

public class ComputerBuilderDirector {
	public Computer getBasicComputer() {
		return new Computer.Builder("2GB", "2TB", "Intel i7").build();
	}

	public Computer getGraphicsCardEnabledComputer() {
		return new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();
	}
	
	public Computer getAllFeaturesEnabledComputer() {
		return new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();
	}
	
	public static void main(String[] args) {
		ComputerBuilderDirector dir = new ComputerBuilderDirector();
		System.out.println(dir.getBasicComputer());
		System.out.println("-------------------------------");
		System.out.println(dir.getAllFeaturesEnabledComputer());
		
		
	}
	
	
}
