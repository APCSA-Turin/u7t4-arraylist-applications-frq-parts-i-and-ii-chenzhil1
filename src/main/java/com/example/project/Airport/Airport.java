package com.example.project.Airport;
import java.util.ArrayList;

public class Airport  {
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights) {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights() {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue(){
      double total = 0;
      for(Flight flight : allFlights) {
        if(flight.getNumPassengers() < flight.getCapacity()) {
          total += flight.getPrice() * flight.getNumPassengers();
        }
        else {
          total += flight.getPrice() * flight.getCapacity();
        }
      }
      return total;
    }
    
      

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights() {
        int removedPassengers = 0;
        for (int i = 0; i < allFlights.size(); i ++) {
          Flight thisFlight = allFlights.get(i);
          if(thisFlight.getNumPassengers() < thisFlight.getCapacity() * 0.2) {
            removedPassengers += thisFlight.getNumPassengers();
            allFlights.remove(i);
            i --;
          }
        }
        return removedPassengers;
      }
      
}