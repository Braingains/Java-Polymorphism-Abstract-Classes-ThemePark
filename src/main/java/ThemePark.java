import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> allReviewed;
    private HashMap<Object, Integer> reviews;

    public ThemePark (String name){
        this.name = name;
        this.attractions = new ArrayList <Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviews = new HashMap<>();
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public ArrayList getAllReviewed() {
        return this.allReviewed;
    }

    public void AddToReviewed (IReviewed reviewed) {
        this.allReviewed.add(reviewed);
    }

    public String getName() {
        return this.name;
    }

    public void visit (Visitor visitor, Attraction attraction) {
        attraction.increaseVisitCount();
        visitor.visitAttraction(attraction);
    }





}
