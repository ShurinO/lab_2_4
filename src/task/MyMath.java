package task;

public class MyMath {

    final static double PI = 3.14;

    public static double areaOfCircle(double radius) {
        return PI*radius*radius;
    }

    public static int findMin(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<res) {
                res = arr[i];
            }
        }
        return res;
    }

    public static int findMax(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>res) {
                res = arr[i];
            }
        }
        return res;
    }
}
