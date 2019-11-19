
/**
 * This is the class which instantiates objects.
 *
 * 
 */
package cctair;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 * 
 */

/**
     * This method initiates a number of pilot objects and a number of airplane objects.
     * A pilot object is, then, assigned to an airplane object.
     * It takes one parameter to random which airplane will be selected.
     * 
     * 
     */
public class SetUp 
{
 
    // String with pre informations
    String[] irishAirports = {"Dublin", "Cork", "Shannon", "Knock", "Belfast"};
    String[] alternateCity = {"Amsterdan", "Munich", "Krakov", "Paris", "Barcelona", "Doha", "Sidney", "Perth", "Moscow", "Brussels", "Berlin", "Dubai", "Munich", "London", "Paris", "Barcelona", "Porto", "Lisbon", "Guarulhos", "Rio de Janeiro", "New York"};
    String[] firstName = {"Robert", "Shane", "Sarah", "Peter", "Vinicius", "Camila", "Jhon", "Ana", "Dario", "Princess", "Roger", "Marcel", "Linda", "Paul", "Joe", "Josefh", "Bill", "Bob", "Anderson", "Mario", "Roberto", "Billy","Bob","Dave","Jane","Mary"};
    String[] lastName = {"Sinclair", "Kent", "Waine", "Parker", "O'Donnell", "Monteiro", "Toledo", "Nagate", "Krokowez", "Gavlin", "McDonald", "Connell", "Devlin", "Smith", "Blogs", "Kent", "Krane", "Smith", "O'Donell", "Sullivan", "Gahan","Scully","Victory","Bale"};
    String[] airPlaneMake = {"Boeing", "Embraer", "Airbus", "Antonov", "Bombardier", "Concord"};
    String[] airPlaneModel = {"747-400", "767-300", "A 319", "727-200", "737-200", "A 330", "KR-860","R101","CRJ-100"};
    String[] capacity ={"4","10", "15", "20","80", "90", "100","150","200","250","300","350","400"};
    String[] rating ={"1","2","3","4","5"};
    String[] departureTime={"07:00", "07:30", "08:00", "08:30","09:00", "09:30", "10:00","10:30","12:00", "12:30","13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30"};
    String[] arrivalTime={"4:15", "4:45", "5:15", "5:45", "6:15", "6:45", "7:45", "7:15", "8:15", "8:45", "11:15", "11:45", "12:15", "12:45", "13:15", "13:45","14:00", "14:30", "15:15", "15:45", "16:15", "16:45", "17:15", "17:45", "18:15", "18:45"};
    String[] dateTakeOff ={"05/11/2019","10/12/2019","20/12/2019","03/01/2020","05/01/2020","15/01/2020","08/02/2020", "01/02/2020", "01/12/2019", "02/12/2019", "03/12/2019", "10/12/2019", "15/12/2019", "05/01/2020", "06/01/2020", "10/01/2020", "15/01/2020", "16/01/2020"};
    String[] size1 ={"Cessna 172","Single Engine", "Wright Flyer"};
    String[] size2 ={"Small Jet","Gulfstream G500", "Business Jet", "Learjet 23", "Douglas DC-3"};
    String[] size3 = {"Lockheed SR-71 Blackbird","Lockheed C-130", "Jumbo", "Multiengine"};

     // random method
    Random rG = new Random();
    
     // instance of logic class
    Logic logic = new Logic();
    
    
     // method create Pilots
    public Pilot[] buildPilot(Pilot[] pilot)  
    {
        
         /**for loop to insert information into the pilot array */
        for(int i=0;i<pilot.length;i++ ) 
       {
            /**instance of new pilot */
            pilot[i] = new Pilot();
            
             // generate a name of the pilot
            pilot[i].setName(firstName[rG.nextInt(firstName.length)]+" "+ lastName[rG.nextInt(lastName.length)]);
            
             // generate a rating of the pilot
            pilot[i].setRating(Integer.valueOf(rating[rG.nextInt(rating.length)]));
            
             // checking rating of the pilot
            if (pilot[i].getRating()> 4)
            {
                 pilot[i].setAircraftType(size3[rG.nextInt(size3.length)]);
                 
            }else if(pilot[i].getRating()>=2 && pilot[i].getRating()<= 4)
            {
                 pilot[i].setAircraftType(size2[rG.nextInt(size2.length)]);
            }else{
                 pilot[i].setAircraftType(size1[rG.nextInt(size1.length)]);
            }

             // showing the pilot name
            System.out.println(pilot[i].toString());
              
       } 
        // return the pilot array
        return pilot;
    }

    // method to build AirPlane and insert into the array
    public AirPlane[] buildAirPlane(Pilot[] pilot, AirPlane[] airplane)  
    {
       
         // for loop to insert information into the Aircraft array
        for(int i=0;i<airplane.length;i++ ) 
       {
            // instance of new Aircraft
            airplane[i] = new AirPlane();
            
            // generate the make of the AirPlane
            airplane[i].setMake(airPlaneMake[rG.nextInt(airPlaneMake.length)]);
            
            // generate the model of the AirPlane
            airplane[i].setModel(airPlaneModel[rG.nextInt(airPlaneModel.length)]);
            
            // generate the capacity of the AirPlane
            airplane[i].setCapacity(Integer.valueOf(capacity[rG.nextInt(capacity.length)]));
            
            // checking the capacity and minimun rating allowed 
            if (airplane[i].capacity()>=300)
            {
                 airplane[i].setMinimumRating(4);
            }else if(airplane[i].capacity()>=100 && airplane[i].capacity()<=200)
            {
                 airplane[i].setMinimumRating(3);
            }else{
                 airplane[i].setMinimumRating(1);
            }
             // setting AirPlane as available
            airplane[i].setAvailable(true);
        
              
       }
        // pilot validation of minimum rating to the Aircraft
       for(int i=0;i<airplane.length;i++ )
       {
           
            // getting rating from the Aircraft and input into a local variable
           int minumum=airplane[i].getMinimumRating();
           
            // for loop to check all pilots
           for(int j=0;j<pilot.length;j++ ) 
           {
                
                // checking if pilot rating is bigger or equal to the Aircraft rating
                if (pilot[j].getRating()>= minumum)
                {
                     // if it is true the pilot is assigned
                     airplane[i].assignPilot(pilot[j]);
                }

         }
            
           System.out.println(airplane[i].toString());   
       }
     
        return airplane; 
    
    }
    
    // Setuping flights
    public ArrayList<Flight> buildFlight(AirPlane[] airplane,ArrayList<Flight> flight)  
    {
       
        // for loop to setup a11 flights
        for(int i=0;i<=11;i++ ) 
       {
          
                    
           Flight flightnew = new Flight();
           
           //generating a origin of the Flight
           flightnew.setOrigin(irishAirports[rG.nextInt(irishAirports.length)]);
           
           // generating a destination of the Flight
           flightnew.setDestination(alternateCity[rG.nextInt(alternateCity.length)]);
           
           // generating a departure and arrival time 
           flightnew.schedule(departureTime[rG.nextInt(departureTime.length)],arrivalTime[rG.nextInt(arrivalTime.length)]);
           
           // generate a date of the Flight
           flightnew.setDate(dateTakeOff[rG.nextInt(dateTakeOff.length)]);
           
           // checking if the AirPlane is available
           boolean result = logic.CheckAirplaneAvailable(airplane, i);
           if (result == true)
           {
               flightnew.setPlane(airplane[i]);
               airplane[i].setAvailable(false);
           }
               
           // adding flight to array list
           flight.add(flightnew);
           
       } 
       
       for(Flight c : flight) {
           System.out.println(c);
        }  
       
        return flight; 
    }


}
