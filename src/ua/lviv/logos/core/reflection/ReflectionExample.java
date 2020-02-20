package ua.lviv.logos.core.reflection;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class cForName = Class.forName("ua.lviv.logos.core.reflection.Person");

        Class personClass = Person.class;

//        Person person = new Person();
//        Class cGetClass = person.getClass();

//        System.out.println("cForName: " + cForName);
//        System.out.println("cClass: " + cClass);
//        System.out.println("cGetClass: " + cGetClass);

//        System.out.println("simple name: "+ cClass.getSimpleName());
//        System.out.println("simple name: "+ cClass.getName());
//        System.out.println("simple name: "+ cClass.getTypeName());

        System.out.println("simple name: "+ new Serializable(){}.getClass().getSimpleName());
        System.out.println("simple name: "+ new Serializable(){}.getClass().getName());
        System.out.println("simple name: "+ new Serializable(){}.getClass().getTypeName());
        System.out.println("simple name: "+ new Serializable(){}.getClass().getCanonicalName());

        System.out.println(int.class.getName());
        System.out.println(int.class.getSimpleName());


        int modifiers = personClass.getModifiers();
        System.out.println("==============modifiers============");
        System.out.println(Modifier.toString(modifiers));;

        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println(Modifier.isInterface(modifiers));
        System.out.println(Modifier.isFinal(modifiers));


        System.out.println("========Package======");

        Package pPakage = personClass.getPackage();

        System.out.println(pPakage);
        System.out.println(pPakage.getName());


        System.out.println("===============superclass============");

        Class superClass = personClass.getSuperclass();
        System.out.println(superClass.getSimpleName());
        System.out.println(superClass.getSuperclass().getSimpleName());
        System.out.println(superClass.getSuperclass().getSuperclass());

        System.out.println("==============interfaces============");

        Class[] interfaces = personClass.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        System.out.println(Arrays.toString(interfaces));

        Class wackable = interfaces[1];

        System.out.println(wackable.getSimpleName());
        Method walk = wackable.getDeclaredMethod("walk");

        int methodModifire = walk.getModifiers();

        System.out.println(Modifier.toString(methodModifire));

        int staticModifire = wackable.getDeclaredMethod("special").getModifiers();

        System.out.println(Modifier.toString(staticModifire));

        Constructor[] constructors = personClass.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println(constructors.length);

        Constructor twoParamsConstructor = constructors[0];
        Class[] params = twoParamsConstructor.getParameterTypes();
        for (Class param : params) {
            System.out.println(param.getSimpleName());
        }

        Constructor twoParamsConstructor2 = personClass.getConstructor(String.class, int.class);

        Person person = (Person) twoParamsConstructor2.newInstance("Ivan", 15);
        System.out.println(person);

        Person person1 = (Person) personClass.newInstance();

        System.out.println(person1);

        System.out.println("================FIELDS==============");

        Field [] fields = personClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Field[] allFields = personClass.getDeclaredFields();

        System.out.println("=======All fields=====");
        for (Field allField : allFields) {
            System.out.println(allField.getName());
            System.out.println(allField.getType());
        }

        Field height = personClass.getDeclaredField("height");
        person.setHeight(23d);
        height.setAccessible(true);
        height.set(person, 12d);
        System.out.println(height.get(person));

        System.out.println(person.getHeight());

        Method[] methods = personClass.getDeclaredMethods();
        System.out.println("=============METHODS=============");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method method = personClass.getDeclaredMethod("getAge");

        Integer age = (Integer) method.invoke(person);
        System.out.println(age);

        System.out.println("========INVOKE PRIVATE METHOD=============");
        Method privateMethod = personClass.getDeclaredMethod("privateMethod", String.class, int.class);
        privateMethod.setAccessible(true);
        privateMethod.invoke(person, "My string", Integer.MIN_VALUE);

        int modifiers1 = privateMethod.getModifiers();

        System.out.println(Modifier.toString(3));
    }


}
