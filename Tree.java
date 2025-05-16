public class Tree<T extends Comparable<T>> {
    protected Treenode<T> root;
    
    public Tree() {
        root = null;
    }
    private void recursiveAdd(Treenode<T> p,T value){
        if(p.getValue().compareTo(value)<0){
            if(p.getLeft() == null){
                p.setLeft(new Treenode<T>(value));
        }else{
            if ( p.getRight() == null){
                p.setRigth(new Treenode<T>(value));
            }else{
                recursiveAdd(p.getRigth(),value);
            }
        }
    }

    public void add(T value) {

        if (root == null) root = new Treenode<T>(value);
        recursiveAdd(root,value);
         
    }


    p
}
