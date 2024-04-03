/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocccp;

/**
 *
 * @author Quiqu
 */
public class GerenciadorIR {
    private double total;
    
    public void add (Tributavel t){
        System.out.println("Adicionando Tributavel: "+t);
        this.total += t.calcTributos();
    }

    public double getTotal() {
        return this.total;
    }
    
    
        
}
