package dog; /**
 * Created by koqfl on 04.05.2017.
 */


/**
 * Created by koqfl on 01.05.2017.
 */
public class Dog {
    private String name;
    Breed breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Dog(String name, Breed breed, int age) {
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return name.toString();
    }

    public int getAge() {
        return age;
    }

    public static String Oldest(Dog dog1, Dog dog2, Dog dog3) {
        int tmp = dog1.age >= dog2.age ? (dog1.age >= dog3.age ? dog1.age : dog3.age) : dog2.age >= dog3.age ? dog2.age : dog3.age;
        if (tmp == dog1.age) {
            return "Dog name is:  " + dog1.name;
        }
        if (tmp == dog2.age) {
            return "Dog name is:  " + dog2.name;
        }
        if (tmp == dog3.age) {
            return "Dog name is:  " + dog3.name;
        } else
            return "Something gone wrong";
    }


    public static String SameName(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.name.equals(dog2.name) && dog2.name.equals(dog3.name) && dog1.name.equals(dog3.name)) {
            return "There are coincidences";
        } else
            return "No matches";
    }
}
