import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0 ;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação:");
            nota = leitura.nextDouble();
            media = media + nota;
        }
        System.out.println("Media de avaliação: "+ media/3);
    }
}
