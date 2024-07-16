class Dominos{
	static double pizzaPrice=0.0;
	public static double findCostOfPizza(String pizzaName){
		
		System.out.println("Dominos Started");
		if(pizzaName=="Achari Paneer")return pizzaPrice=244.90;
		if(pizzaName=="Chaat")return pizzaPrice=608.35;
		if(pizzaName=="Chicken Tikka")return pizzaPrice=355.93;
		if(pizzaName=="Chili Paneer")return pizzaPrice=234.35;
		if(pizzaName=="Curry Paneer")return pizzaPrice=769.54;
		if(pizzaName=="Broccoli")return pizzaPrice=769.54;
		if(pizzaName=="Cream CheeseFlaming Pizza")return pizzaPrice=445.93;
		if(pizzaName=="Flaming Pizza")return pizzaPrice=545.34;
		if(pizzaName=="Kimchi")return pizzaPrice=655.78;
		if(pizzaName=="Neapolitan")return pizzaPrice=388.91;
		if(pizzaName=="Sausage")return pizzaPrice=448.30;
		if(pizzaName=="Mayonnaise")return pizzaPrice=765.98;
		if(pizzaName=="Atum")return pizzaPrice=477.50;
		if(pizzaName=="Margherita")return pizzaPrice=765.36;
		if(pizzaName=="Avocado")return pizzaPrice=654.75;
		if(pizzaName=="Plantain")return pizzaPrice=667.93;
		if(pizzaName=="Vegetarian Hawaii")return pizzaPrice=534.32;
		if(pizzaName=="Peperoniwurst")return pizzaPrice=456.89;
		if(pizzaName=="Four Formaggi")return pizzaPrice=665.91;
		if(pizzaName=="Anchovies")return pizzaPrice=566.24;
		else{
			System.out.println(pizzaName+"is not available");
		}
		
		System.out.println("Dominos ended");
		return pizzaPrice;
	}
	public static double findCostOfPizza(String pizzaName, int quantity){
	quantity =9;
	if(pizzaName=="Anchovies") return pizzaPrice=566.24*9;
	else{
		return pizzaPrice=0.0;
	}
   }
}