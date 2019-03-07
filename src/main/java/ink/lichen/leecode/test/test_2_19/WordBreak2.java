package ink.lichen.leecode.test.test_2_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2019-3-7.
 * 输入:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * 输出:
 * [
 *   "cats and dog",
 *   "cat sand dog"
 * ]
 *
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。
 * 返回所有这些可能的句子。
 *说明：
 * 分隔时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 *
 */
public class WordBreak2 {

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        List<String> result = new ArrayList<>();
        dfs(result,new StringBuilder(),s,0,set);
        return result;
    }

    public void dfs(List<String> result,StringBuilder string,String s,int start,Set<String> set){
        if (start == s.length()){
            result.add(new StringBuilder(string).toString());
            return;
        }
        for (int i = start; i < s.length() ; i++){
            String substring = s.substring(start,i+1);
            if (!set.contains(substring)){
                continue;
            }

            int begin;
            int end;
            if (string.length()==0){
                string.append(substring);
                begin = 0;
            }else {
                begin = string.length()-1;
                string.append(" ").append(substring);
            }
            end = string.length();

            dfs(result,string,s,i+1,set);
            string.delete(begin,end);
        }
    }


    public static void main(String[] args) {
        WordBreak2 wordBreak2 = new WordBreak2();
        wordBreak2.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
    }
}
