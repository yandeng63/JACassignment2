package Metro;

import java.util.Objects;

import TrainAndTram.Train;

public class Metro extends Train {

	private int totalNumberOfStops;
	
	private long SN;
	
	private long SNCounter = 25000;
	
	
	public Metro() {
		
		super();
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Metro(int numberOfWheels,double maximumSpeed,int numberOfVehicles, String startingStation, String nameOfTheDestinationStationint,int totalNumberOfStops) {
		
		super(numberOfWheels, maximumSpeed, numberOfVehicles,startingStation, nameOfTheDestinationStationint);
		
		this.totalNumberOfStops = totalNumberOfStops;
		
		SN = SNCounter;
		
		SNCounter ++;
	}
	
     public Metro(Metro M) { //copy constructor
		
		super(M);
		
		this.totalNumberOfStops = M.totalNumberOfStops;
}
    public long getSN() {
 		return SN;
 	}

	public int getTotalNumberOfStops() {
		return totalNumberOfStops;
	}

	public void setTotalNumberOfStops(int totalNumberOfStops) {
		this.totalNumberOfStops = totalNumberOfStops;
	}
     
	public long getNextSerialNumber() {
		return SN;
	}

	@Override
	public String toString() {
		return super.toString() + " totalNumberOfStops = " + totalNumberOfStops;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(totalNumberOfStops);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metro other = (Metro) obj;
		return totalNumberOfStops == other.totalNumberOfStops;
	}
	
	
}


