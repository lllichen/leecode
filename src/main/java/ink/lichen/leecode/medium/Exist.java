package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-19.
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * 给定 word = "ABCCED", 返回 true.
 * 给定 word = "SEE", 返回 true.
 * 给定 word = "ABCB", 返回 false.
 */
public class Exist {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {

                    if (findNext(i, j, 0, word, board)) {
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public boolean findNext(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }
        if (board[i][j] != word.charAt(index)){
            return false;
        }

        char source = board[i][j];
        board[i][j] = '0';

        boolean result = findNext(i-1,j,index+1,word,board)||
                findNext(i+1,j,index+1,word,board)||
                findNext(i,j-1,index+1,word,board)||
                findNext(i,j+1,index+1,word,board);
        board[i][j] = source;
        return result;
    }


    public static void main(String[] args) {
        char[][] board = {
                {'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}
        };
        Exist exist = new Exist();
        System.out.println(exist.exist(board,"AAB"));

    }
}
