public class test3 {
//    二叉树的镜像定义：源二叉树
//    	               8
//                    /  \
//                    6   10
//                    / \  / \
//                    5  7 9 11
//    镜像二叉树
//    	               8
//                    /  \
//                    10   6
//                    / \  / \
//                    11 9 7  5
    /**
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
     */
    public static void main(String arg[]){
        TreeNode t=new TreeNode(3);
        t.left=new TreeNode(1);
        t.right=new TreeNode(2);

        System.out.println(getJX(t));
        int x=1;
    }
    public static TreeNode getJX(TreeNode t){


        if(t==null){
            return null;
        }else{
            TreeNode tt=t.left;
            t.left=getJX(t.right);
            t.right=getJX(tt);

        }

        return t;
    }

}
