package Easy;

abstract class Animal {
  private String animal;

    public abstract void walk();
    public abstract void say();
    Animal(String animal){
        this.animal = animal;
    }
    public String getAnimal() {
        return animal;
    }

}

