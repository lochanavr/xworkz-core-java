class JioPlans{
	
	static double rechargePrice = 0.0;
	public static double getPlanPrice(String rechargePlan){
		System.out.println("Plans started");
		
		if(rechargePlan=="2GB/day_84days")return rechargePrice=629.45;
		if(rechargePlan=="2.5GB/Day_365days")return rechargePrice=3599.90;
		if(rechargePlan=="2GB/Day_98days")return rechargePrice=999.42;
		if(rechargePlan=="2GB/Day_28days")return rechargePrice=349; 
		if(rechargePlan=="2GB/Day_84days")return rechargePrice=1299.49;
		if(rechargePlan=="2.5GB/Day_28days")return rechargePrice=399.76;
		if(rechargePlan=="1.5GB/Day_28days")return rechargePrice=329.23;
		if(rechargePlan=="1.5GB/Day_56days")return rechargePrice=579.45;
		if(rechargePlan=="1.5GB/Day_70days")return rechargePrice=666.12;
		if(rechargePlan=="1.5GB/Day_84days")return rechargePrice=799.30;
		if(rechargePlan=="1GB/Day_22days")return rechargePrice=209.36;
		if(rechargePlan=="1GB/Day_28days")return rechargePrice=249.39;
		if(rechargePlan=="3GB/Day_28days")return rechargePrice=499.24;
		if(rechargePlan=="3GB/Day_84days")return rechargePrice=1199.30;
		if(rechargePlan=="25GB_30days")return rechargePrice=355.24;

		else{
		System.out.println(rechargePlan+ " not available");
		} 
			System.out.println("Plans ended");
		return rechargePrice;
	}
	public static double rechargePrice(String rechargePlan, int quantity){
	quantity =2;
	if(rechargePlan=="25GB_30days") return rechargePrice=355.24*2;
	else{
		return rechargePrice=0.0;
	}
   }
}