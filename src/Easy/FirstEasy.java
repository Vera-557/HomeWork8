package Easy;
/*
Создайте свой зоопарк. Для этого создайте абстрактный класс Животные. Добавьте абстрактные методы walk() и say().
Также создайте различных животных, которые наследуют класс Животные, например: жираф, лев, тигр, пингвин и т.д.
Зоопарк должен уметь выводить, какие животных есть в зоопарке.
 */
class FirstEasy {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");
        Animal rat = new Rat("Mouse");
       zooMove(dog, cat, rat);
    }
    protected static void zooMove(Animal... animals){
        for (Animal animal : animals) {
            animal.say();
            animal.walk();
        }
    }

}
class Dog extends Animal{
    Dog(String animal) {
        super(animal);
    }

    @Override
    public void walk() {
        System.out.println("Walking dog");
    }

    @Override
    public void say() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal{

    Cat(String animal) {
        super(animal);
    }

    @Override
    public void walk() {
        System.out.println("Walking cat");
    }

    @Override
    public void say() {
        System.out.println("Meou!");
    }
}

class Rat extends Animal{

    Rat(String animal) {
        super(animal);
    }

    @Override
    public void walk() {
        System.out.println("Walking mouse");
    }

    @Override
    public void say() {
        System.out.println("Pip!");
    }
}