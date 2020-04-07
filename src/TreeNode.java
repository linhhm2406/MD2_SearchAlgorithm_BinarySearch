public class TreeNode<E> {
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    protected E e;

    public TreeNode() {
    }

    public TreeNode(E e) {
        this.e = e;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
