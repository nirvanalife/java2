package tree;
//给定一个二叉树，返回该二叉树层序遍历的结果
/**
 * 思路：层序遍历使用队列，放入后每次删除根节点
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test112 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode tr=new TreeNode(3);
        tr.left=new TreeNode(9);
        tr.right=new TreeNode(20);
        tr.left.left=new TreeNode(15);
        tr.left.right=new TreeNode(7);
        ArrayList<ArrayList<Integer>> result=levelOrder(tr);

    }
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<TreeNode> quene=new LinkedList<>();
        quene.offer(root);

        while(!quene.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();
            int size=quene.size();
            for(int i=0;i<size;i++){
                if(quene.peek().left!=null){
                    quene.offer(quene.peek().left);
                }
                if(quene.peek().right!=null){
                    quene.offer(quene.peek().right);
                }
                level.add(quene.poll().val);
            }
            res.add(level);
        }


        // write code here
        return res;
    }
}
