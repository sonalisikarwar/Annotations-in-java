
package shivaafoundation.javatutorial;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    
    int val();
}
            class Single {
             @MySingle(100)
             public static void myMeth(){
                 Single ob = new Single();
                 try{
                     Method m = ob.getClass().getMethod("MyMeth");
                     MySingle anno m.getAnnotation(MySingle.class);
                     System.out.println(anno.value());
                     
                 } catch ()NoSuchMethodException exc){
                     System.out.println("Method Not Found");
                 }
                 public static void main (String args[]){
                  myMeth(); 
}
}

                    
                
                
            }
    
}
