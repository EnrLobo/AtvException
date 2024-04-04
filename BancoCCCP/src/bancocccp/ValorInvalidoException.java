/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocccp;

/**
 *
 * @author Quiqu
 */
public class ValorInvalidoException extends Exception {
 
    ValorInvalidoException(double valor){
        super("Valor inválido: "+valor);
    }
    
}
