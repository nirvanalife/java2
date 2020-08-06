import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test51 {
//    从上往下打印出二叉树的每个节点，同层节点从左至右打印。
//    思路：建立一个队列，初始化插入根节点，当队列不是空时，pop()出来一个节点，将节点值插入list，当节点有左节点，插入query，有右节点，插入query，pop()时候先放入的先弹出，
//    插入的子节点一定在父节点后面

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static void main(String []arg){
        TreeNode t=new TreeNode(5);
        t.left=new TreeNode(3);
        t.right=new TreeNode(7);
        t.left.left=new TreeNode(2);
        t.left.right=new TreeNode(4);
        t.right.left=new TreeNode(6);
        t.right.right=new TreeNode(8);
        System.out.println(PrintFromTopToBottom(t));

    }
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> query=new LinkedList<>();
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer> list=new ArrayList<>();
        query.add(root);
        while(!query.isEmpty())
        {
            TreeNode t=query.poll();
            list.add(t.val);
            if(t.left!=null) query.add(t.left);
            if(t.right!=null) query.add(t.right);

        }
        return list;
    }





}
