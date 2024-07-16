class Zomato{
	static double itemPrice=0.0;
	public static double findItemPrice(String itemName){
		
		System.out.println("Items Started");
		if(itemName=="Panner buttermasala")return itemPrice=78.28;
		if(itemName=="kadai panner")return itemPrice=66.90;
		if(itemName=="Matar panner")return itemPrice=93.25;
		if(itemName=="Roti")return itemPrice=37.93;
		if(itemName=="Kulcha")return itemPrice=10.38;
		if(itemName=="Butter nan")return itemPrice=64.39;
		if(itemName=="Kaju masala")return itemPrice=84.38;
		if(itemName=="Panner tikka")return itemPrice=94.78;
		if(itemName=="Mushroom fried rice")return itemPrice=89.97;
		if(itemName=="Veg Briyani")return itemPrice=67.26;
		if(itemName=="Panner fried rice")return itemPrice=67.26;
		if(itemName=="Mixed Veg dal")return itemPrice=90.23;
		if(itemName=="Dal rice")return itemPrice=67.39;
		if(itemName=="Ghee rice")return itemPrice=20.90;
		if(itemName=="")return itemPrice=24.39;
		if(itemName=="Rajma")return itemPrice=90.35;
		if(itemName=="Chole bature")return itemPrice=44.39;
		if(itemName=="panner burji")return itemPrice=35.33;
		if(itemName=="hyderabadi panner")return itemPrice=56.46;
		if(itemName=="panner roll")return itemPrice=36.45;	
		if(itemName=="panner 65")return itemPrice=89.56;
		
		else{
			System.out.println(itemName+"");
		}
		System.out.println("Items ended");
		return itemPrice;
	}
	public static double findItemPrice(String itemName, int quantity){
	quantity =2;
	if(itemName=="panner 65") return itemPrice=40.24*2;
	else{
		return itemPrice=0.0;
	}
   }
}