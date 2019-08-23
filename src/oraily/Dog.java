package oraily;

public class Dog {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int aSize) {
        size = aSize;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark(1);
        dog1.setName("Bart");

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].setName("Frad");
        myDogs[1].setName("Jordge");

        System.out.println("Имя последней собаки - " + myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark(1);
            x = x + 1;
        }
    }

    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Gav gav");
            } else if (size > 14) {
                System.out.println("Woof woof");
            } else {
                System.out.println("Thaf thaf");
            }

            numOfBarks = numOfBarks - 1;
        }

    }
    public void eat() {}
    public void chaseCat() {}
}
