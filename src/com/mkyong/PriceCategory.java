package com.mkyong;

public class PriceCategory {

private long id;
private String category;
private String name;
private double amount;
private double refundableAmount;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getRefundableAmount() {
	return refundableAmount;
}
public void setRefundableAmount(double refundableAmount) {
	this.refundableAmount = refundableAmount;
}




}
