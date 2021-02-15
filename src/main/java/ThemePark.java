import attractions.*;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark (String name){
        this.name = name;
        this.attractions = new ArrayList <Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList getAllReviewed() {
        ArrayList<Object> AllReviewed = new ArrayList<Object>();
        AllReviewed.add(new Dodgems("Bumper Cars", 5));
        AllReviewed.add(new Park("Leafy Meadows", 9));
        AllReviewed.add(new Playground("Fun Zone", 7));
        AllReviewed.add(new RollerCoaster("Blue Ridge", 10));
        AllReviewed.add(new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 7));
        AllReviewed.add(new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 8));
        AllReviewed.add(new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5));
        return AllReviewed;
    }

    public String getName() {
        return this.name;
    }

    public void visit (Visitor visitor, Attraction attraction) {
        attraction.increaseVisitCount();
        visitor.visitAttraction(attraction);
    }



}
