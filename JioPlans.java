class JioPlans{
	
	public static double getPlanPrice(String rechargePlan){
		double rechargePrice = 0.0;
		
		System.out.println("Plans started");
		
		if(rechargePlan=="2GB/day_84days"){
			rechargePrice=629.45;
			return rechargePrice;
		}
		if(rechargePlan=="2.5GB/Day_365days"){
			rechargePrice=3599.90;
			return rechargePrice;
		}
		if(rechargePlan=="2GB/Day_98days"){
			rechargePrice=999.42;
			return rechargePrice;
		}
		if(rechargePlan=="2GB/Day_28days"){
			rechargePrice=349;
			return rechargePrice;
		}
		if(rechargePlan=="2GB/Day_84days"){
			rechargePrice=1299.49;
		return rechargePrice;
		}
		if(rechargePlan=="2.5GB/Day_28days"){
			rechargePrice=399.76;
		return rechargePrice;
		}
		if(rechargePlan=="1.5GB/Day_28days"){
			rechargePrice=329.23;
		return rechargePrice;
		}
		if(rechargePlan=="1.5GB/Day_56days"){
			rechargePrice=579.45;
		return rechargePrice;
		}
		if(rechargePlan=="1.5GB/Day_70days"){
			rechargePrice=666.12;
		return rechargePrice;
		}
		if(rechargePlan=="1.5GB/Day_84days"){
			rechargePrice=799.30;
		return rechargePrice;
		}
		if(rechargePlan=="1GB/Day_22days"){
			rechargePrice=209.36;
		return rechargePrice;
		}
		if(rechargePlan=="1GB/Day_28days"){
			rechargePrice=249.39;
		return rechargePrice;
		}
		if(rechargePlan=="3GB/Day_28days"){
			rechargePrice=499.24;
		return rechargePrice;
		}
		if(rechargePlan=="3GB/Day_84days"){
			rechargePrice=1199.30;
		return rechargePrice;
		}
		if(rechargePlan=="25GB_30days"){
			rechargePrice=355.24;
		return rechargePrice;
		}
		else{
		System.out.println(rechargePlan+ " not available");
		} 
			System.out.println("Plans ended");
		
		return rechargePrice;
	}
}