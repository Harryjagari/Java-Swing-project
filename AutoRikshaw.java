
/**
 * The AutoRikshaw class which extendas Vehicle has eight attributes:Engine_Displacement,Torque,Number_of_seats,Fuel_Tank_Capacity,
 * Ground_Clearance,Charge_Amount,Booked_date,isBooked.
 * The constructors accepts nine parameters.The values of these parameters are assigned 
 * the corressponding parameter values.Each attribute has a corresponding accessor method.
 * There is setters method for Charge_Amount which accepts Charge_Amount as parameter and
 * Number_of_seats which accepts Number_of_seats as parameter.There is a  method Book 
 * which accepts Parameters:Booked_date,Charge_amount,Number_of_seats.
 * There is a method to display which calls the constructor of vehicle class with parameters: Vehicle ID, 
 * Vehicle name, Vehicle weight,vehicle color, and Vehicle speed.If auto rikshaw is
 * already booked it displays Engine Displacement, Torque, Fuel Tank Capacity, Ground,
 * Clearance, Booked Date.If charge amount is not set, empty messageis displayed else 
 * the values of charge amount and number of seats is displayed. 
 *
 * @author (Harendra Jagari)
 * @version (18)
 */
public class AutoRikshaw extends Vehicle
{
   // A variable:Engine_Displacement is declared with int data type
   private int Engine_Displacement;
   // A variable:Torque is declared with String data type
   private String Torque;
   // A variable:Number_of_seats is declared with int data type
   private int Number_of_seats;
   // A variable:Fuel_Tank_Capacity is declared with int data type
   private int Fuel_Tank_Capacity;
   // A variable:Ground_Clearance is declared with String data type
   private String Ground_Clearance;
   // A variable:Charge_Amount is declared with int data type
   private int Charge_Amount;
   // A variable:Booked_date is declared with String data type
   private String Booked_date;
   // A variable:isBooked is declared with boolean data type
   private boolean isBooked;
   
   /*
    * The constructor accepts nine parameters:vehicleid,vehiclename,vehicleweight,vehiclecolor,
    * vehiclespeed,Engine_Displacement,Torque,Fuel_Tank_Capacity,Ground_Clearance
    *The values of these parameters are initialized in instance variables:vehicleid,vehiclename,vehicleweight,vehiclecolor,
    * vehiclespeed,Engine_Displacement,Torque,Fuel_Tank_Capacity,Ground_Clearance
    */
   public AutoRikshaw(int vehicleid,String vehiclename,String vehicleweight,String vehiclecolor,String vehiclespeed,int Engine_Displacement,String Torque,int Fuel_Tank_Capacity,String Ground_Clearance)
   
   {
       super(vehiclename,vehicleweight,vehiclecolor,vehicleid);
       super.set_vehiclespeed(vehiclespeed);
       super.set_vehiclecolor(vehiclecolor);
       this.Engine_Displacement=Engine_Displacement;
       this.Torque=Torque;
       this.Fuel_Tank_Capacity=Fuel_Tank_Capacity;
       this.Ground_Clearance=Ground_Clearance;
       this.isBooked=false;
    }
    /*
     *There is a accessor method for Engine Displacement ,Torque ,Number of Seats,Fuel Tank Capacity,
     *Ground Clearance, Charge Amount, Booked Date, isBooked which 
     * returns Engine Displacement, Torque ,Number of Seats,Fuel Tank Capacity,
     *Ground Clearance, Charge Amount ,Booked Date ,isBooked respectively. 
     */
    public int get_Engine_Displacement()
    {
        return this.Engine_Displacement;
    }
    public String get_Torque()
    {
        return this.Torque;
    }
    public int get_Number_of_seats()
    {
        return this.Number_of_seats;
    }
    public int get_Fuel_Tank_Capacity()
    {
        return this.Fuel_Tank_Capacity;
    }
    public String get_Ground_Clearance()
    {
        return this.Ground_Clearance;
    }
    public int get_Charge_Amount()
    {
        return this.Charge_Amount;
    }
    public String get_Booked_date()
    {
        return this.Booked_date;
    }
    public boolean get_isBooked()
    {
        return this.isBooked;
    }
    /*
     * There is a setters method for Charge_Amount and Number_of_seats which initializes the value
     * to instance variable Charge_amount and Number_of_seats respectively.
     */
    public void set_Charge_Amount(int Charge_amount)
    {
        this.Charge_Amount=Charge_amount;
    }
    public void set_Number_of_seats(int Number_of_seats)
    {
        this.Number_of_seats=Number_of_seats;
    }
    /*
     * This method accepts booked date, charge amount and number of seats as a parameter.
     * If auto rikshaw is not booked,booked date is initialize with the parameter value.
     * It calls Setter method charge amount and number of seats and change the status of
     * isbooked to true and display a message with vehicle id.if auto rikshaw is booked already
     * it display appropriate message with status of isbooked.

     */
    public void Book(String Booked_date,int Charge_amount,int Number_of_seats)
    {
       if(isBooked==false)
       {this.Booked_date=Booked_date;
        this.set_Charge_Amount(Charge_amount);
        this.set_Number_of_seats(Number_of_seats);
        this.isBooked=true;
        System.out.println("The Auto rickshaw having" + super.get_vehicleid() + "is booked");
       }
       else
       {
           System.out.println("isBooked"+ this.isBooked);
           System.out.println("Auto rickshaw is already booked");
       }
    }
    /*
     *This method calls the constructor of vehicle class with parameters: Vehicle ID, 
     *Vehicle name, Vehicle weight,vehicle color, and Vehicle speed.If auto rikshaw is
     *already booked it displays Engine Displacement, Torque, Fuel Tank Capacity, Ground,
     *Clearance, Booked Date.If charge amount is not set, empty messageis displayed else 
     *the values of charge amount and number of seats is displayed. 
     */
    public void display()
    {
        super.display();
        if(isBooked==true)
        {
            System.out.println("The engine displacement is " + this.Engine_Displacement);
            System.out.println("The torque is " + this.Torque);
            System.out.println("The fuel tank capacity is " + this.Fuel_Tank_Capacity);
            System.out.println("The ground clearance is " + this.Ground_Clearance);
            System.out.println("The booked date is " + this.Booked_date);
            if(Charge_Amount==0)
            {
                System.out.println("Empty");
            }
            else
            {
               System.out.println("The charge amount is"+this.Charge_Amount);
            }
            if(Number_of_seats==0)
            {
                System.out.println("Empty");
            }
            else
            {
                System.out.println("The number of seats are"+ this.Number_of_seats);
            }
        
        }
    }
}
        
         
         
