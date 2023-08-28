class Animal {
  protected String name;

  protected void display() {
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {

  public void getInfo() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    
    Dog labrador = new Dog();

    
    labrador.name = "Sheru";
    labrador.display();

    labrador.getInfo();
  }
