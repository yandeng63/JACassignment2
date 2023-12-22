package Ferry;

import java.util.Objects;

public class Ferry {

	private double maximumSpeed;
	private double maximumLoad; //the maximum load that the ferry can array
	
	private long SN;
	private long SNCounter = 70000;
	
	public Ferry() {
		super();
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Ferry(double maximumSpeed, double maximumLoad) {
		
		super();
		
		this.maximumSpeed = maximumSpeed;
		
		this.maximumLoad = maximumLoad;
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Ferry(Ferry F) { //copy constructor
		Ferry F1 = new Ferry();
		F1.maximumLoad = F.maximumLoad;
		F1.maximumSpeed = F.maximumSpeed;
	}
	
	public long getSN() {
		return SN;
	}

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public double getMaximumLoad() {
		return maximumLoad;
	}

	public void setMaximumLoad(double maximumLoad) {
		this.maximumLoad = maximumLoad;
	}
	
	public long getNextSerialNumber() {
		return SN;
	}

	@Override
	public String toString() {
		return "maximumSpeed is " + maximumSpeed + ", maximumLoad is " + maximumLoad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maximumLoad, maximumSpeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ferry other = (Ferry) obj;
		return Double.doubleToLongBits(maximumLoad) == Double.doubleToLongBits(other.maximumLoad)
				&& Double.doubleToLongBits(maximumSpeed) == Double.doubleToLongBits(other.maximumSpeed);
	}
	
}
