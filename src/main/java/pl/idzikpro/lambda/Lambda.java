package pl.idzikpro.lambda;

@FunctionalInterface
public interface Lambda<T> {
    boolean check(T object);
}
