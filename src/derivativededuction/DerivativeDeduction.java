/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivativededuction;

import derivativededuction.algorithms.Forward;

/**
 *
 * @author 384349
 */
public class DerivativeDeduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Forward f = new Forward();
        System.out.println(f.calculateExpansionsNumber(2, 3));
        
        
                
    }
    
}
