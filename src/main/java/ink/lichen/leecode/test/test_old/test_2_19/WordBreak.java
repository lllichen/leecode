package ink.lichen.leecode.test.test_old.test_2_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * Created by lichen@daojia.com on 2019-3-7.
 */
public class WordBreak {


    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 0 ; i < s.length();i++){
            for (int j = i;j >=0; j--){
                String substring = s.substring(j,i+1);
                if (set.contains(substring) && dp[j]){
                    dp[i+1] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        wordBreak.wordBreak("a", Arrays.asList("a"));
    }
}
