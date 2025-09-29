import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRun {

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        List<List<String>> result = new ArrayList<>();

        solverNQueens(result, board, 0, n);

        for (List<String> r : result) {
            for (String k : r) {
                System.out.println(k);
            }
            System.out.println();

        }

    }

    private static void solverNQueens(List<List<String>> result, char[][] board, int row, int n) {

        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solverNQueens(result, board, row + 1, n);
                board[row][col] = '.';
            }

        }

        return;

    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {

        for (int i = 0; i < row; i++) {

            if (board[i][col] == 'Q')
                return false;

        }

        // top left diagonal

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q')
                return false;

        }

        // top right diagonal

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 'Q')
                return false;

        }

        return true;
    }

    private static List<String> constructBoard(char[][] board) {

        List<String> res = new ArrayList<>();

        for (char[] row : board) {
            res.add(new String(row));
        }

        return res;

    }

}
