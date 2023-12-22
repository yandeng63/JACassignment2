package aWheeledTransportation;

import java.util.Objects;

public class WheeledTransportation {

	private int numberOfWheels;
	
	private double maximumSpeed;
	
	private long SN;
	
	private long SNCounter = 1000000;
	
	public WheeledTransportation() { //default constructor
        SN = SNCounter;
		
		SNCounter ++;
	}
	
	
	public WheeledTransportation(int numberOfWheels, double maximumSpeed) {
		
		this.numberOfWheels = numberOfWheels;
		
		this.maximumSpeed = maximumSpeed;
		
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public WheeledTransportation(WheeledTransportation w) { //copy constructor
		
		this.numberOfWheels = w.numberOfWheels;
		
		this.maximumSpeed = w.maximumSpeed;
	}
	

	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public double getMaximumSpeed() {
		return maximumSpeed;
	}


	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	public long getNextSerialNumber() {
		return SN;
	}
	
	public String toString() {
		return " has " + numberOfWheels + "wheels"
				+ ", has a maximumSpeed of" + maximumSpeed + "km/hr";
		}


	@Override
	public int hashCode() {
		return Objects.hash(maximumSpeed, numberOfWheels);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WheeledTransportation other = (WheeledTransportation) obj;
		return Double.doubleToLongBits(maximumSpeed) == Double.doubleToLongBits(other.maximumSpeed)
				&& numberOfWheels == other.numberOfWheels;
	}


	
	
			
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if(obj instanceof WheeledTransportation ) {
			WheeledTransportation w = (WheeledTransportation)obj;
			return this.numberOfWheels == w.numberOfWheels && this.maximumSpeed == w.maximumSpeed;
		}
		
		return false; */
	}
