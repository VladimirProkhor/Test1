package LembdaLesson6;
@FunctionalInterface
public interface NameFormatter<T> {
     T makeFormat(T t1, T t2);

}
