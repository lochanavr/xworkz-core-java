
class Maggi{
    public static void main(String[]tasty){
	
	String name = "Maggi";
	int priceInRs = 12;
	int qtyInGrms = 50;
	String expDate = "24/09/2024";
	String countryOfOrigin = "India";
    String shelfLife = "8 months";
	
	String ingredients[] = {"Maida","Palm oil","Iodised salt","Wheat gluten","Thickeners","Acidity Regulators","Humectant"};
	System.out.println("----------------------");
	System.out.println("main started");
	System.out.println("----------------------");
	System.out.println("Details of " +name);
	System.out.println("the price of "+name+ " is : " + priceInRs);
	System.out.println("Quantity of "+ name + " is :"+ qtyInGrms);
	System.out.println("Expire date of the quantity is: "+ expDate);
	System.out.println("Country of Origin is"+ countryOfOrigin);
	System.out.println("Shelf Life of "+ name + "is :" + shelfLife);
	System.out.println("---------------------------------");
	System.out.println("Ingredients present in "+ name + " are :");
	System.out.println("----------------------");
	for(String ingredient : ingredients){
		System.out.println(ingredient + ",");
	}
	System.out.println("----------------------");
		System.out.println("main ended");
		System.out.println("----------------------");
	}

}