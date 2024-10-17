import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double altura;
        double peso;
        double imc;

        System.out.println("Digite sua altura ");
        altura = leitor.nextDouble();

        System.out.println("Digite sua peso ");
        peso = leitor.nextDouble();

        imc = peso/(altura*altura);

        if(imc < 18.5 ) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com o peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está acima do peso");
        }else if (imc >= 30 && imc < 34.9) {
            System.out.println("Você está obeso.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Você está com obesidade nv 2 procure um médico.");
        }
        System.out.println("seu imc total é " + imc);

    }
}
