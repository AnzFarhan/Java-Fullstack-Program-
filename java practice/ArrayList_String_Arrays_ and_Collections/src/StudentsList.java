import java.util.*;

public class StudentsList {

    public static void main(String[] args) {

        //Using ArrayList method type of string to store student name
        ArrayList<String> StudentName = new ArrayList<String>();
        StudentName.add("Farhan");
        StudentName.add("James");
        StudentName.add("Bob");
        StudentName.add("Mary");
        StudentName.add("John");

        //Convert the ArrayList<String> to String[]
        String[] studentNameArray = StudentName.toArray(new String[StudentName.size()]);
        //Print the result after convert arrayList to Array
        System.out.println("Convert to Array: " + Arrays.toString(studentNameArray));

        //Convert the Array to ArrayList
        ArrayList<String> studentNameArrayList = new ArrayList<>(Arrays.asList(studentNameArray));
        //Print the result after convert Array to ArrayList
        System.out.println("Convert to ArrayList: " + studentNameArrayList);

        //Perform the arraylist
        //sort the list of student
        Collections.sort(StudentName);
        System.out.println("List of Students: " + StudentName);
        //Remove the last student which is index 4
        StudentName.remove(4);
        System.out.println("Remove the last student: " + StudentName);
        //Add the new student at index 2
        StudentName.add(2,"Fahmi");
        System.out.println("Add new student: " + StudentName);
        //Replace the student in index 0 with new name
        StudentName.set(0, "Ronaldo");
        System.out.println("Replace the index 0 with new name: " + StudentName);

        //Check the name of contains letter 'a'
        System.out.println("To check the name of list contains 'a': " + StudentName.contains("a"));
        //convert name to UpperCase
        for (String name : StudentName) {
           if (StudentName.contains("a")) {
               String uppercaseName = name.toUpperCase();
               System.out.println("Convert name to Upper case: " + uppercaseName);
           }
        }




        //Print the list of student
        System.out.println("List of Students: " + StudentName);
    }
}
