package BancoInterface;

/**
 *
 * @author Quiqu
 */
public interface Conta {
    double getSaldo();
    void deposita(double valor);
    boolean retira(double valor);
    void atualiza(double taxaSelic);
}
