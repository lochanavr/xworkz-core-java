class MovieTickets{
	
	public static double findTicketPrice(String movieName){
		double ticketPrice=0.0;
		System.out.println("Started");
		if(movieName=="Dune: Part Two"){
			ticketPrice=445.23;
			return ticketPrice;
		}
		if(movieName=="Challengers"){
			ticketPrice=526.90;
			return ticketPrice;
		}
		if(movieName=="Civil War"){
			ticketPrice=456.34;
			return ticketPrice;
		}
		if(movieName=="The Fall Guy"){
			ticketPrice=678.89;
			return ticketPrice;
		}
		if(movieName=="Mean Girls"){
			ticketPrice=245.67;
			return ticketPrice;
		}
		if(movieName=="Argylle"){
			ticketPrice=988.34;
			return ticketPrice;
		}
		if(movieName=="Kung Fu Panda 4"){
			ticketPrice=789.45;
			return ticketPrice;
		}
		if(movieName=="La chimeraMadame Web"){
			ticketPrice=345.89;
			return ticketPrice;
		}
		if(movieName=="Madame Web"){
			ticketPrice=678.17;
			return ticketPrice;
		}
		if(movieName=="Monkey Man"){
			ticketPrice=567.04;
			return ticketPrice;
		}
		if(movieName=="The Beekeeper"){
			ticketPrice=890.67;
			return ticketPrice;
		}
		if(movieName=="Love Lies Bleeding"){
			ticketPrice=456.09;
			return ticketPrice;
		}
		if(movieName=="Anyone but You"){
			ticketPrice=897.56;
			return ticketPrice;
		}
		if(movieName=="IF"){
			ticketPrice=989.56;
			return ticketPrice;
		}
		if(movieName=="Furiosa: A Mad Max Saga"){
			ticketPrice=909.45;
			return ticketPrice;
		}
		if(movieName=="The Iron Claw"){
			ticketPrice=123.78;
			return ticketPrice;
		}
		if(movieName=="Poor Things"){
			ticketPrice=467.45;
			return ticketPrice;
		}
		if(movieName=="Fighter"){
			ticketPrice=889.56;
			return ticketPrice;
		}
		if(movieName=="Shaitaan"){
			ticketPrice=987.67;
			return ticketPrice;
		}
		if(movieName=="Maidaan"){
			ticketPrice=789.46;
			return ticketPrice;
		}
		if(movieName=="Crew"){
			ticketPrice=345.23;
			return ticketPrice;
		}
		else{
			System.out.println(movieName+" is not available");
		}	
		System.out.println("ended");
		return ticketPrice;
	}
}