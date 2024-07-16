class FoodPanda{
	static double menuPrice=0.0;
	public static double findMenuPrice(String menuName){
		
		System.out.println("Menu Started");
		if(menuName=="Nippat masala")return menuPrice=98.45;
		if(menuName=="pani puri")return menuPrice=24.42;
		if(menuName=="dahi puri")return menuPrice=56.35;
		if(menuName=="masala puri")return menuPrice=89.45;
		if(menuName=="floating pani puri")return menuPrice=27.39;
		if(menuName=="Sev puri")return menuPrice=89.35;
		if(menuName=="Bhel puri")return menuPrice=90.12;
		if(menuName=="Vada pav")return menuPrice=88.35;
		if(menuName=="French fries")return menuPrice=90.25;
		if(menuName=="Noodles")return menuPrice=67.98;
		if(menuName=="Gobi dry")return menuPrice=87.25;
		if(menuName=="Gobi manchurian")return menuPrice=48.24;
		if(menuName=="Dahi vada")return menuPrice=14.46;
		if(menuName=="Pav bhaji")return menuPrice=89.86;
		if(menuName=="Potato twister")return menuPrice=58.50;
		if(menuName=="gobi 65")return menuPrice=23.67;
		if(menuName=="Gobi pepper dry")return menuPrice=76.23;
		if(menuName=="Aloo chat")return menuPrice=98.35;
		if(menuName=="Khachori")return menuPrice=35.78;
		if(menuName=="Maggi")return menuPrice=67.90;
		else{
			System.out.println(menuName+"is not available");
		}
		System.out.println("Menu ended");
		return menuPrice;
	}
	public static double findMenuPrice(String menuName, int quantity){
	quantity =2;
	if(menuName=="Maggi") return menuPrice=40.24*2;
	else{
		return menuPrice=0.0;
	}
   }
}