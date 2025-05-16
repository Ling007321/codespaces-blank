public class Tree<T extends Comparable<T>> {
    protected Treenode<T> root;
    
    public Tree() {
        root = null;
    }

    public void add(T value) {
        Treenode<T> newNode = new Treenode<>(value);
        if (root == null) {
            root = newNode;
        } else {
            add(value);
        }
    }

}
