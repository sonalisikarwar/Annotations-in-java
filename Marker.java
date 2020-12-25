
package shivaafoundation.javatutorial;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{
    
   

public class Marker {
    @MyMarker
    public static void Meth(){
        Marker ob = new Marker();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class))
            System.out.println("MyMarker is present") ;
        } catch (NoSuchMethodException exc){
            System.out.println("Method Not Found");
}
   public static void main (String args[]){
       myMeth(); 
}
}
