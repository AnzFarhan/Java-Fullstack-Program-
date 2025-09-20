import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentListToArray {        //overloaded constructor with Arraylist
    public static int findStudentByName(ArrayList<String> Students ,String name){
        return Students.indexOf(name);
    }
    public static void main(String[] args) {

        //Using ArrayList method type of string to store student name
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("Aishah");
        Students.add("James");
        Students.add("Aiman");
        Students.add("Ariff");
        Students.add("John");

        //Create new integer array
        int[] scores = {85, 92, 76, 88, 90};
        int[] scores2 = {85, 92, 76, 88, 90};

        //sort the array method
        System.out.println("Print value in sort: " + Arrays.toString(scores));
        //Compare the array score and score2 it's same or not
        System.out.println("Print value Score and score2 it's same?: " +  Arrays.equals(scores, scores2));

//        Convert the ArrayList<String> to String[]
        String[] studentNameArray = Students.toArray(new String[Students.size()]);
//        Print the result after convert arrayList to Array
        System.out.println("Convert to Array: " + Arrays.toString(studentNameArray));

//        Convert the Array to ArrayList
        ArrayList<String> studentNameArrayList = new ArrayList<>(Arrays.asList(studentNameArray));
//        Print the result after convert Array to ArrayList
        System.out.println("Convert to ArrayList: " + studentNameArrayList);

        for (String name : Students){
            String lengthName = name.length()+" ";
            System.out.println("Length of each student: " + lengthName);
        }

        for (String name : Students){
         if (name.startsWith("A")){
                System.out.println("Print the value name those start with 'A': " + name);}
        }

        for (String name : Students) {
                    String replaceVal = name.replaceAll("[aeiou]","*");
                    System.out.println("Replace the value name those contains a,e,i,o,u with (*): " + replaceVal);
            }

        //want name from student name in array list
        String nameToFind = "Aishah";
        int index = findStudentByName(Students, nameToFind);

        //get index 0 from students name in array list
        if(index == 0){
            System.out.println("That name exist");
        }
        else {
            System.out.println("That name does not exist");
        }

        //Sort reverse the students name in alphabetical
        Collections.sort(Students, Collections.reverseOrder());
        System.out.println("Reverse order of alphabetical in name students: " + Arrays.toString(Students.toArray()));    }
}