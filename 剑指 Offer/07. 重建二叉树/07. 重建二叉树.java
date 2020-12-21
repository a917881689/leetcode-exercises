/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 前序遍历 preorder = [A,B,D,E,C,F,G]
// 中序遍历 inorder  = [D,B,E,A,F,C,G]    ADFGHMZ
//                                       DBEAFCG
class Solution {
    int[] arr;
    HashMap<Integer, Integer> dic = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        arr = preorder;
        for (int i = 0; i < inorder.length; i++ ) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }
    4
    TreeNode recur(int root, int left, int right){
        // root 是root在前序的下标
        if(left > right) return null;
        TreeNode node = new TreeNode(arr[root]); // 在前序遍历中，用下标获取
        int i = dic.get(arr[root]);    // i = root节点在中序遍历的下标
        node.left = recur(root + 1, left, i - 1); // 在前序遍历中，用ROOT节点+1下标获取左子树节点
        // 在前序遍历中，右子树节点用ROOT节点在前序遍历的下标 +左子树的长度 再进行下标+1获取右子树节点
        // 左子树的长度(ROOT节点加上左子树的长度-ROOT节点的长度(left=i+1))  
        node.right = recur(root + (i - left) + 1, i + 1, right); 
        // 0 3 0 1
        // 4 5 5 1
        return node;
    }

}