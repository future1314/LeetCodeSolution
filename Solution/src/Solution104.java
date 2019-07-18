import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      104.Maximum Depth of Binary Tree/二叉树的最大深度
 *      https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *      https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/solution/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      94.Binary Tree Inorder Traversal
 *      98. Validate Binary Search Tree
 *      110.Balanced Binary Tree
 *      111.Minimum Depth of Binary Tree
 *      112.Path Sum
 *      113. Path Sum II
 *      129.Sum Root to Leaf Numbers
 *      144.Binary Tree Preorder Traversal
 *      145.Binary Tree Postorder Traversal
 *      222.Count Complete Tree Nodes
 *      230.Kth Smallest Element in a BST
 *      687.Longest Univalue Path
 *      965.Univalued Binary Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution104 {

    /**
     * 1.关于复杂度
     *    1.1 时间复杂度为O(n)
     *    1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 解法基于深度优先遍历
     *   2.2 递归获取左右子树的深度
     *   2.3 对比左右子树的深度，返回较大的一个加上1
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗38.2MB内存
     *   3.2 leetcode中耗时0ms,消耗40.2MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 compare with left tree and right tree depth,return its max value+1
     * 3.About submit record
     *     3.1 1ms and 38.2MB memory in LeetCode China
     *     3.2 0ms and 40.2MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int maxDepth(BinaryTreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            int depth=Math.max(left,right)+1;
            return depth;
        }
    }
}
