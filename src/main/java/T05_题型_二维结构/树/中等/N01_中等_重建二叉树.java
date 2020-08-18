package T05_题型_二维结构.树.中等;

import java.util.Arrays;

/**
 * 解法：递归
 *
 * 前序遍历：3 9 20 15 7
 * 中序遍历：9 3 15 20 7
 *
 * 前序遍历的首个元素即为根节点 root 的值；
 * 在中序遍历中搜索根节点 root 的索引 ，可将中序遍历划分为 [ 左子树 | 根节点 | 右子树 ] 。
 * 根据中序遍历中的左（右）子树的节点数量，可将前序遍历划分为 [ 根节点 | 左子树 | 右子树 ] 。
 *
 * 自此可确定 三个节点的关系 ：
 * 1.树的根节点、2.左子树根节点、3.右子树根节点（即前序遍历中左（右）子树的首个元素）。
 *
 * 子树特点：
 * 子树的前序和中序遍历仍符合以上特点，以题目示例的右子树为例：
 * 前序遍历：[20 | 15 | 7]，中序遍历 [ 15 | 20 | 7 ] 。
 *
 * 根据子树特点，我们可以通过同样的方法对左（右）子树进行划分，每轮可确认三个节点的关系 。
 * 此递推性质让我们联想到用 递归方法 处理。
 *
 */
public class N01_中等_重建二叉树 {


    /**
     * 根据前序遍历和中序遍历重建二叉树
     * @param pre 前序遍历数组
     * @param in 中序遍历数组
     * @return 重建后的二叉树
     */
    TreeNode reConstructBinaryTree(int[] pre ,int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) return null;
        if (pre.length != in.length) return null;

        TreeNode root = new TreeNode(pre[0]);//前序遍历第一个元素是根节点
        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre ,1 ,i + 1) ,
                        Arrays.copyOfRange(in ,0 ,i));

                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre ,i + 1 ,pre.length) ,
                        Arrays.copyOfRange(in ,i + 1 ,in.length));
            }
        }
        return root;
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
