import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        int i = 2022 - nasc;
        System.out.println("Sua idade é " + i);
        if (i>=2018) {
            System.out.println("Menor de idade: ");
        }else {
            System.out.println("Menor de idade: ");
        }
    }
}

