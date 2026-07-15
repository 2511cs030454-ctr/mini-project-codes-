

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person details created");
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    protected int empId;
    protected double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
        System.out.println("Employee details created");
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);
        this.department = department;
        System.out.println("Manager details created");
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class CompanyApp {
    public static void main(String[] args) {

        Manager m = new Manager("Chandu", 20, 101, 60000, "IT");

        System.out.println("\nManager Details:");
        m.displayEmployee();
    }
}