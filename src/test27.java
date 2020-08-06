import java.util.ArrayList;

public class test27 {
//    从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
    /*
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

    public static void main(String []arg){
        TreeNode t=new TreeNode(5);
        t.left=new TreeNode(3);
        t.right=new TreeNode(7);
        t.left.left=new TreeNode(1);
        t.left.right=new TreeNode(4);
        t.right.left=new TreeNode(6);
        t.right.right=new TreeNode(8);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        depth(t,1,list);
        System.out.println(list);



    }

    public static void depth(TreeNode root,int deep,ArrayList<ArrayList<Integer>> list){
        if(root==null){
            return;
        }
        if(deep>list.size()){
            list.add(new ArrayList<>());
        }
        list.get(deep-1).add(root.val);
        depth(root.left,deep+1,list);
        depth(root.right,deep+1,list);
    }

}
