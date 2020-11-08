import java.util.ArrayList;

public class test110 {
    //给定一棵完全二叉树的头节点head，返回这棵树的节点个数。如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public static void main(String[] args) {
       TreeNode tr=new TreeNode(1);
       tr.left=new TreeNode(2);
       tr.right=new TreeNode(3);
       tr.left.left=new TreeNode(4);
       tr.left.right=new TreeNode(5);
       tr.right.left=new TreeNode(6);
       tr.right.right=new TreeNode(7);
       System.out.println(nodeNum(tr));
    }
    public static int nodeNum(TreeNode head) {
        if(head==null){
            return 0;
        }
        int left=nodeNum(head.left);
        int right=nodeNum(head.right);
        return left+right+1;
    }





}
