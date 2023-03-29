/**
 * SudokuPuzzle
 */
public class SudokuPuzzle {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }

        }
        // row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        // grid
        int StartR = 3 * (row / 3);
        int StartC = 3 * (col / 3);
        for (int i = StartR; i < StartR + 3; i++) {
            for (int j = StartC; j < StartC + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;

        } else {
            nrow = 0;
            ncol = col + 1;
        }
        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }

        } else {
            // fill the place
            for (int i = 0; i < 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';

                    }
                }
            }
        }
        return false;

    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}