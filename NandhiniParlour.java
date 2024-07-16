class NandhiniParlour{
	static double productPrice=0.0;
	public static double findProductPrice(String productName){
		
		System.out.println("Started");
		if(productName=="curd")return productPrice=23.78;
        if(productName=="milk")return productPrice=26.89;
		if(productName=="ghee")return productPrice=99.56;
		if(productName=="butter")return productPrice=556.34;	
		if(productName=="cheese")return productPrice=86.12;			
		if(productName=="buttermilk")return productPrice=90.89;
		if(productName=="Ice cream")return productPrice=49.98;
		if(productName=="Fresh cream")return productPrice=24.90;
		if(productName=="Khova")return productPrice=35.97;
		if(productName=="Cottage cheese")return productPrice=45.78;
		else{
		System.out.println(productName+"");
		}
		System.out.println("ended");
		return productPrice;
	}
	public static double findProductPrice(String productName, int quantity){
	quantity =4;
	if(productName=="Khova") return productPrice=35.97*4;
	else{
		return productPrice=0.0;
	}
   }
}