public class OperadorTernario {
    

    
    private static Object res;

    public static void main(String[] args) {
        /*int n1, n2, r;
        n1 = 37;
        n2 = 56;
        r = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r);*/

        String nome1 = "felipe";
        String nome2 = "felipe";
        String nome3 = new String("felipe");
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
    }
}
