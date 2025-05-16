public class App {
    public static void main(String[] args) throws Exception {

        // test Hello World
    //  System.out.println("Abracadabra" .compareTo("Bologna"));
       Lista<String> l= new Lista<>();
        l.add("Bologna");
        l.add("Milano");
        l.addHead("Juve");
        System.out.println(l);


         ListaOrdinata<String> lo= new ListaOrdinata<>();
        lo.add("Bologna");
        lo.add("Milano");
        lo.add("Juve");
        lo.add("Atalanta");
        lo.add("Barcellona");
        lo.add("Paris san gemain");
        lo.add("Real Madrid");
        lo.add("Roma");

        System.out.println(lo);

        // test MyIntArray
      /*  MyIntArray a = new MyIntArray();
        for (int i=0; i<10; i++) a.add(i);
        System.out.println(a);
*/
    }
}