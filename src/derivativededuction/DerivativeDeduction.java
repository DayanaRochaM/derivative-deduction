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
        int derivative = 2;
        int error = 2;
        int expansionsNumber = f.calculateSeriesNumber(derivative, error);
        
        f.generateSeries(expansionsNumber, derivative + error);
        f.calculateAlphas();
    }
    
}
