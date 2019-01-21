package ink.lichen.leecode.test.test_1_21;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2019-1-21.
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
public class IsValidSudoku {


    public boolean isValidSudoku(char[][] board) {
        Set<Character> cross = new HashSet<Character>();
        Set<Character> vertical = new HashSet<Character>();
        Set<Character> other = new HashSet<Character>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (cross.contains(board[i][j]))
                        return false;
                    else
                        cross.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (vertical.contains(board[j][i]))
                        return false;
                    else {
                        vertical.add(board[j][i]);
                    }
                }

                int temp = i / 3;
                char tempVal = board[temp * 3 + j / 3][(j % 3) + (i % 3) * 3];
                if (tempVal != '.') {
                    if (other.contains(tempVal))
                        return false;
                    else {
                        other.add(tempVal);
                    }
                }


            }
            cross.clear();
            vertical.clear();
            other.clear();

        }

        return true;
    }
}
