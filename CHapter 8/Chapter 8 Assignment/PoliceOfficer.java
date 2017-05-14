public class PoliceOfficer{
       
    private String copName;
    private double badgeNum;
    private double boughtTime;
    private double totalTime;
    

    public PoliceOfficer(String copName, double badgeNum){

    this.copName = copName;
    this.badgeNum = badgeNum;
    

    }
    
    
    //cops name
    public String getcopName()
    {

       return this.copName;
    }
    
    //bagde number
    public double getbadgeNum()
    {

        return this.badgeNum;
    }
    

    
  //Finds if the car has overstayed parking
    public double getCalculatedFine (ParkedCar carStuff, ParkingMeter parkingstuff){
        
        double totalFine;
        
        double totalIlligalM;
        
        totalIlligalM = carStuff.getHour() -  parkingstuff.getboughtTime();
        
        totalFine =  (totalIlligalM- 1)* 10 + Math.round((totalIlligalM + 99) / 100 ) * 25;
        
        return totalFine;
    }
    
}
