package base.task.three;

public final class Task {
    private static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void doTask() {
        for(int i = 2; i <= 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
}
