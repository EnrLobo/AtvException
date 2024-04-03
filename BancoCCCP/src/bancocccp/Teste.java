package bancocccp;

public class Teste {

    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas att = new AtualizadorDeContas(0.15);
        
        att.roda(c);
        att.roda(cc);
        att.roda(cp);
        
        /*System.out.printf("Conta: %.2f\n",c.getSaldo());
        System.out.printf("Corrente: %.2f\n",cc.getSaldo());
        System.out.printf("Poupança: %.2f\n",cp.getSaldo());*/
        
        System.out.printf("O saldo total e: %.2f",att.getSaldoTotal());

    }

}