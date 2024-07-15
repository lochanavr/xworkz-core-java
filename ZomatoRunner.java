class ZomatoRunner{
	
	public static void main(String[]junk){
		System.out.println("Main started");
		
		String itemName="Dal rice";
		double findItemPrice= Zomato.findItemPrice(itemName);
		System.out.println("The price of "+itemName+" is "+findItemPrice);
		System.out.println("Main ended");
	}
}