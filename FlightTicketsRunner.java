class FlightTicketsRunner{
	
	public static void main(String[]airport){
		
		System.out.println("Main started");
		
		String destinationName="Chennai International Airport";
		double findTicketPriceFromBengaluru = FlightTickets.findTicketPriceFromBengaluru(destinationName,2);
		System.out.println("The price of ticket to "+destinationName+" is "+findTicketPriceFromBengaluru);
		System.out.println("Main ended");
	}
}