package animals;

import java.util.ArrayList;

public class AnimalTestDrive {
    public static void main(String[] args) {
      ArrayList a1 = new ArrayList();
      ArrayList<Dog> m = new ArrayList<>();


      Dog d1 = new Dog();
      Cat c1 = new Cat();

      a1.add("my s");
      a1.add(1);
      a1.add(d1);

//      System.out.println(a1.get(0));
//      System.out.println(a1.get(1));
//      System.out.println(a1.get(2));

      ArrayList<Animal> anList = new ArrayList<>();

      anList.add(d1);
      anList.add(c1);

      Cat c2 = (Cat) anList.get(1);

      c2.play();
    }
}