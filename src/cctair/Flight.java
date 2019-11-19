/**
 * This class creates a blueprint for a Flight object.
 * It requires a Pilot object and an AirPlane object.
 * 
 */
package cctair;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 * 
 */
public class Flight 
{
    
    private String origin; //where the flight is coming from
    private String destination; //where the flight is flying to
    private AirPlane plane; //Airplane object
    private String departureTime; //flight departure
    private String arrivalTime; //flight arrival
    private String date; //flight date
    
    
    // default constructor
    public Flight(){}
    
    
    //  parameters used to construct
    public Flight (String origin,String destination,String date,AirPlane plane)
    {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.plane = plane;
        
    }
    
    // method to schedule arrival time
    public void schedule(String arrivalTime) 
    {
        this.arrivalTime=arrivalTime;
    }
    
    // method to schedule arrival and departure time time      
    public void schedule(String arrivalTime, String departureTime){
        this.arrivalTime=arrivalTime;
        this.departureTime=departureTime;
    } 

        
          //  GETTERS AND SETTERS
    
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public AirPlane getPlane() {
        return plane;
    }

    public void setPlane(AirPlane plane) {
        this.plane = plane;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

     
   /** This method is print the information 
* Flight Information: 
* Date: insert date of flight
* From: insert origin to insert destination 
* Departure time: insert departure time to insert arrival time                   
*
*Plane Information:
* Aircraft : insert make insert model 
* Capacity: ___ seats 
* Pilot: _____ */

    public String printFlight() 
    {
        
        String flight = "Flight Information: " + "\n"+"Date: " + date +"\n"+"From: " + origin + "\n" + "to: " + destination + "\n"+ "Departure time: " + departureTime + " to: " + arrivalTime +  "\n";
        
        String plain  = "Plane Information: " + "\n"+ plane.printPlane() + "\n";
     
        return flight+"\n"+plain;
    }
    
    
    
    /**
     * This method overrides the toString method in the Object class.
     * It returns useful information about a flight.
     * @return 
     */
    
    @Override
    public String toString() 
    {
        //return "Flight{" + "origin=" + origin + ", destination=" + destination + ", plane=" + plane + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", date=" + date + '}';
        return "Flight Information"+"\n"+ "Date: "+ date +"\n"+ "From: "+ origin + "\n" + "to: "+ destination +"\n"+ "Flight Time: "+ departureTime +" to: "+arrivalTime+"\n"+ "Aircraft: "+plane.toString();
        
    }
    
}
