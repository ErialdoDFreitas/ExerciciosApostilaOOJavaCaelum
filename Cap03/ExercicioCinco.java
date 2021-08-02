package Cap03;

public class ExercicioCinco {
  /** 5) No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até
        20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas
        completamente erradas. Por quê? Mude de int para long para ver alguma mudança.  */
        
        public static void main(String[] args){

            int fatorial = 1;

            for(int n=1; n<=30; n++){
                fatorial *= n;
                System.out.println("O Fatorial de "+n+" é: "+fatorial);
            }

            
        /** R: Quando o número é maior do que 10, começa a aparecer alguns erros, devido a o tipo de variável int,
            pois o valor do fatorial é muito grande, não sendo suportado pelo tipo int. Uma forma de contornar esse problema
            é utilizando o tipo de dados long (apesar de que em alguns números será mostrado um valor negativos com vários dígitos*/

            long fatorialLong = 1;

            for (long i=1; i<=30; i++){
              fatorialLong *= i;
              System.out.println("O Fatorial de "+i+" é: "+fatorialLong);
            }
        }


        
}
