package example.basics.mychoice;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSmallestStringFromLeaf {
  @Test
  public void testLeafNodeSmallest() {
    TreeNode root = new TreeNode();
    root.val = 0;
    root.left = new TreeNode(1);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(4);

    Assertions.assertEquals("dba", smallestFromLeaf(root));
  }

  public String smallestFromLeaf(TreeNode root) {
    if (root == null) return "";
    List<Integer> nodeList = new ArrayList<>();
    getNodeList(root, nodeList);
    System.out.println(nodeList);
    String result = "";
    for (Integer x : nodeList) {
      result += (char) (97 + x);
      // System.out.println();
    }
    StringBuilder sb = new StringBuilder();
    sb.append(result);
    return sb.reverse().toString();
  }

  public void getNodeList(TreeNode root, List<Integer> list) {
    if (root == null) return;
    list.add(root.val);
    int left = root.left != null ? root.left.val : Integer.MAX_VALUE;
    int right = root.right != null ? root.right.val : Integer.MAX_VALUE;

    if (left < right) getNodeList(root.left, list);
    else getNodeList(root.right, list);
  }

  public class TreeNode {
    TreeNode right;
    TreeNode left;
    int val;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
