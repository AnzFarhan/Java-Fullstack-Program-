package utils;

// Import statements
import java.util.ArrayList;
import java.util.List;

public class FeedingSchedule {
    private String animalType;
    private String feedingTime;

    public FeedingSchedule(String animalType, String feedingTime) {
        this.animalType = animalType;
        this.feedingTime = feedingTime;
    }
    //print message
    public void displaySchedule() {
        System.out.println(animalType + " feeding time: " + feedingTime);
    }

}
