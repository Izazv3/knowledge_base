package JAVA.RECURSION;

import java.util.*;

// NOT SOLVED

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        result = solverNQueens(result, board, n);

        for (List<String> r : result) {
            for (String k : r) {
                System.out.println(k);
            }
            System.out.println();

        }

    }

    private static List<List<String>> solverNQueens(List<List<String>> result, char[][] board, int n) {

        solve(result, board, 0, n);

        return result;
    }

    private static void solve(List<List<String>> result, char[][] board, int row, int n) {

        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                solve(result, board, row + 1, n);
                board[row][col] = '.';

            }
        }

    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private static List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] b : board) {
            res.add(new String(b));
        }
        return res;
    }
}
