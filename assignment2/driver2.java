package assignment2;

import Ferry.Ferry;
import Metro.Metro;
import Monowheel.Monowheel;
import TrainAndTram.Train;
import TrainAndTram.Tram;
import aWheeledTransportation.WheeledTransportation;
import aircraft.Aircraft;
import aircraft.WorldWarIIAirplane;

public class driver2 {

	private static Object[] copyTheObjects(Object[] arr) {
	    
		Object[] copy = new Object[arr.length];
	    
		try {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] instanceof WheeledTransportation) {
	                copy[i] = new WheeledTransportation((WheeledTransportation) arr[i]);
	            } else if (arr[i] instanceof Train) {
	                copy[i] = new Train((Train) arr[i]);
	            } else if (arr[i] instanceof Metro) {
	                copy[i] = new Metro((Metro) arr[i]);
	            } else if (arr[i] instanceof Tram) {
	                copy[i] = new Tram((Tram) arr[i]);
	            } else if (arr[i] instanceof Monowheel) {
	                copy[i] = new Monowheel((Monowheel) arr[i]);
	            } else if (arr[i] instanceof Ferry) {
	                copy[i] = new Ferry((Ferry) arr[i]);
	            } else if (arr[i] instanceof Aircraft) {
	                copy[i] = new Aircraft((Aircraft) arr[i]);
	            } else if (arr[i] instanceof WorldWarIIAirplane) {
	                copy[i] = new WorldWarIIAirplane((WorldWarIIAirplane) arr[i]);
	            }
	        }
	    
		} catch (RuntimeException e) {
	        System.out.println("Exception happened during object copying: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return copy;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train T1 = new Train(60,140,6,"montreal","toronto");
		System.out.println("This Train - " + T1.getNextSerialNumber() + T1.toString());
		
		Train T2 = new Train(70,150,7,"vancouver","toronto");
		System.out.println("This Train - " + T2.getNextSerialNumber() + T2.toString());
		
		Train T3 = new Train(60,140,6,"montreal","toronto");
		System.out.println("This Train - " + T3.getNextSerialNumber() + T3.toString());
		
		
		System.out.println();
		
		
		Metro M1 = new Metro(20,160,7,"brossard", "Mcgill", 12);
		System.out.println("This Metro - " + M1.getNextSerialNumber() + M1.toString());
		
		Metro M2 = new Metro(30,170,8,"boucherville", "Mcgill", 13);
		System.out.println("This Metro - " + M2.getNextSerialNumber() + M2.toString());
	
		Metro M3 = new Metro(20,160,7,"brossard", "Mcgill", 12);
		System.out.println("This Metro - " + M3.getNextSerialNumber() + M3.toString());
		
		
		System.out.println();
		
		
		Tram Tr1 = new Tram(20,160,7,"brossard", "Mcgill", 12, 1990);
		System.out.println("This Tram - " + Tr1.getNextSerialNumber() + Tr1.toString());
		
		Tram Tr2 = new Tram(20,160,7,"brossard", "Mcgill", 12, 1990);
		System.out.println("This Tram - " + Tr2.getNextSerialNumber() + Tr2.toString());
	
		Tram Tr3 = new Tram(30,160,7,"brossard", "Mcgill", 12, 2000);
		System.out.println("This Tram - " + Tr3.getNextSerialNumber() + Tr3.toString());
	
		
		System.out.println();
		
		
		Ferry F1 = new Ferry(200.0, 200.0);
		System.out.println("This Ferry - " + F1.getNextSerialNumber() + F1.toString());
		
		Ferry F2 = new Ferry(300.0, 300.0);
		System.out.println("This Ferry - " + F2.getNextSerialNumber() + F2.toString());
		
		Ferry F3 = new Ferry(200.0, 300.0);
		System.out.println("This Ferry - " + F3.getNextSerialNumber() + F3.toString());
		
		
		System.out.println();
		
		
		Monowheel Mo1 = new Monowheel(1,2,3);
		System.out.println("This Monowheel - " + Mo1.getNextSerialNumber() + Mo1.toString());
		
		Monowheel Mo2 = new Monowheel(4,5,6);
		System.out.println("This Monowheel - " + Mo2.getNextSerialNumber() + Mo2.toString());
		
		Monowheel Mo3 = new Monowheel(1,2,3);
		System.out.println("This Monowheel - " + Mo3.getNextSerialNumber() + Mo3.toString());
		
		
		System.out.println();
		
		
		Aircraft A1 = new Aircraft(20000, 20000);
		System.out.println("This Aircraft - " + A1 .getNextSerialNumber() + A1.toString());
		
		Aircraft A2 = new Aircraft(30000,30000);
		System.out.println("This Aircraft - " + A2 .getNextSerialNumber() + A2.toString());
		
		Aircraft A3 = new Aircraft(10000,20000);
		System.out.println("This Aircraft - " + A3 .getNextSerialNumber() + A3.toString());
		
		
		System.out.println();
		
		
		WorldWarIIAirplane W1 = new WorldWarIIAirplane(20000, 20000,true);
		System.out.println("This WorldWarIIAirplane - " + W1.getNextSerialNumber() + W1.toString());
		
		WorldWarIIAirplane W2 = new WorldWarIIAirplane(3000,3000, false);
		System.out.println("This WorldWarIIAirplane - " + W2.getNextSerialNumber() + W2.toString());
		
		WorldWarIIAirplane W3 = new WorldWarIIAirplane(20000, 20000,true);
		System.out.println("This WorldWarIIAirplane - " + W3.getNextSerialNumber() + W3.toString());
		
		
		System.out.println();
		
		Object [] arr = new Object[15];
		arr[0] = T1;
		arr[1] = T2;
		arr[2] = M1;
		arr[3] = M2;
		arr[4] = Tr1;
		arr[5] = Tr2;
		arr[6] = F1;
		arr[7] = F1;
		arr[8] = Mo1;
		arr[9] = Mo2;
		arr[10] = A1;
		arr[11] = A2;
		arr[12] = W1;
		arr[13] = W2;
		arr[14] = W3;
		
		Object[] copiedArray = copyTheObjects(arr);
		System.out.println("=============================================");
		System.out.println("original array");
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}
		System.out.println("=============================================");
		System.out.println("Copiec array");
		for (int i = 0; i < copiedArray.length; i++) {
		    System.out.println(copiedArray[i]);
		}
	}

}
