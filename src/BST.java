public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    private TreeNode<E> root;

    public BST() {
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.e) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.e) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.e)<0){
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        return true;
    }

    @Override
    public boolean find(TreeNode<E> root, E e) {
        boolean isExist = false;
        if (root == null){
            return false;
        } else {
            if (root.e.equals(e)){
                isExist = true;
            }
            if (e.compareTo(root.e) <0){
                isExist = find(root.left,e);
            }
            if (e.compareTo(root.e)>0){
                isExist = find(root.right,e);
            }
        }
        return isExist;
    }
}
