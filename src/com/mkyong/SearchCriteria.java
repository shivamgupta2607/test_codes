package com.mkyong;

import java.util.Date;

public class SearchCriteria {

	enum FROM{
		Delhi, Bangalore, Lucknow;
	}

	enum Destination{
		Delhi, Bangalore, Lucknow;
	}
	
	private int noOfAdults;
	private int noOfChilds;
	enum type{
		Business,Economy;
	}
	private Date travelDate;
	
	
}
