
public class test69 {
//    给定一个二叉树和一个值\ sum sum，判断是否有从根节点到叶子节点的节点值之和等于\ sum sum 的路径，


    public static void main(String []arg){
        TreeNode t=new TreeNode(5);
        t.left=new TreeNode(4);
        t.right=new TreeNode(8);
        t.left.left=new TreeNode(1);
        t.left.right=new TreeNode(11);
        t.right.right=new TreeNode(9);
        t.left.right.left=new TreeNode(2);
        t.left.right.right=new TreeNode(7);
//        TreeNode t=new TreeNode(1);
//        t.left=new TreeNode(2);
        TreeNode tt=null;
        System.out.println(hasPathSum(tt,0));
    }

    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    public static boolean hasPathSum (TreeNode root, int sum) {
        // write code here

        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null&&sum==root.val){
            return true;
        }
        if(root.left==null&&root.right==null){
            return false;
        }
        boolean suml=false;
        boolean sumr=false;

        suml=hasPathSum(root.left,sum-root.val);
        sumr=hasPathSum(root.right,sum-root.val);
        return suml||sumr;
    }
}
