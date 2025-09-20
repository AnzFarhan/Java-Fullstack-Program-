import java.util.Arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student = new String[5];

        student[0] = "Farhan";
        student[1] = "James";
        student[2] = "Bob";
        student[3] = "Mary";
        student[4] = "John";

        //Sort the name of students
        Arrays.sort(student);
        //convert to array to string
        System.out.println("Sort name of student: " + Arrays.toString(student));
        //binary search
        String StudentTOSearch = "Farhan";
        int binarySearch = Arrays.binarySearch(student, StudentTOSearch);
        if (binarySearch >= 0) {
            System.out.println("Output of binary search " + StudentTOSearch + " is : " + binarySearch);
        }
        else {
            System.out.println("No such name student of : " + StudentTOSearch);
        }

          //Fill the array
          Arrays.fill(student, "Unknown");
          System.out.println("Modified array" + Arrays.toString(student));
    }
}
