package ua.lviv.logos.core.generics;

public class Optional<T> {
    private T value;
    public Optional(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T t){
        value = t;
    }
}
