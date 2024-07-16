class ZomatoRunner{
	
	public static void main(String[]junk){
		System.out.println("Main started");
		
		String itemName="panner 65";
		double findItemPrice= Zomato.findItemPrice(itemName,2);
		System.out.println("The price of "+itemName+" is "+findItemPrice);
		System.out.println("Main ended");
	}
}