/**
 * This class creates a blueprint for a Pilot object.
 * 
 * 
 */


package cctair;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 * 
 */
public class Pilot 
{
    private String name; //pilot's name
    private int rating; //type of plane a pilot can fly
    private String aircraftType; //define the size of the aircraft 
    
    // default constructor
    public Pilot(){}
    
//  parameters used to construct
    public Pilot(String name, int rating, String aircraftType) 
    {
        this.name = name;
        this.rating = rating;
        this.aircraftType = aircraftType;
    }

    

// GETTERS AND SETTERS
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    
    // This method returns the name of a pilot assigned in the aircraft
    @Override
    public String toString() 
    {
        return "Pilot: " + "Name = " + name + "\n" + "Rating = " + rating + "\n" + "Type of Aircraft = " + aircraftType + "\n";
    }
    
    // method used to print the name of the pilot
    public String printPilot() 
    {
        return "Pilot: " + name;
    }
    
    
}
