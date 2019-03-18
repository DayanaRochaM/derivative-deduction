/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivativededuction.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 384349
 */
public class Forward {
    
    public Forward(){
        List<String> serie = new ArrayList();
        serie.add("fx_i");
    }
    
    public int calculateExpansionsNumber(int derivativeOrder, int errorOrder){
        return errorOrder - derivativeOrder -1 + derivativeOrder - 1;
    }
    
    
    
}
