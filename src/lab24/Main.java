package lab24;

import task.Calculation;
import task.MyMath;

public class Main {

    public static void main(String[] args) {
        Calculation.calc(); // обращаемся к статическому методу calc() класса Calculation
        Calculation calculation = new Calculation(); // создаем объект
        calculation.calc(); // неправильно обращаемся к статическому методу класса, как к обычному методу

        System.out.println("MyMath.areaOfCircle(10) = " + MyMath.areaOfCircle(10));
    }
}
