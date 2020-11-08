public class test62 {
//    合并树
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static void main(String []arg)
    {
       TreeNode t1=new TreeNode(1);
       t1.left=new TreeNode(3);
       t1.right=new TreeNode(2);
       t1.left.left=new TreeNode(5);
       TreeNode t2=new TreeNode(2);
       t2.left=new TreeNode(1);
       t2.right=new TreeNode(3);
       t2.left.right=new TreeNode(4);
       t2.right.right=new TreeNode(7);
       TreeNode t3=mergeTrees(t1,t2);

    }

    public static TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if(t1==null&&t2==null){
            return null;
        }else if(t1==null){
            return t2;
        }else if(t2==null){
            return t1;
        }else{
            TreeNode t=new TreeNode(t1.val+t2.val);
            TreeNode tl=mergeTrees(t1.left,t2.left);
            TreeNode tr=mergeTrees(t1.right,t2.right);
            t.left=tl;
            t.right=tr;
            return t;
        }

    }
}
