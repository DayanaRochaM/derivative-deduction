package derivativededuction.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Forward {
   
    List<String> serie = new ArrayList();
    List<String> serie2 = new ArrayList();
    List<String> serie3 = new ArrayList();
    List<String> serie4 = new ArrayList();
    List<String> serie5 = new ArrayList();
    List<String> serie6 = new ArrayList();
    List<String> serie7 = new ArrayList();
   
    List<Integer> coef = new ArrayList();
    List<Integer> coef2 = new ArrayList();
    List<Integer> coef3 = new ArrayList();
    List<Integer> coef4 = new ArrayList();
    List<Integer> coef5 = new ArrayList();
    List<Integer> coef6 = new ArrayList();
    List<Integer> coef7 = new ArrayList();
    
    List<List<Integer>> coefs = new ArrayList();
    
    List<Integer> alphas = new ArrayList();
   
    public int calculateSeriesNumber(int derivativeOrder, int errorOrder){
//        if(derivativeOrder != 1){
//            return errorOrder + derivativeOrder - 2 ;
//        }
        return errorOrder + derivativeOrder - 1 ;
    }
   
    public void generateSeries(int seriesNumber, int termsNumber){
        System.out.println(seriesNumber);
        for(int i = 0; i < seriesNumber; i++){
            generateSerie(i+1, termsNumber);
        }
        showCoefs();
    }
   
    public void generateSerie(int serieNumber, int termsNumber){
       
        switch(serieNumber){
           
            case 1:
                produceSerie(serie, serieNumber, termsNumber );
                produceCoef(serie, serieNumber, termsNumber );
                break;
            case 2:
                produceSerie(serie2, serieNumber, termsNumber );
                produceCoef(serie2, serieNumber, termsNumber );
                break;
            case 3:
                produceSerie(serie3, serieNumber, termsNumber );
                produceCoef(serie3, serieNumber, termsNumber );
                break;
            case 4:
                produceSerie(serie4, serieNumber, termsNumber );
                produceCoef(serie4, serieNumber, termsNumber );
                break;
            case 5:
                produceSerie(serie5, serieNumber, termsNumber );
                produceCoef(serie5, serieNumber, termsNumber );
                break;
            case 6:
                produceSerie(serie6, serieNumber, termsNumber );
                produceCoef(serie6, serieNumber, termsNumber );
                break;
            case 7:
                produceSerie(serie7, serieNumber, termsNumber );
                produceCoef(serie7, serieNumber, termsNumber );
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
   
    public void produceCoef(List<String> serie, int serieNumber, int termsNumber){
        
        if(serie == this.serie) {
            for(int i = 1; i <= termsNumber; i++) {
                coef.add(i);
            }
            coefs.add(coef);
        }
        else if(serie == this.serie2) {
            for(int i = 1; i <= termsNumber; i++) {
                coef2.add((int)Math.pow(i, 2));
            }
            coefs.add(coef2);
        }
        else if(serie == this.serie3) {
            for(int i = 1; i <= termsNumber; i++) {
                coef3.add((int)Math.pow(i, 3));
            }
            coefs.add(coef3);
        }
        else if(serie == this.serie4) {
            for(int i = 1; i <= termsNumber; i++) {
                coef4.add((int)Math.pow(i, 4));
            }
            coefs.add(coef4);
        }
        else if(serie == this.serie5) {
            for(int i = 1; i <= termsNumber; i++) {
                coef5.add((int)Math.pow(i, 5));
            }
            coefs.add(coef5);
        }
        else if(serie == this.serie6) {
            for(int i = 1; i <= termsNumber; i++) {
                coef6.add((int)Math.pow(i, 6));
            }
            coefs.add(coef6);
        }
        else if(serie == this.serie7) {
            for(int i = 1; i <= termsNumber; i++) {
                coef7.add((int)Math.pow(i, 7));
            }
            coefs.add(coef7);
        }  
        
    }
    
    void showCoefs(){
        for(List<Integer> coefList : coefs){
            System.out.println(coefList.toString());
        }
    }
    
    public void calculateAlphas(){
    
        List<List<Integer>> atual_coefs = new ArrayList<>();
        //System.arraycopy(coefs, 0, atual_coefs, 0, 0);
        for(int i = 0; i < coefs.size(); i++){
            
//            for (List<Integer> foo: coefs) {
//                atual_coefs.add(foo.clone());
//            }
            atual_coefs = new ArrayList(coefs);
            
//            for(int k = 0; k < coefs.size(); k++){
//                atual_coefs.add(coefs.get(k));
//            }

            for(int j = 0; j < coef.size(); j++){
                atual_coefs.get(i).set(j, 1);
            }
            
            System.out.println(atual_coefs.toString());
            atual_coefs.clear();
        }
    }
}

