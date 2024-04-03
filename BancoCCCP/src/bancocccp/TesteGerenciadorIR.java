/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocccp;

//import bancocccp.ContaCorrente;
//import bancocccp.GerenciadorIR;

/**
 *
 * @author Quiqu
 */
public class TesteGerenciadorIR {
    
    
    public static void main(String[] args) {
        
        GerenciadorIR gerenciador = new GerenciadorIR();
        SeguroVida sv = new SeguroVida();
        
        
        
        gerenciador.add(sv);
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        
        gerenciador.add(cc);
        
        System.out.println(gerenciador.getTotal());
        
        double saldo = cc.getSaldo()- gerenciador.getTotal();
        
        System.out.printf("O saldo e: %.2f",saldo);
    }
    
}
