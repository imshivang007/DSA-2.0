import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {

    public boolean isSafe(char[][] board, int row, int col) {
        // Check horizontal on the left side
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // Check lower left diagonal
        for(int i=row,j=col;j>=0 && i<board.length;i++,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }

    public void savaBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        
        if (col == board.length) {
            savaBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char [][] board = new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }

    public static void main(String[] args) {
        NQueenProblem solver = new NQueenProblem();
        int n = 4; // Example: Solve for 4 Queens
        List<List<String>> solutions = solver.solveNQueens(n);
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
