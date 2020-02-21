package ua.lviv.logos.core.inner;

public class AnnonimousImplementation implements Annonimous {

    @Override
    public void hedle(String value) {
        System.out.println("hadled value: "+ value);
    }

    @Override
    public boolean random() {
        return false;
    }
}
