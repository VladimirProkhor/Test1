package MyTest1Generics;

public class MyTest4<T> {
    Class <T> createClass;

    public MyTest4(Class<T> createClass) {
        this.createClass = createClass;
    }

    public T newCreateClass() throws InstantiationException, IllegalAccessException {
        return createClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyTest4<MyTest3> result = new MyTest4<>(MyTest3.class);
        MyTest3 clazz = result.newCreateClass();
    }
}
