package oraily;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);

        Dog two = new Dog();
        two.setSize(8);

//        one.bark(1);
//        two.bark(1);

        Dog[] pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();

        pets[0].setSize(30);
    }
}
