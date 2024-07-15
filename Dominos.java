class Dominos{
	public static double findCostOfPizza(String pizzaName){
		double pizzaPrice=0.0;
		System.out.println("Dominos Started");
		if(pizzaName=="Achari Paneer"){
			pizzaPrice=244.90;
			return pizzaPrice;
		}
		if(pizzaName=="Chaat"){
			pizzaPrice=608.35;
			return pizzaPrice;
		}
		if(pizzaName=="Chicken Tikka"){
			pizzaPrice=355.93;
			return pizzaPrice;
		}
		if(pizzaName=="Chili Paneer"){
			pizzaPrice=234.35;
			return pizzaPrice;
		}
		if(pizzaName=="Curry Paneer"){
			pizzaPrice=769.54;
			return pizzaPrice;
		}
		if(pizzaName=="Broccoli"){
			pizzaPrice=876.24;
			return pizzaPrice;
		}
		if(pizzaName=="Cream CheeseFlaming Pizza"){
			pizzaPrice=445.93;
			return pizzaPrice;
		}
		if(pizzaName=="Flaming Pizza"){
			pizzaPrice=545.34;
			return pizzaPrice;
		}
		if(pizzaName=="Kimchi"){
			pizzaPrice=655.78;
			return pizzaPrice;
		}
		if(pizzaName=="Neapolitan"){
			pizzaPrice=388.91;
			return pizzaPrice;
		}
		if(pizzaName=="Sausage"){
			pizzaPrice=448.30;
			return pizzaPrice;
		}
		if(pizzaName=="Mayonnaise"){
			pizzaPrice=765.98;
			return pizzaPrice;
		}
		if(pizzaName=="Atum"){
			pizzaPrice=477.50;
			return pizzaPrice;
		}
		if(pizzaName=="Margherita"){
			pizzaPrice=765.36;
			return pizzaPrice;
		}
		if(pizzaName=="Avocado"){
			pizzaPrice=654.75;
			return pizzaPrice;
		}
		if(pizzaName=="Plantain"){
			pizzaPrice=667.93;
			return pizzaPrice;
		}
		if(pizzaName=="Vegetarian Hawaii"){
			pizzaPrice=534.32;
			return pizzaPrice;
		}
		if(pizzaName=="Peperoniwurst"){
			pizzaPrice=456.89;
			return pizzaPrice;
		}
		if(pizzaName=="Four Formaggi"){
			pizzaPrice=665.91;
			return pizzaPrice;
		}
		if(pizzaName=="Anchovies"){
			pizzaPrice=566.24;
			return pizzaPrice;
		}
		else{
			System.out.println(pizzaName+"is not available");
		}
		
		System.out.println("Dominos ended");
		return pizzaPrice;
	}
}