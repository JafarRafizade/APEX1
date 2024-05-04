package Sudoku;

public class Solution {
    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] subBoxCheck = new boolean[9];

            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.' && rowCheck[board[i][j] - '1'])
                    return false;
                rowCheck[board[i][j] - '1'] = true;


                if (board[j][i] != '.' && colCheck[board[j][i] - '1'])
                    return false;
                colCheck[board[j][i] - '1'] = true;


                for (int k = 0; k < k + 3; k++) {
                    for (int l = 0; l < l + 3; l++) {
                        char c = board[i][j];
                        if (c != '.') {
                            int num = c - '1';
                            if (subBoxCheck[num]) return false;
                            subBoxCheck[num] = true;

                        }

                    }
                }
            }


        }
        return true;
    }

    public static void main(String[] args) {
        char[][] sudoku = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(sudoku));

    }
}
