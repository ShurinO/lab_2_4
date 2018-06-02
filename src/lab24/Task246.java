package lab24;

public class Task246 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int sign = 1;
            for (int j = 1; j <= i&&j>0; j+= sign) {
                System.out.print(j);
                if (j==i){
                    sign*=-1;
                }
            }
            System.out.println();
        }
    }
}
