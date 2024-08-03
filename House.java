class House{
	
	int houseId;
	String houseName;
	int noOfRooms;
	int noOfFloors;
	int areaInSqrt;
	int noOfMembers;


     public House(){
	System.out.println("House object is created");
}

   public House(int houseId,String houseName,int noOfRooms,int noOfFloors,int areaInSqrt,int noOfMembers){
	this.houseId = houseId;
	this.houseName = houseName;
	this.noOfRooms = noOfRooms;
	this.noOfFloors = noOfFloors;
	this.areaInSqrt = areaInSqrt;
	this.noOfMembers = noOfMembers;
}
}


