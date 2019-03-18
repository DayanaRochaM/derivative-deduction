package derivativededuction.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Forward {
    
    List<String> serie = new ArrayList();
    List<String> serie2 = new ArrayList();
    List<String> serie3 = new ArrayList();
    List<String> serie4 = new ArrayList();
    List<String> serie5 = new ArrayList();
    List<String> serie6 = new ArrayList();
    List<String> serie7 = new ArrayList();
    
    public int calculateExpansionsNumber(int derivativeOrder, int errorOrder){
//        if(derivativeOrder != 1){
//            return errorOrder + derivativeOrder - 2 ;
//        }
        return errorOrder + derivativeOrder - 1 ;
    }
    
    public void generateSeries(int expansionsNumber, int termsNumber){
        System.out.println(expansionsNumber);
        for(int i = 0; i < expansionsNumber; i++){
            generateSerie(i+1, termsNumber);
        }
    }
    
    public void generateSerie(int serieNumber, int termsNumber){
        
        switch(serieNumber){
            
            case 1:
                produceSerie(serie, serieNumber, termsNumber );
                break;
            case 2:
                produceSerie(serie2, serieNumber, termsNumber );
                break;
            case 3:
                produceSerie(serie3, serieNumber, termsNumber );
                break;
            case 4:
                produceSerie(serie4, serieNumber, termsNumber );
                break;
            case 5:
                produceSerie(serie5, serieNumber, termsNumber );
                break;
            case 6:
                produceSerie(serie6, serieNumber, termsNumber );
                break;
            case 7:
                produceSerie(serie7, serieNumber, termsNumber );
                break;
        }
    }
    
    public void produceSerie(List<String> serie, int serieNumber, int termsNumber){
        serie.add("f(x_i)");
        for(int i = 0; i < termsNumber; i++){
            serie.add("f^"+ (i+1) + "(x_i)(" + serieNumber + "(delta)x)^" + (i+1));
        }
        
        //for (String term : serie.) {
            System. out. println(serie.toString());
    }
}
