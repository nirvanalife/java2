package Leedcode;

import java.util.*;

/**
 *给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典中的单词
 */
public class test7 {
    public static void main(String[] args) {
        String beginWord="hit";
        String endWord="cog";
        List<String> wordList= Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(beginWord,endWord,wordList));

    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        boolean []marked=new boolean[wordList.size()];
        int level=1;
        while(!q.isEmpty()){
            level++;
            int size=q.size();
            while(size-->0){
                String cur=q.poll();
                for(int i=0;i<wordList.size();i++){
                    if(marked[i]) continue;
                    String dic=wordList.get(i);
                    if(helper(dic,cur)){
                        if(dic.equals(endWord)) return level;
                        q.add(dic);
                        marked[i]=true;
                    }
                }
            }

        }
        return 0;
    }
    public static boolean helper(String a,String b){
        int differ=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                differ++;
            }
        }
        return differ==1;
    }
}
