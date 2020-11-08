public class test72 {
//    给定一棵二叉树，判断琪是否是自身的镜像（即：是否对称）
    public static void main(String []arg){
        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(2);
        t.right=new TreeNode(1);
        System.out.println((isSymmetric(null)));
    }
    /**
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public static boolean isSymmetric (TreeNode root) {
        // write code here

        TreeNode t =getTree(root);
        return isEqual(root,t);
    }
    public static TreeNode getTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode t=new TreeNode(root.val);
        t.left=getTree(root.right);
        t.right=getTree(root.left);
        return t;
    }
    public static boolean isEqual(TreeNode root1, TreeNode root2){
        if((root1==null&&root2!=null)||(root2==null&&root1!=null)){
            return false;
        }
        if(root1==null&&root2==null){
            return true;
        }
        if(root1.val==root2.val){
            return isEqual(root1.left,root2.left)&isEqual(root1.right,root2.right);
        }else{
            return false;
        }

    }

}
