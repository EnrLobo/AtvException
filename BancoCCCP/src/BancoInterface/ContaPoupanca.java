package BancoInterface;

/**
 *
 * @author Quiqu
 */
public class ContaPoupanca implements Conta{
    
    private double saldo;
    private double limite;

    @Override
    public double getSaldo() {
        return saldo + limite;
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public boolean retira(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado");
            return true;
        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        this.saldo = this.saldo * (taxaSelic * 3);
    }

    
}
