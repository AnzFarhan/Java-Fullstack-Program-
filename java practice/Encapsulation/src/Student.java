public class Student {
    private String name;
    private int age;
    private String grade;
    private double gpa;

    //constructor - maksudnya kita dah declare value nak kan dapat object camtu pindah ke main class
    public Student(String name, int age, String grade, double gpa) {

        this.name = name;
        setAge(age);
        this.grade = grade;
        setGpa(gpa);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Age must be between 5 and 100.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
        else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
    }
}

