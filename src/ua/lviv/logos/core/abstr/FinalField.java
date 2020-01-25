package ua.lviv.logos.core.abstr;

public class FinalField {

    public String name;
    public final String field;
    public static final String MY_CONSTANT = "A am string constant";

    public FinalField() {
        this.field = "default";
    }

    public FinalField(String field) {
        this.field = field;
    }

    public void f() {
    }


}
