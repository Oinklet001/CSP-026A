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
    

    
  //Finds if the fine of the car and determines if it overstayed.
    public double getCalculatedFine (ParkedCar carStuff, ParkingMeter parkingstuff){
        
        double totalFine;
        
        double totalIlligalM;
        
        totalIlligalM = carStuff.getHour() -  parkingstuff.getboughtTime();
        
        totalFine =  (totalIlligalM- 1)* 10 + Math.round((totalIlligalM + 99) / 100 ) * 25;
        
        if (totalFine > 0){
        
        return totalFine;
        
        }else{
        
        return 0;
        }
    }
    
}

    
