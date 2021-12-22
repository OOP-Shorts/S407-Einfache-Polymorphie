public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5, "German Shepherd");
        Cat cat = new Cat("Fluffy", 3, true);
        System.out.println(willGetAlong(dog, cat));
    }

    private static boolean willGetAlong(Animal animal1, Animal animal2) {
        boolean bothDogs = animal1 instanceof Dog && animal2 instanceof Dog;
        boolean bothCats = animal1 instanceof Cat && animal2 instanceof Cat;
        return bothDogs || bothCats;
    }
}