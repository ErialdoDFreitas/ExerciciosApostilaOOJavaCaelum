package Cap04;

public class Funcionario {
    
    String nome, RG, departamento, dataEntrada;
    double salario;
    boolean estaNaEmpresa;


    void receberAumento(double aumento){ salario += aumento; }

    void demite(){ }

    double calculaGanhoAnual(){ return salario * 12; }
    
    void mostraFuncionario(){
        System.out.println("Nome: "+ nome);
        System.out.println("RG "+ RG);
        System.out.println("Departamento: "+ departamento);
        System.out.println("Data de Entrada na Empresa: "+ dataEntrada);
        System.out.println("Salário: "+ salario);
        System.out.println("Está na empresa? "+ estaNaEmpresa);
        System.out.println("Ganho anual do funcionário: "+ calculaGanhoAnual());
         
    }

}
