package com.mkyong;

public class Passanger {
enum passengerType{
	ADULT("adult"), CHILD("child");
	private String type;
	passengerType(String type)
	{
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
}
private long personId;
public long getPersonId() {
	return personId;
}
public void setPersonId(long personId) {
	this.personId = personId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPersonName() {
	return personName;
}
public void setPersonName(int personName) {
	this.personName = personName;
}
private int age;
private int personName;

}