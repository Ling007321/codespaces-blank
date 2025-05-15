public class Lista<T> {

        private Nodo<T> root;

        public Lista() {
                root = null;
}
                                                         
                                  //Overloading                                                                      }
}  public void add(Nodo<T> newnode) {
                if (root==null) {
                root = newnode;
                } else {
                Nodo<T> temp = root;
                while (temp.getSucc()!=null) temp=temp.getSucc();
                temp.setSucc(newnode);
}
}
public void add(T newval){
        Nodo<T> newnode=new Nodo<>(newval);
        this.add(newnode);
}

public void addHead(T newval){
        Nodo<T> newnode = new Nodo<>(newval);
        newnode.setSucc(root);
        root = newnode;
}
@Override
public String toString(){
        String result= "Lista: ";
        Nodo<T> tmp =root;
}
}
