package Cap04;

public class TesteFuncionario {

    public static void main(String[] args){
            FuncionarioEx1 f1 = new FuncionarioEx1();

            f1.nome = "Beto";
            f1.RG = "202101005725442";
            f1.departamento = "T.I";
            f1.salario = 1500;
            f1.dataEntrada = "15-07-2021";
            f1.estaNaEmpresa = true;

            System.out.println("Salário atual: " + f1.salario);
            f1.receberAumento(200);
            System.out.println("Salário após aumento: " + f1.salario);
            System.out.println("Ganho anual: " + f1.calculaGanhoAnual() );

            System.out.println("Informações do Funcionário: \n");
            f1.mostraFuncionario();

            System.out.println("-------------------------------------------------------");

            FuncionarioEx1 f2 = new FuncionarioEx1();
            f2.nome = "Mário";
            f2.salario = 1700;
           
            FuncionarioEx1 f3 = new FuncionarioEx1();
            f3.nome = "Mário";
            f3.salario = 1700;

            if(f2 == f3){
                System.out.println("Funcionários f2 e f3 são iguais");
            }
            else{
                System.out.println("Funcionários f2 e f3 são diferentes");
            }

            FuncionarioEx1 f4 = new FuncionarioEx1();
            f4.nome = "Lu";
            f4.salario = 1700;

            FuncionarioEx1 f5 = f4;

            if(f4 == f5){
                System.out.println("Funcionários f4 e f5 são iguais");
            }
            else{
                System.out.println("Funcionários f4 e f5 são diferentes");
            }

    }
    
}
