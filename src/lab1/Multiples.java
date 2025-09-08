package lab1;

public class Multiples {

    public static int multiples(int n, int a, int b) {

        int num = 0;

        for (int i = 1; i < n; i++) {

            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            if (divisibleBya || divisibleByb) {

                num += 1;

            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }
}