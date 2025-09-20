package Company;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;


    private String getName() {

        return name;
    }

    protected void setName(String name) {
        System.out.println("Name is : " + name);
        this.name = name;
    }

    protected int getAge() {

        return age;
    }

    protected void setAge(int age) {
        System.out.println("Age is : " + age);
        this.age = age;
    }

    protected double getSalary() {

        return salary;
    }


    private void setSalary(double salary) {
        System.out.println("Salary is : " + salary);
        this.salary = salary;
    }

    protected void myMethod() {
        System.out.println("Test This field or method should be accessible only within the same package.");
    }

    //functional for print details information manager
    public void printDetails() {//can accessing
        myMethod();
        setName("Farhan");
        setAge(23);
    }

    //package-private method
    void increaseSalary(double percentage){
        salary = salary + (percentage / 100);
        System.out.println("New Salary Increase in 10% of the salary: " + salary);
    }
}
