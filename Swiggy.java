class Swiggy{
	
static double foodPrice=0.0;
     public static double search(String foodName){
	 //"pizza"=="pizza"
	 System.out.println("Swiggy started");
	 
	 if(foodName=="Dosa") return foodPrice=30.45;
	 if(foodName=="idly") return foodPrice=40.24;
	 if(foodName=="puri") return foodPrice=56.34;
	 if(foodName=="rave idly") return foodPrice=89.12;
	if(foodName=="onion dosa") return foodPrice=90.23;
	if(foodName=="vangi bhat") return foodPrice=45.67;
	if(foodName=="rice bhat")  return foodPrice=89.76;
	if(foodName=="khara bhat") return foodPrice=56.32;
	if(foodName=="Masala Dosa") return foodPrice=78.23;
	if(foodName=="Pongal") return foodPrice=24.23;
	if(foodName=="set dosa") return foodPrice=90.34;
	if(foodName=="Mangalore buns") return foodPrice=76.34;
	if(foodName=="Vade") return foodPrice=89.67;
	if(foodName=="Poho") return foodPrice=23.45;
	if(foodName=="Lemon rice") return foodPrice=78.34;
	if(foodName=="chow chow bhat") return foodPrice=35.24;
	if(foodName=="Dal kichidi") return foodPrice=89.26;
	if(foodName=="Puliyogare") return foodPrice=67.46;
	if(foodName=="Tomato bhat") return foodPrice=56.89;
	if(foodName=="biselbele bhat") return foodPrice=38.28;
	
	 else 
		System.out.println(foodName+" is not available");
	 System.out.println("Food ended");
		return 0.0;
	 }

public static double search(String foodName, int quantity){
	quantity =2;
	if(foodName=="idly") return foodPrice=40.24*2;
	else{
		return foodPrice=0.0;
	}
   }
}
