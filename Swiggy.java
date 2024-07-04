class Swiggy{

public static void main(String[]swiggy){

      
	  String nonVegStarter[]={"chicken kabab" , "garli kabab" , "chicken fry" , "chilli chicken" , "chicken chops" , "chicken lolipop" , "chicken pepper fry" , "mutoon fry " , "chicken ghee roast" , "fish fry"};
	  String vegStarter[]={"gobi 65" , "mushroom tikka" , "panner 65" , "babycorn manuchruian" , "gobi manuchruian" , "veg cutlet" , "panner cutlet" , "mushroom manuchruian" , "salad" , "panner tikka"};
	  String nonVegMainCourse[]={"chicken briyani" , "mutton briyani" , "chicken butter masala" , "chicken kolhapuri" , "mutton masala" , "mutton kurma" , "chicken fry" , "chicken handi" , "grill chicken" , "chicken gravy"};
	  String vegMainCourse[]={"veg briyani" , "panner briyani" , "mushroom briyani" , "babycorn briyani" , "kadai panner" , "panner butter masala" , "dal fry" , "ghee rice" , "dal rice" , "butternan"};
	  
	  System.out.println("*********************");
	  System.out.println("swiggy foood menu started");
	  System.out.println("--------------------------");
	  System.out.println("nonvegstarter");
	  System.out.println("--------------------------");
	  for(String nonvegstarter : nonVegStarter ){
		  System.out.println(nonvegstarter);
	  }
	  //System.out.println(nonVegStarter[0]+"\n"+nonVegStarter[1]+"\n"+nonVegStarter[2]+"\n"+nonVegStarter[3]+"\n"+nonVegStarter[4]+"\n"+nonVegStarter[5]+"\n"+nonVegStarter[6]+"\n"+nonVegStarter[7]+"\n"+nonVegStarter[8]+"\n"+nonVegStarter[9]);
	  System.out.println("--------------------------");
	  System.out.println("vegstarter");
	  System.out.println("--------------------------");
	  for(String vegstarter: vegStarter){
		  System.out.println(vegstarter);
	  }
	  //System.out.println(vegStarter[0]+"\n"+vegStarter[1]+"\n"+vegStarter[2]+"\n"+vegStarter[3]+"\n"+vegStarter[4]+"\n"+vegStarter[5]+"\n"+vegStarter[6]+"\n"+vegStarter[7]+"\n"+vegStarter[8]+"\n"+vegStarter[9]);
	  System.out.println("--------------------------");
	  System.out.println("nonvegmaincourse");
	  System.out.println("--------------------------");
	  for(String nonvegmaincourse:nonVegMainCourse){
		  System.out.println(nonvegmaincourse);
	  }
	  //System.out.println(nonVegMainCourse[0]+"\n"+nonVegMainCourse[1]+"\n"+nonVegMainCourse[2]+"\n"+nonVegMainCourse[3]+"\n"+nonVegMainCourse[4]+"\n"+nonVegMainCourse[5]+"\n"+nonVegMainCourse[6]+"\n"+nonVegMainCourse[7]+"\n"+nonVegMainCourse[8]+"\n"+nonVegMainCourse[9]);
	  System.out.println("--------------------------");
	  System.out.println("vegmaincourse");
	  System.out.println("--------------------------");
	  for(String vegMeals:vegMainCourse){
		  System.out.println(vegMeals);
	  }
	  //System.out.println(vegMainCourse[0]+"\n"+vegMainCourse[1]+"\n"+vegMainCourse[2]+"\n"+vegMainCourse[3]+"\n"+vegMainCourse[4]+"\n"+vegMainCourse[5]+"\n"+vegMainCourse[6]+"\n"+vegMainCourse[7]+"\n"+vegMainCourse[8]+"\n"+vegMainCourse[9]);
	  System.out.println("--------------------------");
	  System.out.println("swiggy foood menu ended");
}
}