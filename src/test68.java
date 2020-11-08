public class test68 {
//    求给定二叉树的最大深度，
//最大深度是指树的根结点到最远叶子结点的最长路径上结点的数量。




    public static void main(String []arg){
        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(2);
        t.right=new TreeNode(3);
        t.left.left=new TreeNode(4);
        t.right.right=new TreeNode(5);
        System.out.println(maxDepth(t));
    }



    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    public static int maxDepth (TreeNode root) {
        // write code here
        if(root==null){
            return 0;
        }
        int ld=maxDepth(root.left);
        int rd=maxDepth(root.right);
        int max=0;
        max= Math.max(ld, rd);
        return max+1;
    }


}
