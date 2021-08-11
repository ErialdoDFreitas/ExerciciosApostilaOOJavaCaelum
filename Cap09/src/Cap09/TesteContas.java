package Cap09.src.Cap09;

public class TesteContas {
    
    public static void main(String[] args) {
        
        //Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        //c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        //c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        //System.out.println("Saldo C: "+c.getSaldo());
        System.out.println("Saldo CC: "+cc.getSaldo());
        System.out.println("Saldo CP: "+cp.getSaldo());

        System.out.println("--------------------------------------");

        //Conta c2 = new Conta();
        Conta cc2 = new ContaCorrente();
        Conta cp2 = new ContaPoupanca();

        //c.deposita(1000);
        cc2.deposita(1000);
        cp2.deposita(1000);

        //c.atualiza(0.01);
        cc2.atualiza(0.01);
        cp2.atualiza(0.01);

        //System.out.println("Saldo C2: "+c.getSaldo());
        System.out.println("Saldo CC2: "+cc2.getSaldo());
        System.out.println("Saldo CP: "+cp2.getSaldo());

    }
}
