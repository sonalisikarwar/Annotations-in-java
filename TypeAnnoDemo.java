//Demo all types of annotations
package shivaafoundation.javatutorial;
import java.lang.annotation.*;
import java.lang.reflect.*;
//A marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface TypeAnno{}
//Another marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface NotZeroLen{}
//still Another marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface Unique{}
//A parameterized annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface MaxLen{}
int value();
}

//An annotation that can be applied to a type parameter
@Target(ElementType.TYPE_PARAMETER)
@interface What {
String description();
}
//An annotation that can be applied to a field declaration
@Target(ElementType.FIELD)
@interface EmptyOK{}

//An annotation that can be applied to a method declaration
@Target(ElementType.TYPE_METHOD)
@interface Recommended {}
//use an Annotation on a type parameter
class TypeAnnoDemo<@What(description = "Generic data type") T>{
    //Use type annotation on a constructor
    public @Unique TypeAnnoDemo(){}
    //Annotation the Type (in case String), not field
    @TypeAnno String str;
}
