package Cap07;

public class ContaCorrente extends Conta {
    public void atualiza (double taxa){
        this.saldo = this.saldo * taxa;
    }
}
