package dog; /**
 * Created by koqfl on 04.05.2017.
 */
import dog.Breed;
import dog.Dog;

import static dog.Dog.Oldest;
import static dog.Dog.SameName;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Roki", Breed.AFGAN_HOUND, 3);
        Dog dog2 = new Dog("Jack", Breed.AKITA, 5);
        Dog dog3 = new Dog("Baloon", Breed.TOY_TERRIER, 7);

        System.out.println(Oldest(dog1,dog2,dog3));
        System.out.println(SameName(dog1,dog2,dog3));

    }
}