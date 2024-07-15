class Zomato{
	public static double findItemPrice(String itemName){
		double itemPrice=0.0;
		System.out.println("Items Started");
		if(itemName=="Panner buttermasala"){
			itemPrice=78.28;
			return itemPrice;
		}
		if(itemName=="kadai panner"){
			itemPrice=66.90;
			return itemPrice;
		}
		if(itemName=="Matar panner"){
			itemPrice=93.25;
			return itemPrice;
		}
		if(itemName=="Roti"){
			itemPrice=37.93;
			return itemPrice;
		}
		if(itemName=="Kulcha"){
			itemPrice=10.38;
			return itemPrice;
		}
		if(itemName=="Butter nan"){
			itemPrice=64.39;
			return itemPrice;
		}
		if(itemName=="Kaju masala"){
			itemPrice=84.38;
			return itemPrice;
		}
		if(itemName=="Panner tikka"){
			itemPrice=94.78;
			return itemPrice;
		}
		if(itemName=="Mushroom fried rice"){
			itemPrice=89.97;
			return itemPrice;
		}
		if(itemName=="Veg Briyani"){
			itemPrice=99.35;
			return itemPrice;
		}
		if(itemName=="Panner fried rice"){
			itemPrice=67.26;
			return itemPrice;
		}
		if(itemName=="Mixed Veg dal"){
			itemPrice=90.23;
			return itemPrice;
		}
		if(itemName=="Dal rice"){
			itemPrice=67.39;
			return itemPrice;
		}
		if(itemName=="Ghee rice"){
			itemPrice=20.90;
			return itemPrice;
		}
		if(itemName==""){
			itemPrice=24.39;
			return itemPrice;
		}
		if(itemName=="Rajma"){
			itemPrice=90.35;
			return itemPrice;
		}
		if(itemName=="Chole bature"){
			itemPrice=44.39;
			return itemPrice;
		}
		if(itemName=="panner burji"){
			itemPrice=35.33;
			return itemPrice;
		}
		if(itemName=="hyderabadi panner"){
			itemPrice=56.46;
			return itemPrice;
		}
		if(itemName=="panner roll"){
			itemPrice=36.45;
			return itemPrice;
		}
		if(itemName=="panner 65"){
			itemPrice=89.56;
			return itemPrice;
		}
		else{
			System.out.println(itemName+"");
		}
		System.out.println("Items ended");
		return itemPrice;
	}
}