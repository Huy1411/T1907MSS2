import java.util.Scanner;

public class Lab3_1_4_TheEmployee {
    public static void main(String[] args) {
        int id,salary;
        String firstName,lastName;;

        Scanner s = new Scanner(System.in);
        System.out.print("FirstName:");
        firstName = s.next();
        System.out.print("LastName:");
        lastName = s.next();
        System.out.print("ID:");
        id = s.nextInt();
        System.out.print("Salary");
        salary = s.nextInt();
        Lab3_1_4_Employee c = new Lab3_1_4_Employee(id ,salary, firstName, lastName);
        System.out.println("Salary: " + c.getSalary());
        System.out.println("AnnualSalary: " +c.getAnnualSalary());
        System.out.println(c.toString());

    }
}
