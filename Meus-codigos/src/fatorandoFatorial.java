public class fatorandoFatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c --){
            f *= c;
            s += c + "x";
        }
        fat = f;
        formula = s;
    }
    public int gefatorial(){
        return fat;
    }
    public String getformula(){
        return formula;
    }
}


