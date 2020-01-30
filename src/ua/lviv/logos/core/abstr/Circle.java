package ua.lviv.logos.core.abstr;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float square() {
        return (float) Math.PI * radius * radius;
    }
}
