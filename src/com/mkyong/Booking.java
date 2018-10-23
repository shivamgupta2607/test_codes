package com.mkyong;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Booking {
private long id;
private String source;
private String destination;
private Date departureTime;
private Date arrivalTime;
private long flightId;
private Set<Passanger> passengers = new HashSet<>();


}
