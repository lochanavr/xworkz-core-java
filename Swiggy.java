class Swiggy{
	public static double findFoodPrice(String foodName){
		double foodPrice=0.0;
		System.out.println("Food Started");
		if(foodName=="Dosa"){
			foodPrice=30.45;
			return foodPrice;
		}
		if(foodName=="idly"){
			foodPrice=40.24;
			return foodPrice;
		}
		if(foodName=="puri"){
			foodPrice=56.34;
			return foodPrice;
		}
		if(foodName=="rave idly"){
			foodPrice=89.12;
			return foodPrice;
		}
		if(foodName=="onion dosa"){
			foodPrice=90.23;
			return foodPrice;
		}
		if(foodName=="vangi bhat"){
			foodPrice=45.67;
			return foodPrice;
		}
		if(foodName=="rice bhat"){
			foodPrice=89.76;
			return foodPrice;
		}
		if(foodName=="khara bhat"){
			foodPrice=56.32;
			return foodPrice;
		}
		if(foodName=="Masala Dosa"){
			foodPrice=78.23;
			return foodPrice;
		}
		if(foodName=="Pongal"){
			foodPrice=24.23;
			return foodPrice;
		}
		if(foodName=="set dosa"){
			foodPrice=90.34;
			return foodPrice;
		}
		if(foodName=="Mangalore buns"){
			foodPrice=76.34;
			return foodPrice;
		}
		if(foodName=="Vade"){
			foodPrice=89.67;
			return foodPrice;
		}
		if(foodName=="Poho"){
			foodPrice=23.45;
			return foodPrice;
		}
		if(foodName=="Lemon rice"){
			foodPrice=78.34;
			return foodPrice;
		}
		if(foodName=="chow chow bhat"){
			foodPrice=35.24;
			return foodPrice;
		}
		if(foodName=="Dal kichidi"){
			foodPrice=89.26;
			return foodPrice;
		}
		if(foodName=="Puliyogare"){
			foodPrice=67.46;
			return foodPrice;
		}
		if(foodName=="Tomato bhat"){
			foodPrice=56.89;
			return foodPrice;
		}
		if(foodName=="biselbele bhat"){
			foodPrice=38.28;
			return foodPrice;
		}
		else{
			System.out.println(foodName+" is not available");
		}
		
		System.out.println("Food ended");
		return foodPrice;
	}
}