package animals;

abstract class Animal {
    public String picture = "url";
    public String food = "food";
    public Boolean hunger = false;
    public String boundaries = "100, 400";
    public String location = "Africa";

    public String makeNoise() {
        return "Animal say";
    }

    public String eat() {
        return "eat";
    }

    public void sleep() {

    }

    public void roam() {

    }
}
