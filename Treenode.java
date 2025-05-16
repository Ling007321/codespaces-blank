public class Treenode<T> {
    private T value;
    private Treenode<T> left,rigth;



public Treenode(T value) {
        this.value = value;
        left = rigth = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Treenode<T> getLeft() {
        return left;
    }

    public void setLeft(Treenode<T> left) {
        this.left = left;
    }

    public Treenode<T> getRigth() {
        return rigth;
    }

    public void setRigth(Treenode<T> rigth) {
        this.rigth = rigth;
    }

    @Override
    public String toString(){
        return "Treenode [value=" + value + "]";
    }
}
