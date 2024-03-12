package animal;

public abstract class Animal {

    Animal(int legs, boolean furry) {
        this.legs = legs;
        this.furry = furry;
    }

    int legs;
    boolean furry;

    protected abstract String makeNoise();
}
