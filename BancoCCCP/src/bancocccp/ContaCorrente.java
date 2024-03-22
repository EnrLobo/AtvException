package BancoCCCP;

public class ContaCorrente extends Conta {

    @Override
    void atualiza(double taxa) {
        super.deposita(this.getSaldo() * (taxa * 2));
    }
    
    @Override
     void deposita(double valor) {
         super.deposita(valor-1);
    }

}