package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci < 1) {
            return;
        }
        int n0 = 1;
        int n1 = 1;

        if (lastFibonacci == 1) {
            System.out.println(n0);
            return;
        } else if (lastFibonacci == 2) {
            System.out.println(n0);
            System.out.println(n1);
        } else {
            int n2;
            for (int i = 3; i <= lastFibonacci; i++) {
                n2 = n0 + n1;
                System.out.println(n2);
                n0 = n1;
                n1 = n2;
            }
        }
    }
}
