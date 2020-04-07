public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(11);
        bst.insert(4);
        bst.insert(13);
        bst.insert(17);

        if (bst.find(bst.getRoot(), 1)){
            System.out.println("ok");
        }else {
            System.out.println("Toang");
        }
    }
}
