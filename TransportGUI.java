
/**
 * Imported all the classes from javax.swing package,from java.awt package and java.awt.event package.
 * There is a TransportGUI class with various instance variables for JFrame,JPanel,JLabel,JTextField,
 * Button and JComboBox.
 * There is a ArrayList of Vehicle class.THere are 4 methods in total.
 * Method AutoGUI has one JFrame,2 JPanel,14 JLabel,12 JTextFields,3 JComboBox and 5 buttons whwreas method 
 * ScotterGUI has one JFrame,2 JPanel, 13 JLabel,12 JTextFields,6 JButtons in it.
 * There is the main method in which we have made the object of TransportGUI class and called the method AutoGUI.
 * There is actionPerformed method of ActionListener interface which is overridden here to give the logic for
 * the functionality of buttons,textfields,etc.
 *
 * @author (Harendra Jagari)
 * 
 * @version (18)
 */
//importing all the classes from javax.swing package 
import javax.swing.*;
//importing all the classes from java.awt package 
import java.awt.*;
//importing all the classes from java.awt.event package
import java.awt.event.*;
////importing the ArrayList class from java.util.ArrayList package
import java.util.ArrayList;

public class TransportGUI implements ActionListener
{
    //ArrayList of Vehicle class
    ArrayList<Vehicle> V = new ArrayList<Vehicle>();
    //instance variable for JFrame
    private JFrame frame1,frame2;
    //instance variable for JPanel
    private JPanel panel1,panel2,panel3,panel4;
    //instance variable for JLabel
    private JLabel lbl0,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12,lbl13,lbl14,lbl15,lbl16,lbl17,lbl18,lbl19,lbl20,lbl21,lbl22,lbl23,lbl24,lbl25,lbl26;
    //instance variable for JTextField
    private JTextField  idOfvehicle,id,vehicleName,vehicleWeight,vehicleColor,vehicleSpeed,ground,engine,torque,fuel,vehicleId,seats,chargeA,vehId,vehName,vehWeight,vehColor,vehSpeed,battery,brand,price,chargingT,mileage,range;
    //instance variable for JButton
    private JButton addAuto,bookAuto,displayA,clearA,goScotter,addScotter,goAuto,purchaseScotter,sellScotter,displayS,clearS;
    //instance variable for JComboBox
    private JComboBox M,Y,D;
    /*
     *This method is made to make the GUI of Auto Rickshaw and has one JFrame,
     *2 JPanel,14 JLabel,12 JTextFields,3 JComboBox and 5 buttons in it. 
     */

    public void AutoGUI()
    {
        //JFrame for the GUI of Auto Rickshaw
        frame1 = new JFrame("Transport");
        frame1.setLayout(null);

        frame1.setBounds(20,20,1000,700);
        // first JPanel of GUI of Auto Rickshaw
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(20,140,450,510);
        panel1.setBackground(Color.YELLOW);
        //Second JPanel of GUI of Auto Rickshaw
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(500,170,450,450);

        //JLabel for the Auto RickShaw  
        lbl0 = new JLabel("Auto RickShaw");
        lbl0.setBounds(400,20,300,50);
        lbl0.setFont(new Font("Aerial",Font.BOLD,30));
        frame1.add(lbl0);

        /*
         * These are the JLabels for the panel1 of 
         * GUI of Auto Rickshaw
         */

        //JLabel for the Vehicle ID
        lbl1 = new JLabel("Vehicle ID");
        lbl1.setBounds(20,20,120,20);
        panel1.add(lbl1);
        //JLabel for the Vehicle Name
        lbl2 = new JLabel("Vehicle Name");
        lbl2.setBounds(20,70,100,20);
        panel1.add(lbl2);
        //JLabel for the Vehicle Weight
        lbl3 = new JLabel("Vehicle Weight");
        lbl3.setBounds(20,120,100,20);
        panel1.add(lbl3);
        //JLabel for the Vehicle Color
        lbl4= new JLabel("Vehicle Color");
        lbl4.setBounds(20,170,100,20);
        panel1.add(lbl4);
        //JLabel for the Vehicle Speed
        lbl5 = new JLabel("Vehicle Speed");
        lbl5.setBounds(20,220,100,20);
        panel1.add(lbl5);
        //JLabel for the Engine Displacement
        lbl6 = new JLabel("Engine Displacement");
        lbl6.setBounds(20,270,120,20);
        panel1.add(lbl6);
        //JLabel for the Torque
        lbl7 = new JLabel("Torque");
        lbl7.setBounds( 20,320,70,20);
        panel1.add(lbl7);
        //JLabel for the Fuel tank capacity
        lbl8 = new JLabel("Fuel tank capacity");
        lbl8.setBounds(20,370,120,20);
        panel1.add(lbl8);
        //JLabel for the Ground clearance

        lbl9 = new JLabel("Ground clearance");
        lbl9.setBounds(20,420,120,20);
        panel1.add(lbl9);

        /*
         * These are the JLabels for the panel2 of 
         * GUI of Auto Rickshaw
         */

        //JLabel for the Vehicle ID
        lbl10 = new JLabel("Vehicle ID");
        lbl10.setBounds(20,70,120,20);
        panel2.add(lbl10);
        //JLabel for the No of seats
        lbl11 = new JLabel("No of seats");
        lbl11.setBounds(20,120,100,20);
        panel2.add(lbl11);
        //JLabel for the Charge Amount
        lbl12 = new JLabel("Charge Amount");
        lbl12.setBounds(20,170,100,20);
        panel2.add(lbl12);
        //JLabel for the Booked Date
        lbl13 = new JLabel("Booked Date");
        lbl13.setBounds(20,20,100,20);
        panel2.add(lbl13);

        //Array for days
        String[] days = {"Days", "01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        //JComboBox for days
        D = new JComboBox(days);
        D.setBounds(150,20,60,30);
        panel2.add(D);
        //Array for months
        String[] months = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //JComboBox for months
        M = new JComboBox(months);
        M.setBounds(220,20,80,30);
        panel2.add(M);
        //Array for years
        String[] years = {"Years","2000", "2001", "2002", "2002", "2003", "2004", "2005", "2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        //JComboBox for years 
        Y = new JComboBox(years);
        Y.setBounds(310,20,60,30);
        panel2.add(Y);

        /*
         * These are the JTextFields for the panel1 of 
         * GUI of Auto Rickshaw
         */ 

        //JTextField for id
        id= new JTextField();
        id.setBounds(170, 20, 200, 30);
        panel1.add(id);
        //JTextField for vehicleName
        vehicleName= new JTextField();
        vehicleName.setBounds(170, 70, 200, 30);
        panel1.add(vehicleName);
        //JTextField for vehicleWeight
        vehicleWeight= new JTextField();
        vehicleWeight.setBounds(170, 120, 200, 30);
        panel1.add(vehicleWeight);
        //JTextField for vehicleColor
        vehicleColor= new JTextField();
        vehicleColor.setBounds(170, 170, 200, 30);
        panel1.add(vehicleColor);
        //JTextField for vehicleSpeed
        vehicleSpeed= new JTextField();
        vehicleSpeed.setBounds(170, 220, 200, 30);
        panel1.add(vehicleSpeed);
        //JTextField for engine
        engine= new JTextField();
        engine.setBounds(170, 270, 200, 30);
        panel1.add(engine);
        //JTextField for torque
        torque= new JTextField();
        torque.setBounds(170, 320, 200, 30);
        panel1.add(torque);
        //JTextField for fuel 
        fuel= new JTextField();
        fuel.setBounds(170, 370, 200, 30);
        panel1.add(fuel);
        //JTextField for ground
        ground= new JTextField();
        ground.setBounds(170, 420, 200, 30);
        panel1.add(ground);

        /*
         * These are the JTextFields for the panel2 of 
         * GUI of Auto Rickshaw
         */

        //JTextField for vehicleId
        vehicleId= new JTextField();
        vehicleId.setBounds(170, 70, 200, 30);
        panel2.add(vehicleId);
        //JTextField for seats
        seats= new JTextField();
        seats.setBounds(170, 120, 200, 30);
        panel2.add(seats);
        //JTextField for chargeA
        chargeA= new JTextField();
        chargeA.setBounds(170, 170, 200, 30);
        panel2.add(chargeA);

        /*
         * These are the JButtons for the 
         * GUI of Auto Rickshaw
         */

        //JButton for addAuto 
        addAuto = new JButton("Add AutoRickshaw");
        addAuto.setBounds(20, 470, 350, 30);
        addAuto.setFont(new Font("Aerial",Font.BOLD, 18));
        addAuto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addAuto.addActionListener(this);
        panel1.add(addAuto);
        //JButton for bookAuto
        bookAuto = new JButton("Book the AutoRickshaw");
        bookAuto.setBounds(20, 270, 350, 30);
        bookAuto.setFont(new Font("Aerial",Font.BOLD, 18));
        bookAuto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bookAuto.addActionListener(this);
        panel2.add(bookAuto);
        //JButton for displayA
        displayA = new JButton("Display");
        displayA.setBounds(20, 320, 170, 30);
        displayA.setFont(new Font("Aerial",Font.BOLD, 18));
        displayA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        displayA.addActionListener(this);
        panel2.add(displayA);
        //JButton for clearA
        clearA = new JButton("Clear");
        clearA.setBounds(200, 320, 170, 30);
        clearA.setFont(new Font("Aerial",Font.BOLD, 18));
        clearA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clearA.setBackground(Color.RED);
        clearA.addActionListener(this);
        panel2.add(clearA);
        //JButton for goScotter
        goScotter = new JButton("Go to Electric Scotter");
        goScotter.setBounds(520, 130, 350, 30);
        goScotter.setFont(new Font("Aerial",Font.BOLD, 18));
        goScotter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goScotter.addActionListener(this);
        frame1.add(goScotter);

        //Adding panel1 and panel2 in frame1
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.setResizable(false);
        frame1.setVisible(true);

    }

    /*
     *This method is made to make the GUI for Electric Scotter and has one JFrame,
     *2 JPanel, 13 JLabel,12 JTextFields,6 JButtons in it 
     */
    public void ScotterGUI()
    {
        //JFrame for the GUI of Electric Scotter
        frame2 = new JFrame("Transport");
        frame2.setLayout(null);
        frame2.setBounds(20,20,1000,700);
        //first JPanel of GUI of Electric Scotter
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(20,170,450,450);
        panel3.setBackground(Color.YELLOW);
        //first JPanel of GUI of Electric Scotter
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(500,170,450,450);

        //JLabel for the Electric Scotter
        lbl14 = new JLabel("Electric Scotter");
        lbl14.setBounds(400,20,300,50);
        lbl14.setFont(new Font("Aerial",Font.BOLD,30));
        frame2.add(lbl14);

        /*
         *These are the JLabels for the panel1 of 
         * GUI of Electric Scotter
         */
        //JLabel for the Vehicle ID
        lbl15 = new JLabel("Vehicle ID");
        lbl15.setBounds(20,20,120,20);
        panel3.add(lbl15);
        //JLabel for the Vehicle Name
        lbl16 = new JLabel("Vehicle Name");
        lbl16.setBounds(20,70,100,20);
        panel3.add(lbl16);
        //JLabel for the Vehicle Weight
        lbl17 = new JLabel("Vehicle Weight");
        lbl17.setBounds(20,120,100,20);
        panel3.add(lbl17);
        //JLabel for the Vehicle Color
        lbl18= new JLabel("Vehicle Color");
        lbl18.setBounds(20,170,100,20);
        panel3.add(lbl18);
        //JLabel for the Vehicle Speed
        lbl19 = new JLabel("Vehicle Speed");
        lbl19.setBounds(20,220,100,20);
        panel3.add(lbl19);
        //JLabel for the Battery Capacity
        lbl20 = new JLabel("Battery Capacity");
        lbl20.setBounds(20,270,270,20);
        panel3.add(lbl20);

        /*
         * These are the JLabels for the panel1 of 
         * GUI of Electric Scotter 
         */

        //JLabel for the Vehicle ID
        lbl21 = new JLabel("Vehicle ID");
        lbl21.setBounds(20,20,120,20);
        panel4.add(lbl21);
        //JLabel for the Brand
        lbl22 = new JLabel("Brand");
        lbl22.setBounds(20,70,120,20);
        panel4.add(lbl22);
        //JLabel for the Price
        lbl23 = new JLabel("Price");
        lbl23.setBounds(20,120,100,20);
        panel4.add(lbl23);
        //JLabel for the Charging time
        lbl24 = new JLabel("Charging time");
        lbl24.setBounds(20,170,100,20);
        panel4.add(lbl24);
        //JLabel for the Mileage
        lbl25 = new JLabel("Mileage");
        lbl25.setBounds(20,220,100,20);
        panel4.add(lbl25);
        //JLabel for the Range
        lbl26 = new JLabel("Range");
        lbl26.setBounds(20,270,100,20);
        panel4.add(lbl26);

        /*
         * These are the JTextFields for the panel3 of 
         * GUI of Electric Scotter
         */

        //JTextField for vehId 
        vehId= new JTextField();
        vehId.setBounds(170, 20, 200, 30);
        panel3.add(vehId);
        //JTextField for vehName 
        vehName= new JTextField();
        vehName.setBounds(170, 70, 200, 30);
        panel3.add(vehName);
        //JTextField for vehWeight 
        vehWeight= new JTextField();
        vehWeight.setBounds(170, 120, 200, 30);
        panel3.add(vehWeight);
        //JTextField for vehColor 
        vehColor= new JTextField();
        vehColor.setBounds(170, 170, 200, 30);
        panel3.add(vehColor);
        //JTextField for vehSpeed 
        vehSpeed= new JTextField();
        vehSpeed.setBounds(170, 220, 200, 30);
        panel3.add(vehSpeed);
        //JTextField for battery 
        battery = new JTextField();
        battery.setBounds(170, 270, 200, 30);
        panel3.add(battery);

        /*
         * These are the JTextFields for the panel4 of 
         * GUI of Electric Scotter
         */
        //JTextField for idOfvehicle 
        idOfvehicle= new JTextField();
        idOfvehicle.setBounds(170, 20, 200, 30);
        panel4.add(idOfvehicle);
        //JTextField for brand 
        brand= new JTextField();
        brand.setBounds(170, 70, 200, 30);
        panel4.add(brand);
        //JTextField for price 
        price= new JTextField();
        price.setBounds(170, 120, 200, 30);
        panel4.add(price);
        //JTextField for chargingT 
        chargingT= new JTextField();
        chargingT.setBounds(170, 170, 200, 30);
        panel4.add(chargingT);
        //JTextField for mileage 
        mileage= new JTextField();
        mileage.setBounds(170, 220, 200, 30);
        panel4.add(mileage);
        //JTextField for range 
        range= new JTextField();
        range.setBounds(170, 270, 200, 30);
        panel4.add(range);

        /*
         *These are the JButtons for the 
         * GUI of Electric Scotter
         */

        //JButton for addScotter
        addScotter = new JButton("Add Electric Scotter");
        addScotter.setBounds(20, 320, 350, 30);
        addScotter.setFont(new Font("Aerial",Font.BOLD, 18));
        addScotter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addScotter.addActionListener(this);
        panel3.add(addScotter);
        // //JButton for purchaseScotter
        purchaseScotter = new JButton("Purchase the ElectricScooter");
        purchaseScotter.setBounds(20, 320, 350, 30);
        purchaseScotter.setFont(new Font("Aerial",Font.BOLD, 18));
        purchaseScotter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        purchaseScotter.addActionListener(this);
        panel4.add(purchaseScotter);
        //JButton for sellScotter
        sellScotter = new JButton("Sell the ElectricScooter");
        sellScotter.setBounds(20, 370, 350, 30);
        sellScotter.setFont(new Font("Aerial",Font.BOLD, 18));
        sellScotter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sellScotter.addActionListener(this);
        panel4.add(sellScotter);
        //JButton for displayS
        displayS = new JButton("Display");
        displayS.setBounds(20, 420, 170, 30);
        displayS.setFont(new Font("Aerial",Font.BOLD, 18));
        displayS.setCursor(new Cursor(Cursor.HAND_CURSOR));
        displayS.addActionListener(this);
        panel4.add(displayS);
        //JButton for clearS
        clearS = new JButton("Clear");
        clearS.setBounds(200, 420, 170, 30);
        clearS.setFont(new Font("Aerial",Font.BOLD, 18));
        clearS.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clearS.setBackground(Color.RED);
        clearS.addActionListener(this);
        panel4.add(clearS);
        //JButton for goAuto
        goAuto = new JButton("Go to AutoRickshaw");
        goAuto.setBounds(520, 130, 350, 30);
        goAuto.setFont(new Font("Aerial",Font.BOLD, 18));
        goAuto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goAuto.addActionListener(this);
        frame2.add(goAuto);

        //Adding panel3 and panel4 to frame2 
        frame2.add(panel3);
        frame2.add(panel4);
        frame2.setResizable(false);
        frame2.setVisible(true);  
    }
    //This is the main method in which we have made the object of TransportGUI class and called the method m1.
    public static void main(String[] args)
    {
        TransportGUI gui=new TransportGUI();
        gui.AutoGUI();

    }
    //This the method of ActionListener interface which is overridden here which gives the proper functioning to buttons. 
    public void actionPerformed(ActionEvent e)
    {
        /*
         *In this if statement when this button is pressed, the input values of the vehicle
         *id, vehicle name, vehicle weight, vehicle color, vehicle speed, engine displacement,
         *torque, fuel tank capacity, and ground clearance are used to create a new object of 
         *type AutoRickshaw which is added to an array list of Vehicle class.  
         */
        if(e.getSource()==addAuto)
        {
            String name =vehicleName.getText();
            String weight =vehicleWeight.getText();
            String color =vehicleColor.getText();
            String speed =vehicleSpeed.getText();
            String torq =torque.getText();
            String groundC =ground.getText();
            if(vehicleName.getText().equals("") || vehicleWeight.getText().equals("") || vehicleColor.getText().equals("") || vehicleSpeed.getText().equals("") || torque.getText().equals("") || ground.getText().equals("") || id.getText().equals("") || engine.getText().equals("") || fuel.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame1,"Please enter the value in the empty field","Error",JOptionPane.ERROR_MESSAGE);  
            }
            else
            {
                try
                {
                    boolean havevehicleid = false;
                    int V_id=Integer.parseInt(id.getText());
                    for(Vehicle VA:V)
                    {
                        if(VA instanceof AutoRikshaw)
                        {
                            AutoRikshaw Arik =(AutoRikshaw)VA;
                            if(VA.get_vehicleid()==V_id)
                            {
                                havevehicleid = true; 
                            }

                        }
                    }

                    int EngineD=Integer.parseInt(engine.getText());
                    int fuelT=Integer.parseInt(fuel.getText());
                    if(havevehicleid == false)
                    {

                        AutoRikshaw auto = new AutoRikshaw(V_id,name,weight,color,speed,EngineD,torq,fuelT,groundC);
                        V.add(auto); 

                        JOptionPane.showMessageDialog(frame1,"AutoRikshaw having vehicle id "+V_id+" is successfully Added ","Information",JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else if(havevehicleid == true)
                    {
                        JOptionPane.showMessageDialog(frame1,"AutoRikshaw already Added ","Information",JOptionPane.INFORMATION_MESSAGE);  
                    }
                }
                catch(NumberFormatException c)
                {

                    JOptionPane.showMessageDialog(frame1,"Please enter the valid information ","Error",JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        /*
         * In this if statement when this button is pressed it compare the vehicle id entered is
         * valid or not. If it is valid it shows a message dialog box with appropriate booked date,
         * charge amount and number of seats with appropriate message.If the status of get_isbooked
         * method is true it display amessage dialog box with appropriate message else it calls the
         * Book method from AutoRikshaw class. 
         */
        if(e.getSource()==bookAuto)
        {
            String year= Y.getSelectedItem().toString();
            String day = D.getSelectedItem().toString(); 
            String month = M.getSelectedItem().toString() ;
            String Booked_date= " "+day+" "+month+" "+year;
            try
            {
                int Veh_id=Integer.parseInt(vehicleId.getText());
                int seat=Integer.parseInt(seats.getText());
                int charge=Integer.parseInt(chargeA.getText());

                for(Vehicle veh:V)
                {
                    if(veh instanceof AutoRikshaw)
                    {
                        AutoRikshaw rik =(AutoRikshaw)veh;
                        if(rik.get_vehicleid()==Veh_id)
                        {
                            JOptionPane.showMessageDialog(frame1,"The Auto Rickshaw have\nBooked date:  " + Booked_date +"\n"+"Charged amount: " + charge+"\n"+"Number of seats: " + seat ,"Information",JOptionPane.INFORMATION_MESSAGE);
                            if(rik.get_isBooked()==true)
                            {
                                JOptionPane.showMessageDialog(frame1,"Booked status: " + rik.get_isBooked()+"\n" + "The AutoRikshaw is already booked ","Information",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            else if(rik.get_isBooked()==false)
                            {
                                rik.Book(Booked_date,charge,seat);
                                JOptionPane.showMessageDialog(frame1,"The AutoRikshaw having vehicle id "+Veh_id+" is successfully booked ","Information",JOptionPane.INFORMATION_MESSAGE);
                                break;

                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame1,"Please enter valid vehicle id","Error",JOptionPane.ERROR_MESSAGE);  
                        }
                    }
                }

            }
            catch(NumberFormatException c)
            {

                if(vehicleId.getText().equals("") || seats.getText().equals("") || chargeA.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame1,"Please enter the value in the empty field","Error",JOptionPane.ERROR_MESSAGE);  
                } 
                else
                {
                    JOptionPane.showMessageDialog(frame1,"Please enter the valid information","Error",JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        /*
         * In this if statement when this button is pressed, the input values of 
         * the vehicle id, vehicle name, vehicle weight, vehicle color, vehicle 
         * speed, and battery capacity are used to create a new object of the type 
         * ElectricScooter which is added to an array list of Vehicle class. 
         */
        if(e.getSource()==addScotter)
        {

            String Vname =vehName.getText();
            String Vweight =vehWeight.getText();
            String Vcolor =vehColor.getText();
            String Vspeed =vehSpeed.getText();

            try
            {
                boolean havevehicleidS = false;
                int Vid=Integer.parseInt(vehId.getText());
                for(Vehicle VS:V)
                {
                    if(VS instanceof Electric_Scotter)
                    {
                        Electric_Scotter Escooty =(Electric_Scotter)VS;
                        if(VS.get_vehicleid()==Vid)
                        {
                            havevehicleidS = true; 
                        }

                    }
                }

                int batteryC=Integer.parseInt(battery.getText());
                if(havevehicleidS == false)
                {
                    Electric_Scotter scotter = new Electric_Scotter(Vid,Vname,Vweight,Vspeed,Vcolor,batteryC);
                    V.add(scotter);

                    JOptionPane.showMessageDialog(frame2,"Electric Scotter having vehicle id "+Vid+" is successfully Added ","Information",JOptionPane.INFORMATION_MESSAGE);  
                }
                else if(havevehicleidS = true)
                {
                    JOptionPane.showMessageDialog(frame2,"Electric Scotter already Added ","Information",JOptionPane.INFORMATION_MESSAGE); 
                }
            }

            catch(NumberFormatException c)
            {
                if(vehName.getText().equals("") || vehWeight.getText().equals("") || vehColor.getText().equals("") || vehSpeed.getText().equals("") || vehId.getText().equals("") || battery.getText().equals(""))

                {
                    JOptionPane.showMessageDialog(frame2,"Please enter the value in the empty field","Error",JOptionPane.ERROR_MESSAGE);   
                } 
                else
                {
                    JOptionPane.showMessageDialog(frame2,"Please enter the valid information","Error",JOptionPane.ERROR_MESSAGE); 
                }
            }

        }
        /*
         *In this if statement when this button is pressed it compare the vehicle id
         *entered is valid or not. If it is valid it shows a message dialog box with
         *appropriate brand, price, charging time, mileage and range with appropriate
         *message. If the status of get_haspurchased() method is true it display a message
         *dialog box with appropriate message else it calls the  purchase method from Electric
         *Scotter class.  
         */
        if(e.getSource()==purchaseScotter)
        {
            String eBrand =brand.getText();
            String eChargingTime =chargingT.getText();
            String eMileage =mileage.getText();

            try
            {
                int evehid=Integer.parseInt(idOfvehicle.getText());
                int ePrice=Integer.parseInt(price.getText());
                int eRange=Integer.parseInt(range.getText());
                for(Vehicle sveh:V)
                {
                    if(sveh instanceof Electric_Scotter)
                    {
                        Electric_Scotter scooty =(Electric_Scotter)sveh;
                        if(scooty.get_vehicleid()==evehid)
                        {
                            JOptionPane.showMessageDialog(frame1,"The Electric Scotter have\nBrand: " + eBrand +"\n"+"Price: " + ePrice+"\n" +"Charging time: " + eChargingTime+"\n"+"Range: "+ eRange ,"Information",JOptionPane.INFORMATION_MESSAGE);
                            if(scooty.get_haspurchased()==true)
                            {

                                JOptionPane.showMessageDialog(frame1,"The Electric Scotter is already purchased ","Information",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            else if(scooty.get_haspurchased()==false) 
                            {

                                scooty.purchase(eBrand,ePrice,eChargingTime,eMileage,eRange);
                                JOptionPane.showMessageDialog(frame1,"The Electric Scotter having vehicle id "+evehid+" is successfully purchased ","Information",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                        else
                        {

                            JOptionPane.showMessageDialog(frame1,"Please enter valid vehicle id ","Error",JOptionPane.ERROR_MESSAGE);  
                        }
                    }
                }
            }
            catch(NumberFormatException c)
            {
                if(idOfvehicle.getText().equals("") || price.getText().equals("") || range.getText().equals("")||brand.getText().equals("") || chargingT.getText().equals("") || mileage.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame2,"Please enter the value in the empty field ","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(frame2,"Please enter the valid information ","Error",JOptionPane.ERROR_MESSAGE); 
                }

            }

        }
        /*
         *In this if statement when this button is pressed it compare the vehicle id
         *entered is valid or not. If it is valid it shows a message dialog box with 
         *appropriate price with appropriate message. If the status of get_ get_hassold()
         *method is true it display a message dialog box with appropriate message else it 
         *calls the  sell method from Electric Scotter class.  
         */
        if(e.getSource()==sellScotter)
        {

            try
            {
                int evehicleid=Integer.parseInt(idOfvehicle.getText());
                int Price=Integer.parseInt(price.getText());
                for(Vehicle svehicle:V)
                {
                    if(svehicle instanceof Electric_Scotter)
                    {
                        Electric_Scotter Escooty =(Electric_Scotter)svehicle;
                        if(Escooty.get_vehicleid()==evehicleid)
                        {
                            JOptionPane.showMessageDialog(frame2," The Price of Electric Scotter is:  " + Price,"Information",JOptionPane.INFORMATION_MESSAGE);
                            if(Escooty.get_hassold()==true)
                            {
                                JOptionPane.showMessageDialog(frame2,"The Electric Scotter is already sold ","Information",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            else if(Escooty.get_hassold()==false)
                            {
                                Escooty.sell(Price);
                                JOptionPane.showMessageDialog(frame2,"The Electric Scotter having vehicle id "+evehicleid+" is successfully sold ","Information",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }

                    }
                }
            }
            catch(NumberFormatException c)
            {
                if(idOfvehicle.getText().equals("") || price.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame2,"Please enter the value in the empty field","error",JOptionPane.ERROR_MESSAGE);  
                }
                else
                {
                    JOptionPane.showMessageDialog(frame2,"Please enter the valid information ","error",JOptionPane.ERROR_MESSAGE);
                }

            }

        }
        /*
         *In this if statement when we press the display button it calls the 
         *Display method of AutoRikshaw class and display the information related to this class. 
         */
        if(e.getSource()==displayA)
        {
            for(Vehicle V1:V)
            {
                int Veh_idA=Integer.parseInt(vehicleId.getText());
                String nameA =vehicleName.getText();
                String weightA =vehicleWeight.getText();
                String colorA =vehicleColor.getText();
                String speedA =vehicleSpeed.getText();
                AutoRikshaw rikshaw =(AutoRikshaw)V1;
                if(V1 instanceof AutoRikshaw)
                {
                    rikshaw.display();
                    JOptionPane.showMessageDialog(frame1,"The Auto Rickshaw have\nVehicle ID:"+Veh_idA+"\nVehicle Name:"+nameA+"\nVehicle Weight:"+weightA+"\nVehicle color:"+colorA+"\nVehicle Speed:"+speedA+"\nEngine Displacement:" + rikshaw.get_Engine_Displacement()+"\n"+"Torque: "+rikshaw.get_Torque()+"\n"+"Fuel Tank Capacity: "+rikshaw.get_Fuel_Tank_Capacity()+"\n"+"Ground Clearance: "+rikshaw.get_Ground_Clearance()+"\n"+"Booked Date: "+rikshaw.get_Booked_date()+"\n"+"Charge Amount: "+rikshaw.get_Charge_Amount()+"\n"+"Number of Seats: "+rikshaw.get_Number_of_seats(),"Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        /*
         * In this if statement when we press the display button it calls the
         * Display method of Electric Scotter class and display the information related to this class.
         */
        if(e.getSource()==displayS)
        {
            for(Vehicle V2:V)
            {
                int evehide=Integer.parseInt(idOfvehicle.getText());
                String VnameE =vehName.getText();
                String VweightE =vehWeight.getText();
                String VcolorE =vehColor.getText();
                String VspeedE =vehSpeed.getText();
                Electric_Scotter scoteer =(Electric_Scotter)V2;
                if(V2 instanceof Electric_Scotter)
                {

                    scoteer.display();
                    JOptionPane.showMessageDialog(frame2,"The Electric Scotter have\nVehicle ID:"+evehide+"\nVehicle Name:"+VnameE+"\nVehicle Weight:"+VweightE+"\nVehicle color:"+VcolorE+"\nVehicle Speed:"+VspeedE+"\nBrand: "+scoteer.get_Brand()+"\n"+"Battery Capacity: "+scoteer.get_Battery_Capacity()+"\n"+"Mileage: "+scoteer.get_Mileage()+"\n"+"Range: "+scoteer.get_Range()+"\n"+"Charging Time: "+scoteer.get_Charging_time(),"Information",JOptionPane.INFORMATION_MESSAGE);  

                }
            }
        }
        //In this if statement when the clearA button in frame1 is pressed then all the textfields of frame1 are set to empty and Combobox is set to its 0 index value which is month,day,year
        if(e.getSource()==clearA  )
        {
            id.setText("");
            vehicleId.setText("");
            vehicleName.setText("");
            vehicleWeight.setText("");
            vehicleColor.setText("");
            vehicleSpeed.setText("");
            ground.setText("");
            engine.setText("");
            torque.setText("");
            fuel.setText("");
            seats.setText("");
            chargeA.setText("");
            M.setSelectedIndex(0);
            Y.setSelectedIndex(0);
            D.setSelectedIndex(0);

        }
        //In this if statement when the clearS button in frame2 is pressed then all the textfields of frame2 are set to empty 
        if(e.getSource()==clearS)
        {
            idOfvehicle.setText("");
            vehId.setText("");
            vehName.setText("");
            vehWeight.setText("");
            vehColor.setText("");
            vehSpeed.setText("");
            battery.setText("");
            brand.setText("");
            price.setText("");
            chargingT.setText("");
            mileage.setText("");
            range.setText("");

        }
        //In this if statement when the goScotter button in frame1 is pressed then m2 method is called and frame2 is seen and frame1 is made invisible.
        if(e.getSource()==goScotter)
        {
            this.ScotterGUI(); 
            frame1.setVisible(false); 
        }
        //In this if statement when the goAuto button in frame2 is pressed then m1 method is called and frame1 is seen and frame2 is made invisible.
        if(e.getSource()==goAuto)
        {
            this.AutoGUI(); 
            frame2.setVisible(false); 
        }

    }
}
