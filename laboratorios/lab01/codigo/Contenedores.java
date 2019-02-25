import java.util.concurrent.TimeUnit;
/**
 * Write a description of class Contenedores here.
 *
 * @author Gustavo Lopez y Juan Andres
 * @version (a version number or a date)
 */
public class Contenedores
{
 public static int formas(int n) {
   if(n<=1) {
     return n;
   }
   try {
     TimeUnit.SECONDS.sleep(1);
   }
   catch(Exception e){
   }
   return formas(n-1)+ formas (n-2);
 }
 public static void main(String[] args){
   for(int i=1;i<=20;i++) {
     long start=System.currentTimeMillis();   
     formas(i);
     long end= System.currentTimeMillis();
     System.out.println("Time: " + (end-start));
     System.out.println("");
   } 
 }
}
