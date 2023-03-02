import java.util.Date;

public class EmployeeTest {

    public static void main(String args[]){
        Employee emp1 = Employee.getEmployee("Ram",new Date(),100.0);
        Employee emp2 = Employee.getEmployee("Shyam",new Date(),200.0);
        System.out.println(emp1.getDob());
        Date d1 = emp1.getDob();
        d1.setDate(1223);
        System.out.println(emp1.getDob());

    }
}
