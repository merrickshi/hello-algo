package BinaryTree;

/**
 *
 *
 * @author merrick
 * @date 2025/9/4 15:31:20
 */
public class Basic {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int[] result = calc(matrix);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] calc(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] output = new int[rows * columns];
        int index = 0;
        for (int row = rows - 1; row >= 0; --row) {
            for (int column = columns - 1; column >= 0; --column) {
                output[index++] = matrix[row][column];
            }
        }
        return output;
    }

}