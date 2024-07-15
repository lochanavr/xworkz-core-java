class SangeethaMobiles{
	
	public static double findMobilePhone(String mobileName){
		double mobilePrice=0.0;
		
		System.out.println("Mobile phone Started");
		if(mobileName=="oppo"){
			mobilePrice=12457.98;
			return mobilePrice;
		}
		if(mobileName=="vivo"){
			mobilePrice=23899.45;
			return mobilePrice;
		}
		if(mobileName=="Samsung"){
			mobilePrice=211357.90;
			return mobilePrice;
		}
		if(mobileName=="oneplus"){
			mobilePrice=56778.95;
			return mobilePrice;
		}
		if(mobileName=="Apple"){
			mobilePrice=13456.88;
			return mobilePrice;
		}
		if(mobileName=="Realme"){
			mobilePrice=67899.34;
			return mobilePrice;
		}
		if(mobileName=="Xiaomi"){
			mobilePrice=98654.34;
			return mobilePrice;
		}
		if(mobileName=="Nokia"){
			mobilePrice=23348.09;
			return mobilePrice;
		}
		if(mobileName=="Motorola"){
			mobilePrice=56788.29;
			return mobilePrice;
		}
		if(mobileName=="Tecno"){
			mobilePrice=16789.34;
			return mobilePrice;
		}
		if(mobileName=="Honor"){
			mobilePrice=67894.56;
			return mobilePrice;
		}
		if(mobileName=="Huawei"){
			mobilePrice=45567.34;
			return mobilePrice;
		}
		if(mobileName=="Poco"){
			mobilePrice=87654.26;
			return mobilePrice;
		}
		if(mobileName=="Sony"){
			mobilePrice=98776.24;
			return mobilePrice;
		}
		if(mobileName=="LG"){
			mobilePrice=78930.24;
			return mobilePrice;
		}
		else{
			System.out.println(mobileName+ " is not available");
		}
		System.out.println("Mobile phone ended");
		return mobilePrice;
	}
}