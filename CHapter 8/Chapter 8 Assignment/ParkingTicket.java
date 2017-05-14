public class ParkingTicket {
    
    //Making a refrence
    private ParkedCar carPs;
    
    private PoliceOfficer policePs;
    
    private ParkingMeter parkedMS;
    
    

    
    public ParkingTicket(ParkedCar a, PoliceOfficer b, ParkingMeter c){
        this.carPs=a;
        this.policePs=b;
        this.parkedMS=c;

    }
    
      public String toString() {
            return "The fine is " +  policePs.getCalculatedFine(carPs,parkedMS)  + ". From officer " + policePs.getcopName() + " badge number " + policePs.getbadgeNum()
                    + ". The car make, model, color, and licinse number is " + carPs.getMake() +", " + carPs.getModel() + ", " +
                    carPs.getColor() + ", " + carPs.getLicenseNum() + ".";
        }
}
