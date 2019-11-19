
    // this class uses the completed data structures fromSetUp
    // to display user choices from the Menu class methods
    // it will also have methods to create User Flight objects

package cctair;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 *
 */
public class Logic 
{
    
    // method to create a new flight. 
    public ArrayList<Flight> CreatingFlight(AirPlane[] airplane,ArrayList<Flight> flight, int answerquantity)
    {
            
           
            // for loop will be executed until the total entered for the user
            for(int j=0;j<answerquantity;j++)
            {
                    
                    // new flight
                    Flight newFlight = new Flight();
                    
                    
                    Scanner sc = new Scanner(System.in);
     
                    // display message 
                    System.out.println("Creating a new flight"); 
                    System.out.print("Type the Origin\n -> "); 
                    
                    // check if the value is valid                                   
                    String answerOrigin=CheckInput();
                    
                    // setting origin 
                    newFlight.setOrigin(answerOrigin);         
                    
                                    
                    // display message 
                    System.out.print("Type the Destination\n -> "); 
                    
                    // checking if the value is valid                                   
                    String answerDestination=CheckInput();
                    
                    // setting the destination of the flight
                    newFlight.setDestination(answerDestination);

                    // displaying message to the user
                    System.out.print("Departure time (HH:mm)\n -> "); 
                    
                    // receiving the departure time of the flight 
                    String answerDeparture = CheckInput();

                    // displaying message to the user
                    System.out.print("Arrival time (HH:mm)\n -> "); 
                    
                    // receiving the arrival time of the flight
                    String answerArrival = CheckInput();

                    // setting the schedule of the flight with departure and arrival
                    newFlight.schedule(answerDeparture,answerArrival);

                    // displaying message to the user
                    System.out.print("Type the date of the flight (dd/mm/yyyy)\n -> "); 
                    
                    // receiving flight date
                    String answerDate = CheckInput();
                    /**setting the date of the flight typed by the user*/
                    newFlight.setDate(answerDate);
                    
                    System.out.print("\n");

                    // listing available aircrafts
                     for(int i=0;i<airplane.length;i++)
                     {
                            if (airplane[i].getAvailable())
                            {
                                System.out.println("\n Identification: "+i+" "+airplane[i].toString()); 
                            }
                     }
                    // choosing a flight
                    System.out.println("Pick an Aircraft to your Flight"); 
                    
                    
                    int answerPlane = CheckInputInt();
                         
                    // set the Airplane to fly
                    newFlight.setPlane(airplane[Integer.valueOf(answerPlane)]);
                    
                    // set the Airplane as not available
                    airplane[Integer.valueOf(answerPlane)].setAvailable(false); 
                    
                    // calculating the flight number
                    String flightNumber = Integer.toString(j+1);
                    
                    
                    System.out.println("Flight "+ flightNumber +" created");
                    
                    // displaying the options of the flight to the user
                    System.out.println(newFlight.printFlight());
                    
                    flight.add(j, newFlight);
                  
            }
            
           
           return flight;
  
   }
    
    // checking if text is valid
    public String CheckInput(){
        
        Scanner sc = new Scanner(System.in);
       
        boolean answer=false;
                                        
        String answerOrigin="";
        while (!answer)
        {
            //receives the flight origin
            answerOrigin = sc.nextLine();

            if (answerOrigin.isEmpty()){
                System.out.println("The value is null.\n Please type again");  
            }else{
                answer=true;
            }
       }
        return answerOrigin;
    }
    
    
        public int CheckInputInt(){
        
        Scanner sc = new Scanner(System.in);
       
        boolean answer=false;
                                        
        int typedAnswer=0;
        while (!answer)
        {
            //receives the flight origin
            typedAnswer = sc.nextInt();

            if (typedAnswer<=0)
            {
                System.out.println("The value is invalid.\n Please type again");  
            }else{
                answer=true;
            }
       }
        return typedAnswer;
    }
    
    // check if the Airplane is available to fly
    public boolean CheckAirplaneAvailable(AirPlane[] airplane, int i)
    {
        // if airplane received by parameter not available, return false, else return true
        if (!airplane[i].getAvailable()){
            return false;
        }else{
            return true;
        }
        
     }
    
    // method to check the destination
    public void CheckFlight(ArrayList<Flight> flight)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type the Destination \n -> "); 
        String answerDestination = CheckInput();

        // for loop to check if destination is equal the answer typed by the user
        for(int i=0;i<flight.size();i++)
        {
           if (flight.get(i).getDestination().equals(answerDestination))
           {
               System.out.println(flight.get(i).printFlight());
           }

       }

    }
    
    // method to check the Airplane
    public void CheckAircraft(AirPlane[] airplane)
    {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type the Aircraft Make\n -> "); 
        String answeraircraft = sc.nextLine();

        // for loop to check if make is equal the answer typed by the user
         for(int i=0;i<airplane.length;i++)
         {
             if (airplane[i].getMake().equalsIgnoreCase(answeraircraft))
             {
                 System.out.println(airplane[i].toString()); 
             }
        }
    }
    
    
     // method to check Pilot
     public void CheckPilot(Pilot[] pilot)
     {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type Pilot name\n -> "); 
        String answerPilot = sc.nextLine();

        // for loop to check if Pilot name is equal the answer typed by the user
        for(int i=0;i<pilot.length;i++){
             if (pilot[i].getName().equalsIgnoreCase(answerPilot)){
                 System.out.println(pilot[i].toString()); 
             }

        }
     }
    
}
