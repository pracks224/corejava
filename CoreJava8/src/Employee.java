
import java.util.Date;
public final class Employee {

    private String name;
    private final Date dob;
    private double salary;

    public  Date getDob() {
        return dob;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    private static int counter = 0;


    private Employee(String name, Date dob, double salary){
        this.name = name;
        this.dob = dob;
        this.salary = salary;

    }

    public static  Employee getEmployee(String name, Date dob, double salary){
        if(counter<=2) {
            counter++;
            return new Employee(name, dob, salary);
        }
        return null;

    }







}