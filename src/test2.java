
 class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }


public class test2 {
//    输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
    public static void main(String[] arg){
        TreeNode t=new TreeNode(3);
        t.left=new TreeNode(1);
        t.right=new TreeNode(2);

        System.out.println(getDeep(t));

    }
    public static int getDeep(TreeNode t){
        if(t==null){
            return 0;
        }
        TreeNode lt=t.left;
        TreeNode rt=t.right;
        int ll;
        int rl;
        if(lt==null){
            ll=0;
        }else{
            ll=getDeep(lt);
        }
        if(rt==null){
            rl=0;
        }else{
            rl=getDeep(rt);
        }



        if(ll>rl){
            return ll+1;
        }else{
            return rl+1;
        }
    }

}
