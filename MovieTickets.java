class MovieTickets{
	static double ticketPrice=0.0;
	public static double findTicketPrice(String movieName){
		
		System.out.println("Started");
		if(movieName=="Dune: Part Two")return ticketPrice=445.23;
		if(movieName=="Challengers")return ticketPrice=526.90;
		if(movieName=="Civil War")return ticketPrice=456.34;
		if(movieName=="The Fall Guy")return ticketPrice=678.89;			
		if(movieName=="Mean Girls")return ticketPrice=245.67;						
		if(movieName=="Argylle")return ticketPrice=988.34;			
		if(movieName=="Kung Fu Panda 4")return ticketPrice=789.45;			
		if(movieName=="La chimeraMadame Web")return ticketPrice=345.89;
		if(movieName=="Madame Web") return ticketPrice=678.17;
		if(movieName=="Monkey Man")return ticketPrice=567.04;			
		if(movieName=="The Beekeeper")return ticketPrice=890.67;		
		if(movieName=="Love Lies Bleeding")return ticketPrice=456.09;			
		if(movieName=="Anyone but You")return ticketPrice=897.56;
		if(movieName=="IF")return ticketPrice=989.56;
		if(movieName=="Furiosa: A Mad Max Saga")return ticketPrice=909.45;
		if(movieName=="The Iron Claw")return ticketPrice=123.78;
		if(movieName=="Poor Things")return ticketPrice=467.45;
		if(movieName=="Fighter")return ticketPrice=889.56;
		if(movieName=="Shaitaan")return ticketPrice=987.67;
		if(movieName=="Maidaan")return ticketPrice=789.46;
		if(movieName=="Crew")return ticketPrice=345.23;
			
		else
			System.out.println(movieName+" is not available");
		System.out.println("ended");
		return ticketPrice;
	}
	
	public static double findTicketPrice(String movieName, int quantity){
	quantity =5;
	if(movieName=="Crew") return ticketPrice=345.23*5;
	else{
		return ticketPrice=0.0;
	}
   }
}