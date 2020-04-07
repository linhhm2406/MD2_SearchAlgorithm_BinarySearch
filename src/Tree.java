public interface Tree<E> {
    boolean insert(E e);

    boolean find(TreeNode<E> root, E e);
}
