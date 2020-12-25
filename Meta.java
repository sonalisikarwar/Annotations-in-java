
package shivaafoundation.javatutorial;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
    
}
class Meta {
    @MyAnno(str ="Two Parameter", val = 19)
    public static void myMeth(String str,int i){
        Meta ob = new Meta();
        try{
            Class<?>c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println("anno.str"+ "" + anno.val());
        }catch (NoSuchMethodException exc){
            System.out.println("Method Not Found");
        }
    }
    public static void main(String args[]){
        myMeth("test",10);
            
            
        }
    }
    

/*package shivaafoundation.javatutorial;
import java.lang.annotation.*;
import java.lang.reflect.*;
@interface MyAnno{
    String str();
    int val();
    
}
class Meta {
    @MyAnno(str ="Annotation Example", val = 100)
    public static void main(String args[]){
        Meta ob = new Meta();
        try{
            Class<?>c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println("anno.str");
        }catch (NoSuchMethodException exc){
            System.out.println("Method Not Found");
        }
    }
    /*public static void main(String args[]){
        myMeth();
            
            
        }
    }*/
    

