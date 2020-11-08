package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//给定一个二叉树，返回它的 前序 遍历。
public class test114 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode tr = new TreeNode(1);
        tr.left = new TreeNode(2);
        tr.right = new TreeNode(3);
        List<Integer> list=preorderTraversal(tr);
        int x=0;
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        preorderTraversal1(root,list);

        return list;
    }
    public static void preorderTraversal1(TreeNode root,List<Integer> list) {
        if(root==null){
            return;
        }
        list.add(root.val);
        preorderTraversal1(root.left,list);
        preorderTraversal1(root.right,list);
    }
    public List<Integer> preorderTraversaldiedai(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode t = root;
        while (t != null || !stack.isEmpty()) {
            if (t == null) {
                t = stack.pop();
            }

            result.add(t.val);

            if (t.left != null) {
                if (t.right != null) {
                    stack.push(t.right);
                }
                t = t.left;
            } else {
                if (t.right != null) {
                    t = t.right;
                } else {
                    t = null;
                }
            }
        }
        return result;
    }

}

