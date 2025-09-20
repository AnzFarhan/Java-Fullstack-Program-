//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import animals.elephant;
import animals.lion;
import staff.Zookeeper;
import utils.FeedingSchedule;


public class Main {
    public static void main(String[] args) {
        lion lion = new lion("Oyen");
        elephant elephant = new elephant("popopi");

        Zookeeper zookeeper = new Zookeeper("Farhan");

        FeedingSchedule lionSchedule = new FeedingSchedule("Lion", "9:00 A.M.");
        FeedingSchedule elephantSchedule = new FeedingSchedule("Elephant", "5 P.M.");

        lionSchedule.displaySchedule();
        elephantSchedule.displaySchedule();

        zookeeper.feedLion(lion);
        zookeeper.feedElephant(elephant);
    }
}