/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocccp;

import bancocccp.ContaCorrente;
import bancocccp.Tributavel;

/**
 *
 * @author Quiqu
 */
public class TestaTributavel {
    
    public static void main(String[] args) {
        
        double saldo;
        ContaCorrente cc = new ContaCorrente();
        
        cc.deposita(100);
        
        System.out.println(cc.calcTributos());
        
        /*Tributavel t = cc;
        System.out.println(t.calcTributos());*/
        
        saldo = cc.getSaldo() - cc.calcTributos();
        System.out.println(saldo);
        
        //Tentando chamar o metodo getSaldo atraves da referencia t
        
        /* Não conseguimos chamar o getSaldo através do t pois como tributavel é
        uma interface ela não recebe os metodos, ou seja, o getSaldo não é 
        passado para ela.*/
        
        
   }
    
}
