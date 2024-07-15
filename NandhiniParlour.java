class NandhiniParlour{
	public static double findProductPrice(String productName){
		double productPrice=0.0;
		System.out.println("Started");
		if(productName=="curd"){
			productPrice=23.78;
			return productPrice;
		}
		if(productName=="milk"){
			productPrice=26.89;
			return productPrice;
		}
		if(productName=="ghee"){
			productPrice=99.56;
			return productPrice;
		}
		if(productName=="butter"){
			productPrice=556.34;
			return productPrice;
		}
		if(productName=="cheese"){
			productPrice=86.12;
			return productPrice;
		}
		if(productName=="buttermilk"){
			productPrice=90.89;
			return productPrice;
		}
		if(productName=="Ice cream"){
			productPrice=49.98;
			return productPrice;
		}
		if(productName=="Fresh cream"){
			productPrice=24.90;
			return productPrice;
		}
		if(productName=="Khova"){
			productPrice=35.97;
			return productPrice;
		}
		if(productName=="Cottage cheese"){
			productPrice=45.78;
			return productPrice;
		}
		else{
			System.out.println(productName+"");
		}
		System.out.println("ended");
		return productPrice;
	}
}