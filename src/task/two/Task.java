package task.two;

public class Task {
    public static void doTask() {
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 100);

            System.out.print(arr[i] + "\t");

            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }

            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }

        System.out.println("");

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
