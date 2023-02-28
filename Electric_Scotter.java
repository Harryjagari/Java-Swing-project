
/**
 * The Electric_Scotter class which extends Vehicle has eight attributes:Range,Battery_Capacity,
 * Price,Charging_time,Brand,Mileage,haspurchased,hassold.
 * The constructors accepts six parameters.The values of these parameters are assigned 
 * the corressponding parameter values.Each attribute has a corresponding accessor method.
 * There is setters method for Brand which accepts Brand as parameter.
 * There is a method purchase which accepts Parameters:Brand,Price,Charging_time,
 * Mileage,Range.There is a  method sell which accepts Parameters:Price.There is a
 * display method which calls the constructor of vehicle class with parameters: Vehicle ID, Vehicle name,
 * Vehicle weight,vehicle color, and Vehicle speed.If scotter is already purchased  then brand, 
 * battery capacity, mileage, range, and recharge time must also be displayed.
 *
 * @author (Harendra Jagari)
 * @version (18)
 */
public class Electric_Scotter extends Vehicle
{
   // A variable:Range is declared with int data type
   private int Range;
   // A variable:Battery_Capacity is declared with int data type
   private int Battery_Capacity;
   // A variable:Price is declared with int data type
   private int Price;
   // A variable:Charging_time is declared with String data type
   private String Charging_time;
   // A variable:Brand is declared with String data type
   private String Brand;
   // A variable:Mileage is declared with String data type
   private String Mileage;
   // A variable:haspurchased is declared with boolean data type
   private boolean haspurchased;
   // A variable:hassold is declared with boolean data type
   private boolean hassold; 
/*
 * The constructor accepts six parameters:vehicleid,vehiclename,vehicleweight,vehiclespeed,vehiclecolor,Battery_Capacity
 *The values of these parameters are initialized in instance variables:vehicleid,vehiclename,vehicleweight,
 *vehiclespeed,vehiclecolor,Battery_Capacity
 */  
    public Electric_Scotter(int vehicleid,String vehiclename,String vehicleweight,String vehiclespeed,String vehiclecolor,int Battery_Capacity)
   {
    super(vehiclename,vehicleweight,vehiclecolor,vehicleid);
    this.Battery_Capacity=Battery_Capacity;
    super.set_vehiclespeed(vehiclespeed);
    super.set_vehiclecolor(vehiclecolor);
    this.Range=0;
    this.Price=0;
    this.Brand="";
    this.Mileage="";
    this.Charging_time="";
    this.hassold=false;
    this.haspurchased=false;
    }
    /*
     * There is a accessor method for Range,Battery Capacity ,Price ,Charging Time ,Brand ,
     * Mileage ,hasPurchased ,hasSold which returns Range,Battery Capacity ,Price ,Charging Time ,Brand ,
     * Mileage ,hasPurchased ,hasSold respectively.
     */
    public int get_Range()
    {
        return this.Range;
    }
    public int get_Battery_Capacity()
    {
        return this.Battery_Capacity;
    }
    public int get_Price()
    {
        return this.Price;
    }
    public String get_Charging_time()
    {
        return this.Charging_time;
    }
    public String get_Brand()
    {
        return this.Brand;
    }
    public String get_Mileage()
    {
        return this.Mileage;
    }
    public boolean get_haspurchased()
    {
        return this.haspurchased;
    }
    public boolean get_hassold()
    {
        return this.hassold;
    }
    /*
     * This is a setter method.This method accepts Brand as a parameter.
     * The value of this parameter is assigned to instance variable: Brand
     */
    public void set_Brand(String Brand)
    {
        if(haspurchased==false)
        {
            this.Brand=Brand;
        }
        else
        {
            System.out.println("Scotter is already purchased so not possible to change the brand");
        }
    } 
    /*
     * This method takes brand, price, charging time, mileage and range as parameters.
     * If scotter is not purchased yet method set the brand with parameter brand is called 
     * and price, charging-time, mileage, range are initialized by corresponding parameter 
     * values and hasPurchased is then set to true.
     */
    public void purchase(String Brand,int Price,
    String Charging_time,
    String Mileage,
    int Range)
    {
        if(haspurchased==false)
        {
           this.set_Brand(Brand);
           this.Price=Price;
           this.Charging_time=Charging_time;
           this.Mileage=Mileage;
           this.Range=Range;
           this.haspurchased=true;
        }
    }
    /*
     * This method accepts Price as parameter.If status of hassold is false Price is initialized
     * with parameter value and charging time, mileage to “” and battery capacity, range to 0.
     * The status of hassold is changed to true and haspurchased to false.If scotter is already 
     * sold suitable message is displayed.
     */
    public void sell(int Price)
    {
     if(hassold==false)
     {
         this.Price=Price;
         this.Charging_time="";
         this.Mileage="";
         this.Battery_Capacity=0;
         this.Range=0;
         this.hassold=true;
         this.haspurchased=false;
     }
     else
     {
         System.out.println("The scooter is already sold");
     }
    }
    /*
     *This method calls the constructor of vehicle class with parameters: Vehicle ID, Vehicle name,
     *Vehicle weight,vehicle color, and Vehicle speed.If scotter is already purchased  then brand, 
     *battery capacity, mileage, range, and recharge time must also be displayed.
 
     */
    public void display()
    {
       super.display();
       if(haspurchased==true)
       {
           System.out.println("The brand is " + this.Brand);
           System.out.println("The Battery capacity is " + this.Battery_Capacity);
           System.out.println("The mileage is " + this.Mileage);
           System.out.println("The range is " + this.Range);
           System.out.println("The charging time is " + this.Charging_time);
       }
    }
}