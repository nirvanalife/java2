public class test11 {
//    输入一棵二叉树，判断该二叉树是否是平衡二叉树。
//
//    在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树

//    public boolean IsBalanced_Solution(TreeNode root) {
//
//    }
    public static void main(String []arg){
        TreeNode root=new TreeNode(5);
        root.right=new TreeNode(6);
//        root.left=new TreeNode(4);
        int length=calN(root);
        if(length!=-1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static int calN(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int l=calN(root.left);
            int r=calN(root.right);
            if(l!=r){
                return -1;
            }else{
                return l+1;
            }
        }
    }

}
