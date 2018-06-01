package task;

public class Calculation {
    public static void calc() {
        int[] a = {1, 6, 2, -5, 7, -2, 3};
        int[] b = {-1, -6, -2, 5, -7, 2, -3};
        int minA = MyMath.findMin(a);
        int minB = MyMath.findMin(b);
        int maxA = MyMath.findMax(a);
        int maxB = MyMath.findMax(b);
        System.out.println("minA = " + minA);
        System.out.println("minB = " + minB);
        System.out.println("maxA = " + maxA);
        System.out.println("maxB = " + maxB);
    }
}
