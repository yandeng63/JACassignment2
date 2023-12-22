package aircraft;

import java.util.Objects;

public class Aircraft {

	private double price;
	private double maximumElevation; //indicates the maximum possible hight the aircraft can reach
	
	private long SN;
	private long SNCounter = 1000000;
	
	public Aircraft() {
	}
	
	public Aircraft(double price, double maximumElevation) {
		
		super();
		
		this.price = price;
		
		this.maximumElevation = maximumElevation;
        
		SN = SNCounter;
		
		SNCounter ++;   
	}
	
	public Aircraft(Aircraft A) { //copy constructor
		
		Aircraft A1 = new Aircraft();
		
		A1.price = A.price;
		
		A1.maximumElevation = A.maximumElevation;
	}
	
	public long getSN() {
		return SN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMaximumElevation() {
		return maximumElevation;
	}

	public void setMaximumElevation(double maximumElevation) {
		this.maximumElevation = maximumElevation;
	}
	
	public long getNextSerialNumber() {
		return SN;
	}

	@Override
	public String toString() {
		return "price is " + price + ", maximumElevation is " + maximumElevation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maximumElevation, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aircraft other = (Aircraft) obj;
		return Double.doubleToLongBits(maximumElevation) == Double.doubleToLongBits(other.maximumElevation)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	
}
