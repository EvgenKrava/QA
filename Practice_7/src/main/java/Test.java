import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = MyClass.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.newInstance();
    }
}
class MyClass{
    MyClass(){
        System.out.println("MyClass");
    }

    MyClass(int i){
        System.out.println(i);
    }
}
