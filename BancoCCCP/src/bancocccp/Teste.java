package bancocccp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        
        try {
            c.deposita(1000);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            cc.deposita(1000);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            cp.deposita(1000);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        
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