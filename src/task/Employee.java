package task;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String phone;

    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.phone = phone;
        numberOfEmployees++;
    }

    public Employee() {
        this("noname","-","-","-");
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

}
