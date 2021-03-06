package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-26.
 * <p>
 * <p>
 * 班上有 N 名学生。其中有些人是朋友，有些则不是。他们的友谊具有是传递性。
 * 如果已知 A 是 B 的朋友，B 是 C 的朋友，那么我们可以认为 A 也是 C 的朋友。所谓的朋友圈，是指所有朋友的集合。
 * <p>
 * 给定一个 N * N 的矩阵 M，表示班级中学生之间的朋友关系。如果M[i][j] = 1，表示已知第 i 个和 j 个学生互为朋友关系，否则为不知道。你必须输出所有学生中的已知的朋友圈总数。
 * <p>
 * 输入:
 * [[1,1,0],
 * [1,1,0],
 * [0,0,1]]
 * 输出: 2
 * 说明：已知学生0和学生1互为朋友，他们在一个朋友圈。
 * 第2个学生自己在一个朋友圈。所以返回2。
 */
public class FindCircleNum {

    private int n;

    public int findCircleNum(int[][] M) {
        n = M.length;
        int circleNum = 0;
        boolean[] hasVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!hasVisited[i]) {
                dfs(M, i, hasVisited);
                circleNum++;
            }
        }
        return circleNum;
    }

    private void dfs(int[][] M, int i, boolean[] hasVisited) {
        hasVisited[i] = true;
        for (int k = 0; k < n; k++) {
            if (M[i][k] == 1 && !hasVisited[k]) {
                dfs(M, k, hasVisited);
            }
        }
    }


//    public int findCircleNum(int[][] M) {
//        int n = M.length;
//        if (n <= 1) {
//            return n;
//        }
//        int num = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (M[i][j] == 1) {
//                    dfs(M, i, j);
//                    num++;
//                }
//
//            }
//        }
//        return num;
//    }
//
//    public void dfs(int[][] M, int i, int j) {
//        if (i >= 0 && i < M.length && j >= 0 && j < M.length) {
//            if (M[i][j] == 1) {
//                M[i][j] = 0;
//                M[j][i] = 0;
//                for (int z = 0;z < M.length; z++) {
//                    if (z == i){
//                        continue;
//                    }
//                    dfs(M, z, j);
//                }
//                for (int z = 0; z < M.length; z++) {
//                    if (z == j){
//                        continue;
//                    }
//                    dfs(M, i, z);
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        FindCircleNum findCircleNum = new FindCircleNum();
        findCircleNum.findCircleNum(new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        });
    }
}
