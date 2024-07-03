package oop.task.three;

import org.jetbrains.annotations.NotNull;

public class Matrix {

    private final double[][] matrix;
    private final int rows;
    private final int cols;

    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public void setValue(int row, int col, double value) {
        matrix[row][col] = value;
    }

    private double getValue(int row, int col) {
        return matrix[row][col];
    }

    public void sum(@NotNull Matrix m) throws Exception {
        if (rows != m.rows || cols != m.cols) {
            throw new Exception("Matrix values don't match");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] += m.getValue(i, j);
            }
        }
    }

    public void multiplyByNum(double val) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= val;
            }
        }
    }

    public Matrix multiplyByMatrix(@NotNull Matrix m) throws Exception{
        if (cols != m.rows) {
            throw new Exception("Matrix cols and rows don't match");
        }

        Matrix result = new Matrix(rows, m.cols);
        double val = 0;

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows; k++) {
                val = 0;

                for (int j = 0; j < cols; j++) {
                    val += matrix[i][j] * m.getValue(j, k);
                }

                result.setValue(i, k, val);
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
