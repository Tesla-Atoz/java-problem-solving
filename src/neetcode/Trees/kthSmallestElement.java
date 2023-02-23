package neetcode.Trees;

import java.util.*;

public class kthSmallestElement {
  public int kthSmallest(TreeNode root, int k) {
    List<Integer> list = new ArrayList<>();
    inorder(root, list);
    return list.get(k - 1);
  }

  private void inorder(TreeNode root, List<Integer> list) {
    if (root == null)
      return;

    inorder(root.left, list);
    list.add(root.val);
    inorder(root.right, list);
  }
}
