class Country{
	
	int countryId;
	String countryName;
	int noOfStates;
	String primeMinister;
	String population;
	
	public Country(){
		System.out.println("Country object is created");
	}
	
	public Country(int countryId,String countryName,int noOfStates,String primeMinister,String population){
	this.countryId=countryId;
	this.countryName=countryName;
	this.noOfStates=noOfStates;
	this.primeMinister=primeMinister;
	this.population=population;
	}
}