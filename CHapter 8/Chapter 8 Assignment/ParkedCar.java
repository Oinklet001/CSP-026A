public class ParkedCar {
     private String make;
        private String model;
        private String color;
        private double licenseNum;
        private double hour;


        //constructor
        public ParkedCar(String make, String model, String color, double licenseNum, double hour){

        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNum = licenseNum;
        this.hour = hour;

        }
        

          public String getMake()
          {

          return make;
          }
        
        

           public String getModel()
           {

           return model;

           }

           public String getColor()
           {

           return color;

           }


           public double getLicenseNum()
           {

           return licenseNum;

           }

           public double getHour()
           {

           return hour;

           }


}
