class JioPlansRunner{
	
	public static void main(String[]rechargeplans){
      System.out.println("Main started");
	   
	   String rechargePlan = "25GB_30days";
	  double rechargePrice = JioPlans.rechargePrice(rechargePlan,2);
	  System.out.println("The price of the recharge plan is "+ rechargePrice);
	  System.out.println("Main ended");
}
}