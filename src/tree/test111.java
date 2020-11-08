package tree;

import java.util.ArrayList;
import java.util.List;

//分别按照二叉树先序，中序和后序打印所有的节点。
public class test111 {

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
        int [][]r=threeOrders(tr);
    }

    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */


    public static int[][] threeOrders (TreeNode root) {
        // write code here
        if(root==null){
            return null;
        }
        int length=nodeNum(root);
        int [][]result=new int[3][length];
        //先序
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        List<Integer> list3=new ArrayList<Integer>();
        first(root,list1);
        middle(root,list2);
        back(root,list3);
        for(int i=0;i<length;i++){
            result[0][i]=list1.get(i);
            result[1][i]=list2.get(i);
            result[2][i]=list3.get(i);
        }

        return result;
    }
    public static int nodeNum(TreeNode head) {
        if(head==null){
            return 0;
        }
        int left=nodeNum(head.left);
        int right=nodeNum(head.right);
        return left+right+1;
    }

    public static void first(TreeNode head,List<Integer> list1){
        if(head==null){
            return;
        }
        list1.add(head.val);
        first(head.left,list1);
        first(head.right,list1);
    }
    public static void middle(TreeNode head,List<Integer> list2){
        if(head==null){
            return;
        }
        middle(head.left,list2);
        list2.add(head.val);
        middle(head.right,list2);
    }
    public static void back(TreeNode head,List<Integer> list3){
        if(head==null){
            return;
        }
        back(head.left,list3);
        back(head.right,list3);
        list3.add(head.val);
    }
}
