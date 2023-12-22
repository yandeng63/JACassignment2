package Monowheel;

import java.util.Objects;

import aWheeledTransportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation {

	private double maxximumWeight;//maximum weight the Monowheel supports
	
	private long SN;
	
	private long SNCounter = 55000;
	
	public Monowheel() {
        super();
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Monowheel(int numberOfWheels, double maximumSpeed, double maxximumWeight) {
	
		super(numberOfWheels,maximumSpeed);
		
		this.maxximumWeight = maxximumWeight;
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Monowheel(Monowheel M) { //copy constructor
		
		Monowheel M1 = new Monowheel();
		
		M1.maxximumWeight = M.maxximumWeight;
	}
	
	public double getMaxximumWeight() {
		return maxximumWeight;
	}

	public void setMaxximumWeight(double maxximumWeight) {
		this.maxximumWeight = maxximumWeight;
	}

	public long getNextSerialNumber() {
		return SN;
	}

	@Override
	public String toString() {
		return super.toString() + " maxximumWeight is " + maxximumWeight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maxximumWeight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monowheel other = (Monowheel) obj;
		return Double.doubleToLongBits(maxximumWeight) == Double.doubleToLongBits(other.maxximumWeight);
	}
	
	
	
}
	
