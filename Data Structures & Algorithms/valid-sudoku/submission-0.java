class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Row traversal
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char curr = board[i][j];
                if (curr == '.')
                    continue;
                if (seen.contains(curr))
                    return false;
                seen.add(curr);
            }
        }
        // Column Traversal
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char curr = board[j][i];
                if (curr == '.')
                    continue;
                if (seen.contains(curr))
                    return false;
                seen.add(curr);
            }
        }
        // check 3 X 3 box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkBoard(board, i, j))
                    return false;
            }
        }
        return true;
    }

    private boolean checkBoard(char[][] board, int i, int j) {
        Set<Character> seen = new HashSet<>();
        for (int m = i; m < i + 3; m++) {
            for (int n = j; n < j + 3; n++) {
                char curr = board[m][n];

                if (curr == '.')
                    continue;

                if (seen.contains(curr))
                    return false;

                seen.add(curr);
            }
        }

        return true;
    }
}