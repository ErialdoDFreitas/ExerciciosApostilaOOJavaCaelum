package Cap05;

public class Funcionario {
    
    private String nome, RG, departamento, dataEntrada;
    private double salario;
    private boolean estaNaEmpresa;


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

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRG(){
        return nome;
    }
    public void setRG(String RG){
        this.RG = RG;
    }

    public String getDepartamento(){
        return dataEntrada;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDataEntrada(){
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public boolean GetSituacao(){
        return estaNaEmpresa;
    }

    public void setSituacao(){
        this.estaNaEmpresa = estaNaEmpresa;
    }

}
