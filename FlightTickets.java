class FlightTickets{
	
	public static double findTicketPriceFromBengaluru(String destinationName){
		double ticketPrice=0.0;
		
		System.out.println("Flight Tickets Started");
	if(destinationName=="Chhatrapathi Shivaji international airport"){
		ticketPrice=5668.56;
		return ticketPrice;
	}
	if(destinationName=="Kadapa Airport"){
		ticketPrice=7890.23;
		return ticketPrice;
	}
	if(destinationName=="Daporijo Airport"){
		ticketPrice=9876.20;
		return ticketPrice;
	}
	if(destinationName=="Rupsi Airport"){
		ticketPrice=5526.24;
		return ticketPrice;
	}
	if(destinationName=="Darbhanga Airport"){
		ticketPrice=2345.24;
		return ticketPrice;
	}
	if(destinationName=="Swami Vivekananda Airport"){
		ticketPrice=9987.67;
		return ticketPrice;
	}
	if(destinationName=="Dabolim Airport"){
		ticketPrice=8872.45;
		return ticketPrice;
	}
	if(destinationName=="Sardar Vallabhbhai Patel International Airport"){
		ticketPrice=9866.89;
		return ticketPrice;
	}
	if(destinationName=="Hisar Airport	Kangra Airport"){
		ticketPrice=4567.87;
		return ticketPrice;
	}
	if(destinationName=="Kangra Airport"){
		ticketPrice=3455.56;
		return ticketPrice;
	}
	if(destinationName=="Bokaro Airport"){
		ticketPrice=2455.33;
		return ticketPrice;
	}
	if(destinationName=="Belgavi Airport"){
		ticketPrice=2356.57;
		return ticketPrice;
	}
	if(destinationName=="Kannur International Airport"){
		ticketPrice=2457.89;
		return ticketPrice;
	}
	if(destinationName=="Raja Bhoj Airport"){
		ticketPrice=3346.78;
		return ticketPrice;
	}
	if(destinationName=="Akola Airport"){
		ticketPrice=7653.44;
		return ticketPrice;
	}
	if(destinationName=="Bir Tikendrajit International Airport"){
		ticketPrice=8765.34;
		return ticketPrice;
	}
	if(destinationName=="Shella Airport"){
		ticketPrice=2345.88;
		return ticketPrice;
	}
	if(destinationName=="Dimapur Airport"){
		ticketPrice=9987.34;
		return ticketPrice;
	}
	if(destinationName=="Rourkela Airport"){
		ticketPrice=6778.45;
		return ticketPrice;
	}
	if(destinationName=="Adampur Airport"){
		ticketPrice=4457.88;
		return ticketPrice;
	}
	if(destinationName=="Chennai International Airport"){
		ticketPrice=5678.90;
		return ticketPrice;
	}
	else{
		System.out.println(destinationName +" is not available");
	}
		System.out.println("Flight Tickets ended");
		return ticketPrice;
	}
}