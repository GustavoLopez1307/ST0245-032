/**
 * Solución del taller 2 de la asignatura Estructura de Datos y Algorítmos 1.
 * 
 * @author (Juan Andrés Arroyave y Gustavo Adolfo López)
 * @version (29/01/2019)
 */


public class Taller2 {
    /**Método que sirve para calcular el máximo común divisor de dos números
     * por el algorítmo de Euclides
     */
    public static int gcd(int p, int q){
     if (q == 0) 
       return p;
     else 
       return gcd(q, p%q);
    }  
    public static boolean SumaGrupo(int start, int[] nums, int target) {
        //Miramos lo siguiente:
        //Si start recorre todo el arreglo y no llega nada entonces tiene que ser 0.
        
        if(start>=nums.length) {
            return target==0;
        }
        
        return SumaGrupo(start+1,nums,target) || SumaGrupo(start+1,nums,target-nums[start]);
        
        //COMPROBACIÓN: La comprobación se hace mirando si el ejercicio es correcto en la plataforma CodingBat.
        
    }    
    /**
    * @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
    *
    * El método combinations se define para que solo se tenga que pasar el parametro s y no la cadena 
    * vacía necesaria para el metodo reursivo combinationsAux. Este metodo no se modifica.
    * 
    */
    public static void combinations(String s) { 
        combinationsAux("", s); 
    }    
    /**
    * @param prefix, se utiliza como una variable auxiliar para guardar datos sobre el proceso.
    * @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
    *
    *
    * El método combinationsAux se encarga de encontrar las posibles combinaciones en la cadena s
    * notese que el método es "private" de modo que solo se puede llamar desde el interior de la clase pues
    * el método que lo representa es combinations.
    */

    private static void combinationsAux(String prefix, String s) {  
        if(s.length()==0)  {
            System.out.println(prefix); // Si no hay tamaño en s el subconjunto será el conjunto vacío.
        }
        else {
                combinationsAux(prefix + s.charAt(0), s.substring(1)); //Método recursivo para agrupar términos.
    		combinationsAux(prefix,s.substring(1));
        }
        
        
    }
}