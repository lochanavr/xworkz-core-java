class FoodPandaRunner{
	public static void main(String[]food){
		System.out.println("Main started");
		
		String menuName="Maggi";
		double findMenuPrice= FoodPanda.findMenuPrice(menuName,2);
		System.out.println("The cost of "+menuName+" is "+findMenuPrice);
		System.out.println("Main ended");
	}

}