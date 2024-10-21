import java.util.Scanner;
public class Calculadora  {

        public static int calcularSaldo(int win, int lose) {
            int saldo = win - lose;

            if (saldo < 10 ) {
                System.out.println("O Herói tem  saldo de " +saldo +" está no nível de Ferro");
                return + saldo;
            } else if (saldo >11 && saldo <20 ) {
                System.out.println("O Herói tem  saldo de " +saldo +" está no nível de Bronze");
                return + saldo;
            } else if(saldo> 21 && saldo <50) {
                System.out.println("O Herói tem  saldo de " +saldo +" está no nível de Prata");
                return + saldo;
            } else if(saldo >51 && saldo < 80){
                System.out.println("O Herói tem saldo de " +saldo +" está no nível de Ouro");
            } else if(saldo > 81 && saldo <90){
                System.out.println("O Herói tem  saldo de " +saldo +" está no nível de Diamante");
            } else if( saldo > 91 && saldo < 100){
                System.out.println("O Herói tem  saldo de " +saldo +" está no nível de Lendário");
            } else if( saldo >= 101){
                System.out.println("O Herói tem  saldo de " +saldo +" está no nível de Imortal");
            }
            return saldo;
        }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a quantidade de vitórias: ");
            int win = scanner.nextInt();

            System.out.println("Digite a quantidade de derrotas: ");
            int lose = scanner.nextInt();

            int saldo = calcularSaldo(win, lose);

        }
    }

