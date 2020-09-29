package keepgoing.LeetCode.demo01Stack;
/*
    LeetCode：Stack_145
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 定义一棵树
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // 构造方法：
    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
//        treeNode1.left = treeNode3;
//        treeNode1.right = treeNode4;
//        treeNode3.right = treeNode5;
        System.out.println(postorderTraversal(treeNode));
    }
    // 递归后续遍历
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        return postorderTraversal1(root,list);
    }
    public static List<Integer> postorderTraversal1(TreeNode root,List list){
//        Stack<Integer> stack= new Stack<Integer>();
        if(root != null){
            postorderTraversal1(root.left,list);
            postorderTraversal1(root.right,list);
            list.add(root.data);
        }
        return list;

    }

//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }

//    public static List<Integer> postorderTraversal(TreeNode root) {
//        Stack<Integer> stack = new Stack<Integer>();
//
//        return null;
//    }
}
