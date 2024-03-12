package animal;

public class Dog extends Animal{
    public Dog(int legs, boolean furry) {
        super(legs, furry);
    }

    @Override
    protected String makeNoise() {
        return "Wouf";
    }
}
