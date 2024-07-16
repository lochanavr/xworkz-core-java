class FlightTickets{
	static double ticketPrice=0.0;
	public static double findTicketPriceFromBengaluru(String destinationName){
		System.out.println("Flight Tickets Started");
	if(destinationName=="Chhatrapathi Shivaji international airport")return ticketPrice=5668.56;
	if(destinationName=="Kadapa Airport")return ticketPrice=7890.23;
	if(destinationName=="Daporijo Airport")return ticketPrice=9876.20;
	if(destinationName=="Rupsi Airport")return ticketPrice=5526.24;
	if(destinationName=="Darbhanga Airport")return ticketPrice=2345.24;
	if(destinationName=="Swami Vivekananda Airport")return ticketPrice=9987.67;
	if(destinationName=="Dabolim Airport")return ticketPrice=8872.45;
	if(destinationName=="Sardar Vallabhbhai Patel International Airport")return ticketPrice=9866.89;
	if(destinationName=="Hisar Airport	Kangra Airport")return ticketPrice=4567.87;
	if(destinationName=="Kangra Airport")return ticketPrice=3455.56;
	if(destinationName=="Bokaro Airport")return ticketPrice=2455.33;
	if(destinationName=="Belgavi Airport")return ticketPrice=2356.57;
	if(destinationName=="Kannur International Airport")return ticketPrice=2457.89;
	if(destinationName=="Raja Bhoj Airport")return ticketPrice=3346.78;
	if(destinationName=="Akola Airport")return ticketPrice=7653.44;
	if(destinationName=="Bir Tikendrajit International Airport")return ticketPrice=8765.34;
	if(destinationName=="Shella Airport")return ticketPrice=2345.88;
	if(destinationName=="Dimapur Airport")return ticketPrice=9987.34;
	if(destinationName=="Rourkela Airport")return ticketPrice=6778.45;
	if(destinationName=="Adampur Airport")return ticketPrice=4457.88;
	if(destinationName=="Chennai International Airport")return ticketPrice=5678.90;
	else{
		System.out.println(destinationName +" is not available");
	}
		System.out.println("Flight Tickets ended");
		return ticketPrice;
	}
	public static double findTicketPriceFromBengaluru(String destinationName, int quantity){
	quantity =2;
	if(destinationName=="Chennai International Airport") return ticketPrice=5678.90*2;
	else{
		return ticketPrice=0.0;
	}
   }
}