class DominosRunner{
	public static void main(String[]domino){
		System.out.println("Main started");
		
		String pizzaName="Achari Paneer";
		double findCostOfPizza= Dominos.findCostOfPizza(pizzaName);
		System.out.println("The cost of "+pizzaName+" is "+findCostOfPizza);
		System.out.println("Main ended");
	}
}