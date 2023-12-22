package TrainAndTram;

import java.util.Objects;

import aWheeledTransportation.WheeledTransportation;

public class Train extends WheeledTransportation {
	
	private int numberOfVehicles;
	
	private String startingStation;
	
	private String nameOfTheDestinationStation;
	
	private long SN;
	
	private long SNCounter = 1000000;
	
	public Train() {	
        super();
        
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Train(int numberOfWheels,double maximumSpeed,int numberOfVehicles, String startingStation, String nameOfTheDestinationStation) {
		
		super(numberOfWheels, maximumSpeed);
		
		this.numberOfVehicles = numberOfVehicles;
		
		this.startingStation = startingStation;
		
		this.nameOfTheDestinationStation = nameOfTheDestinationStation;
		
		SN = SNCounter;
		
		SNCounter ++;
	}
	
	public Train(Train tr) {
		super(tr);
		this.nameOfTheDestinationStation = tr.nameOfTheDestinationStation;
		this.numberOfVehicles = tr.numberOfVehicles;
		this.startingStation = tr.startingStation;
	}
	
	public long getSN() {
		return SN;
	}

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	public String getStartingStation() {
		return startingStation;
	}

	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}

	public String getNameOfTheDestinationStation() {
		return nameOfTheDestinationStation;
	}

	public void setNameOfTheDestinationStation(String nameOfTheDestinationStation) {
		this.nameOfTheDestinationStation = nameOfTheDestinationStation;
	}
	
	public long getNextSerialNumber() {
		return SN;
	}


	@Override
	public String toString() {
		return super.toString() + "It has " + numberOfVehicles +" Vehicles " + ", startingStation from " + startingStation
				+ " to desitination station " + nameOfTheDestinationStation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameOfTheDestinationStation, numberOfVehicles, startingStation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(nameOfTheDestinationStation, other.nameOfTheDestinationStation)
				&& numberOfVehicles == other.numberOfVehicles && Objects.equals(startingStation, other.startingStation);
	}

	
	
	
}
