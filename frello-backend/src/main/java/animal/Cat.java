package animal;

public class Cat extends Animal{


    public Cat(int legs, boolean furry) {
        super(legs, furry);
    }

    @Override
    protected String makeNoise() {
        return "Miaou";
    }
}
