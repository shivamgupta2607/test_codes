package com.mkyong;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FareInfo {
private String fareType;
private Set<Passanger> passengers = new HashSet<>();
public String getFareType() {
	return fareType;
}
public void setFareType(String fareType) {
	this.fareType = fareType;
}
public List<PriceCategory> getPrices() {
	return prices;
}
public void setPrices(List<PriceCategory> prices) {
	this.prices = prices;
}
private List<PriceCategory> prices = new ArrayList<>();

}
