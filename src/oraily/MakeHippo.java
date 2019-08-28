package oraily;

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    Animal(String theName) {
        name = theName;
    }
}

class Hippo extends Animal {
    Hippo(String name) {
        super(name);
    }
}

public class MakeHippo {
    public static void main(String[] args) {
        Hippo h1 = new Hippo("Jordan");

        System.out.println(h1.getName());
    }
}
