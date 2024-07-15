class SwiggyRunner{
	
	public static void main(String[]menu){
		System.out.println("Main started");
		
		String foodName="jeera rice";
		double findFoodPrice= Swiggy.findFoodPrice(foodName);
		System.out.println("The cost of "+foodName+" is "+findFoodPrice);
		System.out.println("Main ended");
	}
}