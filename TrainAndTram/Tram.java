package TrainAndTram;

import java.util.Objects;

import Metro.Metro;

public class Tram extends Metro {

	private int yearOfCreation;
	
	private long SN;
	private long SNCounter = 300000;
	
	public Tram () {
        super();
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Tram(int numberOfWheels,double maximumSpeed,int numberOfVehicles, String startingStation, 
			String nameOfTheDestinationStationint,int totalNumberOfStops, int yearOfCreation) {
		
		super(numberOfWheels,maximumSpeed,numberOfVehicles,startingStation, 
				nameOfTheDestinationStationint,totalNumberOfStops);
		
		this.yearOfCreation = yearOfCreation;
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Tram(Tram T) {//copy constructor
	
	    super(T);
	
		this.yearOfCreation = T.yearOfCreation;
	}
	
	public long getSN() {
		return SN;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	
	public long getNextSerialNumber() {
		return SN;
	}

	@Override
	public String toString() {
		return super.toString() + " yearOfCreation is " + yearOfCreation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(yearOfCreation);
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
		Tram other = (Tram) obj;
		return yearOfCreation == other.yearOfCreation;
	}
	
	
	
}
