package Cap03;

import java.util.Scanner;

public class ExercicioQuatro {
/**4) Imprima os fatoriais de 1 a 10.
        O fatorial de um número n é n * n-1 * n-2 ... até n = 1. Lembre-se de utilizar os parênteses.
        O fatorial de 0 é 1
        O fatorial de 1 é (0!) * 1 = 1
        O fatorial de 2 é (1!) * 2 = 2
        O fatorial de 3 é (2!) * 3 = 6
        O fatorial de 4 é (3!) * 4 = 24
        Faça um for que inicie uma variável n (número) como 1 e fatorial (resultado) como 1 e varia n de 1 até 10:
        int fatorial = 1;
        for (int n = 1; n <= 10; n++) {
        }
    */
        public static void main(String[] args){
            System.out.println("Digite um número para saber o fatorial do mesmo:  ");
            Scanner ler = new Scanner(System.in);
            int num = ler.nextInt();

            System.out.println("(RECURSIVO) O fatorial de "+num+" é: "+fatorialRecursivo(num));
            ler.close();

            System.out.println("-------------------------------------------------------------");

            System.out.println("Fatorial de 1 a 10:\n");
            System.out.println(fatorial());

        }

        public static int fatorial(){

            int i;

            for(i=1; i<=10; i++){
                System.out.println("O Fatorial de "+i+" é: "+fatorialRecursivo(i));
                
                if(i == 10){
                    i = 1;
                    //break;
                }
            }

            return fatorial();
        }

        public static int fatorialRecursivo(int num){

            if(num == 0){
                return 1;
            }

            return num * fatorialRecursivo(num - 1); 
        }

}