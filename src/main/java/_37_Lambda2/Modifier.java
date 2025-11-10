package _37_Lambda2;
@FunctionalInterface
public interface Modifier<T , R> {
    R modify(T t);
}
