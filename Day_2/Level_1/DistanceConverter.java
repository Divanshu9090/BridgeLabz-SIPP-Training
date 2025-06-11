class DistanceConverter{
	public static void main (String [] args){
		//Create variable to store distance in km
		double distanceInKilometers = 10.8 ;
		
		//Convert distance from kilometers to miles
		double distanceInMiles = distanceInKilometers * 1.6 ;
		
		//Display the conversion
		System.out.println("The distance " + distanceInKilometers + " km in miles is "
							+ distanceInMiles) ;
	}
}