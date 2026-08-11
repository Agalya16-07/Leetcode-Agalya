// Last updated: 8/11/2026, 5:51:58 PM
class Solution {

    public boolean validTicTacToe(String[] board) {

        int xCount = 0;
        int oCount = 0;

        for (String row : board) {
            for (char ch : row.toCharArray()) {
                if (ch == 'X')
                    xCount++;
                else if (ch == 'O')
                    oCount++;
            }
        }

        // Move count must be valid
        if (oCount > xCount || xCount > oCount + 1)
            return false;

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        // Both players cannot win
        if (xWin && oWin)
            return false;

        // If X wins, X must have one extra move
        if (xWin && xCount != oCount + 1)
            return false;

        // If O wins, counts must be equal
        if (oWin && xCount != oCount)
            return false;

        return true;
    }

    private boolean win(String[] board, char ch) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == ch &&
                board[i].charAt(1) == ch &&
                board[i].charAt(2) == ch)
                return true;
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == ch &&
                board[1].charAt(j) == ch &&
                board[2].charAt(j) == ch)
                return true;
        }

        // Main diagonal
        if (board[0].charAt(0) == ch &&
            board[1].charAt(1) == ch &&
            board[2].charAt(2) == ch)
            return true;

        // Anti-diagonal
        if (board[0].charAt(2) == ch &&
            board[1].charAt(1) == ch &&
            board[2].charAt(0) == ch)
            return true;

        return false;
    }
}