package Leedcode;

/**
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 *
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 *
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *

 */
public class test3 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(4);
        t.left=new TreeNode(9);
        t.right=new TreeNode(0);
        t.left.left=new TreeNode(5);
        t.left.right=new TreeNode(1);
        System.out.println(sumNumbers(t));
    }
    public static int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }

        int x=sumN(root,0);
        return x;



    }
    public static int sumN(TreeNode root,int val){
        if(root==null){
            return 0;
        }

        int sum=val*10+root.val;
        if(root.left==null&&root.right==null){

            return sum;
        }
        return sumN(root.left,sum)+sumN(root.right,sum);



    }



}
