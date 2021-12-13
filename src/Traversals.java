import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {

        return traversePreRecursive(root);

        }

    private List traversePreRecursive(TreeNode<T> node) {
        if (node == null) return new ArrayList();

        List nodeValues = new ArrayList();
        nodeValues.add(node.getData());
        nodeValues.addAll(traversePreRecursive(node.getLeft()));
        nodeValues.addAll(traversePreRecursive(node.getRight()));

        return nodeValues;
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        return traverseInRecursive(root);
    }

    private List traverseInRecursive(TreeNode<T> node) {
        if (node == null) return new ArrayList();

        List nodeValues = new ArrayList();
        nodeValues.addAll(traversePreRecursive(node.getLeft()));
        nodeValues.add(node.getData());
        nodeValues.addAll(traversePreRecursive(node.getRight()));

        return nodeValues;
    }
    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        return traversePostRecursive(root);
    }
    private List traversePostRecursive(TreeNode<T> node) {
        if (node == null) return new ArrayList();

        List nodeValues = new ArrayList();
        nodeValues.addAll(traversePreRecursive(node.getLeft()));
        nodeValues.addAll(traversePreRecursive(node.getRight()));
        nodeValues.add(node.getData());

        return nodeValues;
    }
}