class DominosRunner{
	public static void main(String[]domino){
		System.out.println("Main started");
		
		String pizzaName="Anchovies";
		double findCostOfPizza= Dominos.findCostOfPizza(pizzaName,9);
		System.out.println("The cost of "+pizzaName+" is "+findCostOfPizza);
		System.out.println("Main ended");
	}
}