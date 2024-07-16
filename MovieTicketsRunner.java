class MovieTicketsRunner{
	
	public static void main(String[]movies){
		System.out.println("Main started");
		
		String movieName="Crew";
		double findTicketPrice= MovieTickets.findTicketPrice(movieName,2);
		System.out.println("The price of movie "+movieName+" is "+findTicketPrice);
		System.out.println("Main ended");
	}
}