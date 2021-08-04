package Cap06;

public class TesteFuncionario {

    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Erialdo", "202107150725442");

        //f1.setNome("Beto");
        //f1.setRG("202101005725442");
        f1.setDepartamento("T.I");
        f1.setSalario(1500);
        f1.setDataEntrada("15-07-2021");
        f1.setSituacao(true);

        System.out.println("Salário atual: " + f1.getNome());
        f1.receberAumento(200);
        System.out.println("Salário após aumento: " + f1.getSalario());
        System.out.println("Ganho anual: " + f1.calculaGanhoAnual() );

        System.out.println("Informações do Funcionário: \n");
        f1.mostraFuncionario();

        System.out.println("-------------------------------------------------------");

        Funcionario f2 = new Funcionario("Beto", "202101005725442");
        //f2.setNome("Mário");
        //f2.setSalario(1700);
        System.out.println("Nome: "+f2.getNome());
        System.out.println("Salario"+f2.getSalario());
       
        Funcionario f3 = new Funcionario("Mário", "201901004725443");
        //f3.setNome("Mário");
        //f3.setSalario(1700);
        System.out.println("Nome: "+f3.getNome());
        System.out.println("Salario"+f3.getSalario());

        if(f2 == f3){
            System.out.println("Funcionários f2 e f3 são iguais");
        }
        else{
            System.out.println("Funcionários f2 e f3 são diferentes");
        }

        Funcionario f4 = new Funcionario("Luciano Skyline", "202001025527442");
        //f4.setNome("Luciano Skyline");
        //f4.setSalario(1700);
        System.out.println("Nome: "+f4.getNome());
        System.out.println("Salario"+f4.getSalario());


    }

}

