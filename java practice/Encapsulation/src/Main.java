public class Main {
    public static void main(String[] args) {

        //Create new Student object
        //set the value
        Student student = new Student("farhan",23, "9th grade", 3.8);

        //set the value using set() method from Student class
//        student.setName("Farhan");
//        student.setAge(23);
//        student.setGrade("9th Grade");
//        student.setGpa(3.0);

        //get the value using get() method from Student class
        String name = student.getName();
        int age = student.getAge();
        String grade = student.getGrade();
        double gpa = student.getGpa();

        System.out.println("* Student Information *");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getGrade());
//        System.out.println(student.getGpa());

        //Print out the information student
        System.out.println("Name Student : " + name);
        System.out.println("Age Student : " + age);
        System.out.println("Grade Student : " + grade);
        System.out.println("Grade Pointer Average : " + gpa);
    }
}