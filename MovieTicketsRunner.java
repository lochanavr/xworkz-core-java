class MovieTicketsRunner{
	
	public static void main(String[]movies){
		System.out.println("Main started");
		
		String movieName="kalki";
		double findTicketPrice= MovieTickets.findTicketPrice(movieName);
		System.out.println("The price of movie "+movieName+" is "+findTicketPrice);
		System.out.println("Main ended");
	}
}