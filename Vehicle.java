
/**
 * The Vehicle class has five attributes:vehiclename,vehicleweight,vehiclespeed,
 * vehiclecolor,vehicleid.
 * The constructors accepts four parameters.The values of these parameters are assigned 
 * the corressponding parameter values.Each attribute has a corresponding accessor method.
 * There is setters method for vehiclespeed which accepts vehiclespeed as parameter and
 * vehiclecolor which accepts vehiclecolor as parameter.There is a display method that gives 
 * vehicleid,vehiclename,vehicleweight,vehiclecolor,verhiclespeed as output and display empty 
 * message if vehicleweight is empty.
 * @author (Harendra Jagari)
 * @version (18)
 */
public class Vehicle
{ 
    // A variable:vehiclename is declared with String data type
   private String vehiclename;
   //// A variable:vehicleweight is declared with String data type
   private String vehicleweight;
   //// A variable:vehiclespeed is declared with String data type
   private String vehiclespeed;
   //// A variable:vehiclecolor is declared with String data type
   private String vehiclecolor;
   //// A variable:vehicleid is declared with int data type
   private int vehicleid;
   /*
    *The constructor accepts four parameters:vehiclename,vehicleweight,vehiclecolour,vehicleid
    *The values of these parameters are initialized in instance variables:vehiclename,
    *vehicleweight,vehiclecolour,vehicleid.
    */
   public Vehicle(String vehiclename,String vehicleweight,String vehiclecolor,int vehicleid)
   {this.vehiclename=vehiclename;
       this.vehicleweight=vehicleweight;
       this.vehiclecolor=vehiclecolor;
       this.vehicleid=vehicleid;
    }
/*
 * There is a accessor method for vehiclename,vehicleweight,vehiclespeed,vehiclecolor,vehicleid which 
 * returns vehiclename,vehicleweight,vehiclespeed,vehiclecolor,vehicleid respectively.
 */
public String get_vehiclename()
{
    return this.vehiclename;
}
public String get_vehicleweight()
{
    return this.vehicleweight;
}
public String get_vehiclespeed()
{
    return this.vehiclespeed;
}
public int get_vehicleid()
{
    return this.vehicleid;
}
public String get_vehiclecolor()
{
    return this.vehiclecolor;
}
/*
 * There is a setters method for vehiclespeed and vehiclecolor which initializes the value
 * to instance variable vehiclespeed and vehiclecolor respectively.
 */
public void set_vehiclespeed(String vehiclespeed)
{
    this.vehiclespeed=vehiclespeed;
}
public void set_vehiclecolor(String vehiclecolor)
{
    this.vehiclecolor=vehiclecolor;
}
/*
 * There is a display method which displays the vehicleid,vehiclename,vehicleweight,vehiclecolor
 * and vehiclespeed but if  vehicleweight is empty it shows empty message.
 */
public void display()
{   System.out.println("The vehicle id is " + this.vehicleid);
    System.out.println("The vehicle name is " + this.vehiclename);
    System.out.println("The vehicle speed is " + this.vehiclespeed);
    System.out.println("The vehicle weight is " + this.vehicleweight);
    System.out.println("The vehicle color is " + this.vehiclecolor);
    
    if(this.vehicleweight.equals(""))
    {
        System.out.println("empty");
        
    }
    else
    {
        System.out.println("The vehicleweight is " + this.vehicleweight);
    
    }
    
    
}
}