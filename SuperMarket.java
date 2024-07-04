//super market(15)//

class SuperMarket{
  
  public static void main(String bigday[]){
 
  String vegetables[]={"carrot","beetroot","beans","potato","onion","garlic","ginger","brinjal","lady's finger","Drum stick","cabbage","cauliflower","drum stick","spinach","bitter groud"};
  String fruits[]={"Mango","apple","orange","pomogranate","dragon fruit","butter fruit","grapes","kiwi","jack fruit","watermelon","papaya","muskmelon","blueberry","strawberry","Banana"};
  String cosmetics[]={"face cream","toner","cleanser","serum","face wash","compact powder","nail polish","foundation","strobe cream","night cream","body wash","lipstick","kajal","eyeliner","mascara","facemask"};
  String snacks[]={"biscuit", "juice" , "lays" , "chips" , "popcorn" , "kukure" , "parle" , "samosa" , "pani puri" , "vada pav" , "noodles" , "maggi" , "fries" , "potato twister" , "masala puri"};
  String perfumes[]={"dior", "channel" , "rexon" , "nivea" , "lux" , "yardley" , "carlton london" , "bella vita" , "skinn" , "rasasi blue lady" , "renee bloom" , "nykaa" , "sun-kissed" , "warm and spicy" , "timeless appeal"};
  String clothes[]={"T-shirt", "shirt" , "pant" , "kurta" , "kurta set" , "A line tops" , "crop top" , "shorts" , "skirts" , "jeans" , "salwar" , "saree" , "pyjama" , "dhoti" , "maxi dress"};
  String footWares[]={"sandals", "flats" , "flipflop" , "sneakers" , "casual shoes" , "shoes" , "ballerian" , "sport shoes" , "high heels" , "crocs" , "loafer" , "boot shoes" , "block heel" , "skate shoes" , "hiking shoes"};
  String groceries[]={"udar dal", "moong dal" , "wheat" , "ragi" , "rice" , "quinaa" , "pasta" , "mustard" , "cloves" , "sesame" , "jaggery" , "sugar" , "coffee powder" , "toor dal" , "chana dal"};
  String cookWares[]={"fry pan", "cast-iron cookWares" , "wok" , "casserole" , "cutting board" , "spatula" , "grill pan" , "pot" , "whisk" , "mmeasuring cup" , "sauce pan" , "colander" , "muffin tin" , "dutch oven" , "cooker"};
  String iceCreams[]={"vanilla cup icecream", "chocobar" , "butter scotch" , "chocolate dip" , "blueberry icecream" , "candy" , "kulfi" , "pistachio icecream" , "raisin rum icecream" , "strawberry icecream" , "rose icecream" , "tutti frutii icecream" , "softy" , "bananas foster" , "blue moon"};
  String dairyProducts[]={"milk", "butter milk" , "cheese" , "curd" , "ghee" , "lassi" , "cheese" , "custard" , "chocolate" , "yogurt" , "icecream" , "panner" , "butter" , "cream" , "condensed milk"};
  String cleaningProducts[]={"window cleaner", "joy" , "Floor cleaner" , "bleach" , "Duster" , "vacuum" , "cleaner" , "disinfectant" , "brooms" , "furniture polishes" , "white vinegar" , "mop" , "cleaning wipes" , "mop" , "cleaning brushes"};
  String babyProducts[]={"infant clothing", "feeding bottles" , "diapering" , "support pillow" , "car seat" , "formula" , "baby carrier" , "diaper rash cream" , "diaper" , "baby monitoring" , "changing mat" , "baby blanket" , "stroller" , "baby medicine" , "breast pump"};
  /*String frozenProducts[]={"Aloo paratha", "french fries" , "potato bites" , "Ajwain paratha" , "potato smile" , "cheese bites" , "" , "" , "" , "" , "" , "" , "" , "" , ""};
  String careProducts[]={"", "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , ""};*/
  
  //method : execute statements (SOP)//
  
  System.out.println("*****************************************");  
  System.out.println("SuperMarket started");
  System.out.println("*****************************************");
  System.out.println("List of vegetables:");
  System.out.println("---------------------------------");
  for(String vegies:vegetables){
	  System.out.println(vegies);
  }
  //System.out.println(vegetables[0]+"\n"+vegetables[1]+"\n"+vegetables[2]+"\n"+vegetables[3]+"\n"+vegetables[4]+"\n"+vegetables[5]+"\n"+vegetables[6]+"\n"+vegetables[7]+"\n"+vegetables[8]+"\n"+vegetables[9]+"\n"+vegetables[10]+"\n"+vegetables[11]+"\n"+vegetables[12]+"\n"+vegetables[13]+"\n"+vegetables[14]);
  System.out.println("-------------------------------");
  System.out.println("List of fruits:");
  System.out.println("---------------------------------");
  for(String fruit:fruits){
	  System.out.println(fruit);
  }
  //System.out.println(fruits[0]+"\n"+fruits[1]+"\n"+fruits[1]+"\n"+fruits[2]+"\n"+fruits[3]+"\n"+fruits[4]+"\n"+fruits[5]+"\n"+fruits[6]+"\n"+fruits[7]+"\n"+fruits[8]+"\n"+fruits[9]+"\n"+fruits[10]+"\n"+fruits[11]+"\n"+fruits[12]+"\n"+fruits[13]+"\n"+fruits[14]);
  System.out.println("-------------------------------");
  System.out.println("List of cosmetics:");
  System.out.println("-------------------------------");
  for(String cosmetic:cosmetics){
	  System.out.println(cosmetic);
  }
  //System.out.println(cosmetics[0]+"\n"+cosmetics[1]+"\n"+cosmetics[2]+"\n"+cosmetics[3]+"\n"+cosmetics[4]+"\n"+cosmetics[5]+"\n"+cosmetics[6]+"\n"+cosmetics[7]+"\n"+cosmetics[8]+"\n"+cosmetics[9]+"\n"+cosmetics[10]+"\n"+cosmetics[11]+"\n"+cosmetics[12]+"\n"+cosmetics[13]+"\n"+cosmetics[14]);
  System.out.println("-------------------------------");
  System.out.println("List of snacks:");
  System.out.println("---------------------------------");
  for(String snack:snacks){
	  System.out.println(snack);
  }
  //System.out.println(snacks[0]+"\n"+snacks[1]+"\n"+snacks[2]+"\n"+snacks[3]+"\n"+snacks[4]+"\n"+snacks[5]+"\n"+snacks[6]+"\n"+snacks[6]+"\n"+snacks[7]+"\n"+snacks[8]+"\n"+snacks[9]+"\n"+snacks[10]+"\n"+snacks[11]+"\n"+snacks[12]+"\n"+snacks[13]+"\n"+snacks[14]);
  System.out.println("-------------------------------");
  System.out.println("List of perfumes:");
  System.out.println("----------------------------------");
  for(String perfume:perfumes){
	  System.out.println(perfume);
  }
  //System.out.println(perfumes[0]+"\n"+perfumes[1]+"\n"+perfumes[2]+"\n"+perfumes[3]+"\n"+perfumes[4]+"\n"+perfumes[5]+"\n"+perfumes[6]+"\n"+perfumes[7]+"\n"+perfumes[8]+"\n"+perfumes[9]+"\n"+perfumes[10]+"\n"+perfumes[11]+"\n"+perfumes[12]+"\n"+perfumes[13]+"\n"+perfumes[14]);
  System.out.println("-------------------------------");
  System.out.println("List of clothes:");
  System.out.println("-----------------------------------");
  for(String cloth:clothes){
	  System.out.println(cloth);
  }
  //System.out.println(clothes[0]+"\n"+clothes[1]+"\n"+clothes[2]+"\n"+clothes[3]+"\n"+clothes[4]+"\n"+clothes[5]+"\n"+clothes[6]+"\n"+clothes[7]+"\n"+clothes[8]+"\n"+clothes[9]+"\n"+clothes[10]+"\n"+clothes[11]+"\n"+clothes[12]+"\n"+clothes[13]+"\n"+clothes[14]);
  System.out.println("-------------------------------");
  System.out.println("List of footWare:");
  System.out.println("-----------------------------------");
  for(String shoes:footWares){
	  System.out.println(shoes);
  }
  //System.out.println(footWare[0]+"\n"+footWare[1]+"\n"+footWare[2]+"\n"+footWare[3]+"\n"+footWare[4]+"\n"+footWare[5]+"\n"+footWare[6]+"\n"+footWare[7]+"\n"+footWare[8]+"\n"+footWare[9]+"\n"+footWare[10]+"\n"+footWare[11]+"\n"+footWare[12]+"\n"+footWare[13]+"\n"+footWare[14]);
  System.out.println("-------------------------------");
  System.out.println("List of groceries:");
  System.out.println("------------------------------------");
  for(String grocery : groceries){
	  System.out.println(grocery);
  }
  //System.out.println(groceries[0]+"\n"+groceries[1]+"\n"+groceries[2]+"\n"+groceries[3]+"\n"+groceries[4]+"\n"+groceries[5]+"\n"+groceries[6]+"\n"+groceries[7]+"\n"+groceries[8]+"\n"+groceries[9]+"\n"+groceries[10]+"\n"+groceries[11]+"\n"+groceries[12]+"\n"+groceries[13]);
  System.out.println("-------------------------------");
  System.out.println("List of cookWares:");
  System.out.println("-------------------------------------");
  for(String cookware:cookWares){
	  System.out.println(cookware);
  }
  //System.out.println(cookWares[0]+"\n"+cookWares[1]+"\n"+cookWares[2]+"\n"+cookWares[3]+"\n"+cookWares[4]+"\n"+cookWares[5]+"\n"+cookWares[6]+"\n"+cookWares[7]+"\n"+cookWares[8]+"\n"+cookWares[9]+"\n"+cookWares[10]+"\n"+cookWares[11]+"\n"+cookWares[12]+"\n"+cookWares[13]);
  System.out.println("-------------------------------");
  System.out.println("List of iceCream:");
  System.out.println("--------------------------------------");
  for(String icecream:iceCreams){
	  System.out.println(icecream);
  }
  //System.out.println(iceCream[0]+"\n"+iceCream[1]+"\n"+iceCream[2]+"\n"+iceCream[3]+"\n"+iceCream[4]+"\n"+iceCream[5]+"\n"+iceCream[6]+"\n"+iceCream[7]+"\n"+iceCream[8]+"\n"+iceCream[9]+"\n"+iceCream[10]+"\n"+iceCream[11]+"\n"+iceCream[12]+"\n"+iceCream[13]);
  System.out.println("-------------------------------");
  System.out.println("List of dairyProducts:");
  System.out.println("--------------------------------------");
  for(String dairyproduct:dairyProducts){
	  System.out.println(dairyproduct);
  }
  //System.out.println(dairyProducts[0]+"\n"+dairyProducts[1]+"\n"+dairyProducts[2]+"\n"+dairyProducts[3]+"\n"+dairyProducts[4]+"\n"+dairyProducts[5]+"\n"+dairyProducts[6]+"\n"+dairyProducts[7]+"\n"+dairyProducts[8]+"\n"+dairyProducts[9]+"\n"+dairyProducts[10]+"\n"+dairyProducts[11]+"\n"+dairyProducts[12]+"\n"+dairyProducts[13]);
   System.out.println("-------------------------------");
   System.out.println("List of cleaningProducts:");
   System.out.println("-------------------------------------");
   for(String cleaningproduct: cleaningProducts){
	   System.out.println(cleaningproduct);
   }
   //System.out.println(cleaningProducts[0]+"\n"+dairyProducts[1]+"\n"+dairyProducts[2]+"\n"+dairyProducts[3]+"\n"+dairyProducts[4]+"\n"+dairyProducts[5]+"\n"+dairyProducts[6]+"\n"+dairyProducts[7]+"\n"+dairyProducts[8]+"\n"+dairyProducts[9]+"\n"+dairyProducts[10]+"\n"+dairyProducts[11]+"\n"+dairyProducts[12]+"\n"+dairyProducts[13]);
   System.out.println("-------------------------------");
   System.out.println("List of babyProducts:");
   System.out.println("-------------------------------------");
   for(String babyproduct:babyProducts){
	   System.out.println(babyproduct);
   }
   //System.out.println(babyProducts[0]+"\n"+babyProducts[1]+"\n"+babyProducts[2]+"\n"+babyProducts[3]+"\n"+babyProducts[4]+"\n"+babyProducts[5]+"\n"+babyProducts[6]+"\n"+babyProducts[7]+"\n"+babyProducts[8]+"\n"+babyProducts[9]+"\n"+babyProducts[10]+"\n"+babyProducts[11]+"\n"+babyProducts[12]+"\n"+babyProducts[13]);
   /*System.out.println("-------------------------------");
    System.out.println("List of frozenProducts:");
	System.out.println("-------------------------------");
	System.out.println(frozenProducts[0]+"\n"+frozenProducts[1]+"\n"+frozenProducts[2]+"\n"+frozenProducts[3]+"\n"+frozenProducts[4]+"\n"+frozenProducts[5]+"\n"+frozenProducts[6]+"\n"+frozenProducts[7]+"\n"+frozenProducts[8]+"\n"+frozenProducts[9]+"\n"+frozenProducts[10]+"\n"+frozenProducts[11]+"\n"+frozenProducts[12]+"\n"+frozenProducts[13]);
	System.out.println("-----------------------------------");
	System.out.println("List of careProducts:");
	System.out.println("-----------------------------------");
	//System.out.println(careProducts[0]+"\n"+careProducts[1]+"\n"+careProducts[2]+"\n"+careProducts[3]+"\n"+careProducts[4]+"\n"+careProducts[5]+"\n"+careProducts[6]+"\n"+careProducts[7]+"\n"+careProducts[8]+"\n"+careProducts[9]+"\n"+careProducts[10]+"\n"+careProducts[11]+"\n"+careProducts[12]+"\n"+careProducts[13]);*/
	 
  System.out.println("*************************************");  
  System.out.println("SuperMarket ended");
  System.out.println("*****************************************");
  
  }
}
