class SangeethaMobiles{
	static double mobilePrice=0.0;
	public static double findMobilePhone(String mobileName){
		
		System.out.println("Mobile phone Started");
		if(mobileName=="oppo")return mobilePrice=12457.98;
		if(mobileName=="vivo")return mobilePrice=23899.45;
		if(mobileName=="Samsung")return mobilePrice=211357.90;
		if(mobileName=="oneplus")return mobilePrice=56778.95;
		if(mobileName=="Apple")return mobilePrice=13456.88;
		if(mobileName=="Realme")return mobilePrice=67899.34;
		if(mobileName=="Xiaomi")return mobilePrice=98654.34;
		if(mobileName=="Nokia")return mobilePrice=23348.09;
		if(mobileName=="Motorola")return mobilePrice=56788.29;
		if(mobileName=="Tecno")return mobilePrice=16789.34;
		if(mobileName=="Honor")return mobilePrice=67894.56;
		if(mobileName=="Huawei")return mobilePrice=45567.34;
		if(mobileName=="Poco")return mobilePrice=87654.26;
		if(mobileName=="Sony")return mobilePrice=98776.24;
		if(mobileName=="LG")return mobilePrice=78930.24;
	
		else{
			System.out.println(mobileName+ " is not available");
		}
		System.out.println("Mobile phone ended");
		return mobilePrice;
	}
	public static double findMobilePhone(String mobileName, int quantity){
	quantity =2;
	if(mobileName=="LG") return mobilePrice=78930.24*2;
	else{
		return mobilePrice=0.0;
	}
   }
}