class JioPlansRunner{
	
	public static void main(String[]rechargeplans){
      System.out.println("Main started");
	   
	   String rechargePlan = "2GB/Day_84days";
	  double getPlanPrice = JioPlans.getPlanPrice(rechargePlan);
	  System.out.println("The price of the recharge plan is "+ getPlanPrice);
	  System.out.println("Main ended");
}
}