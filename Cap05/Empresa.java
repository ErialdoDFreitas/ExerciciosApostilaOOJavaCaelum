package Cap05;

public class Empresa {
    
    Funcionario[] empregados;
    String cnpj;
        
    void adiciona(Funcionario f){
        empregados = new Funcionario[4];

        this.empregados[0].nome = "Erialdo";
        this.empregados[0].salario = 1700;

        this.empregados[1].nome = "Beto";
        this.empregados[1].salario = 1700;
            

    }
}
