public class Lab3_1_4_Employee {
    int id,salary;
    String firstName,lastName;

    public Lab3_1_4_Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public String toString() {
        return "Employee[id = " + id + ",name = " + firstName + lastName + ",salary =" + salary + "]";
    }


}
