package lab24;

import task.Calculation;
import task.Employee;
import task.MyMath;

public class Main {

    public static void main(String[] args) {
        Calculation.calc(); // обращаемся к статическому методу calc() класса Calculation
        Calculation calculation = new Calculation(); // создаем объект
        calculation.calc(); // неправильно обращаемся к статическому методу класса, как к обычному методу

        System.out.println("MyMath.areaOfCircle(10) = " + MyMath.areaOfCircle(10));

        Employee e1 = new Employee("Ivan", "Ivanov", "engineer", "123");
        Employee e2 = new Employee("Ivan", "Ivanov", "engineer", "123");
        Employee e3 = new Employee("Ivan", "Ivanov", "engineer", "123");
        e1 = new Employee();
        System.out.println(Employee.getNumberOfEmployees());
    }
}
