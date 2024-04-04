package BancoInterface;

/**
 *
 * @author Quiqu
 */
public class ContaCorrente implements ContaTributavel{
    
    private double saldo;
    private double limite;

    @Override
    public double getSaldo() {
        return saldo+limite;
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + (valor-1);
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
        this.saldo = this.saldo + (this.saldo * (taxaSelic*2));
    }
    
    @Override
    public double calcTributos() {
        return this.getSaldo() * 0.01;
    }
    
}


//Algum código vai ter de ser copiado e colado? Isso é tão ruim?

//Podemos sim reaproveitar alguns códigos do outro pacote banco na reestruturação 
//do ContaCorrente, e não há problema nisso pois isso ajudar a poupar tempo e evita erros.
