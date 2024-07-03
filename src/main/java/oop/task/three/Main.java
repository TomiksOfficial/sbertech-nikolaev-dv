package oop.task.three;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(3, 2);

        matrix.print();
        matrix2.print();

        matrix.setValue(0, 0, 1);
        matrix.setValue(0, 1, 1);
        matrix.setValue(0, 2, 0);
        matrix.setValue(1, 0, 2);
        matrix.setValue(1, 1, -1);
        matrix.setValue(1, 2, 2);

        matrix.print();

        matrix2.setValue(0, 0, 2);
        matrix2.setValue(0, 1, 1);
        matrix2.setValue(1, 0, 0);
        matrix2.setValue(1, 1, 3);
        matrix2.setValue(2, 0, 1);
        matrix2.setValue(2, 1, 2);

        matrix2.print();

        try {
            matrix.sum(matrix2);
            matrix.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Matrix result = matrix.multiplyByMatrix(matrix2);
            result.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
