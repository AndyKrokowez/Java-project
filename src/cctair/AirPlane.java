/**
 * This class creates a blueprint for an AirPlane object.
 * It requires a Pilot object.
 *
 */
package cctair;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 *
 */
public class AirPlane 
{
    private Pilot pilot; //Pilot object.
    private String make; //type of plane
    private String model; // model of plane
    private int capacity; //number of seats
    private int minimumRating; //minimum rating for pilot
    private boolean available = true;
    
    
    //default constructor
    public AirPlane(){}
    
    //  parameters used to construct
    public AirPlane(String make, String model, int capacity, Pilot pilot)
    {
    
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
        this.available = false;
    
    }        
        // GETTERS AND SETTERS 
    
    public Pilot getPilot() {
        return pilot;
    }

    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int capacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
     public boolean getAvailable()
    {
        return this.available;
    }
    
    public void setAvailable(boolean available)
    {
        this.available=available;
    }

    public int getMinimumRating() 
    {
        return minimumRating;
    }

    public void setMinimumRating(int minimumRating) 
    {
        this.minimumRating = minimumRating;
    }
    
      
    /**
     * This method overrides the toString method in the Object class.
     * It returns useful information about an airplane.
     * 
     *
     * @return  */
    
    @Override
    public String toString() 
    {
      
        return "Aircraft Information"+"\n"+ "Aircraft: "+make+ ", "+model+ ", "+"\n"+ "Number of Seats: "+capacity+ " seats"+"\n"+ "Rating: "+ minimumRating + "\n" + "Pilot: "+pilot.toString();
    }

   /** This method will print the information about the aircraft 
   *   Aircraft : insert make insert model 
   *   Capacity: ___ seats 
   *   Pilot: ____    
   * @return print
   */    
    
    public String printPlane() 
    {
        return "Aircraft: " + make + " " + model + "\n" +"Number of Seats: " + capacity + " seats"+"\n" + pilot.printPilot();
    }        
            
}
