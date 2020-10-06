class Animal {
    int age;
    int weight;
    boolean running;
    boolean eating;

    public Animal(int age, int weight, boolean running, boolean eating) {
        this.age=age;
        this.weight=weight;
        this.running=running;
        this.eating=eating;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isEating() {
        return eating;
    }
}

class Felidea extends Animal {
    String uniqueBehavior = "Meow Meow";

    public Felidea(int age,
                   int weight,
                   boolean running,
                   boolean eating) {
        super(age, weight, running, eating);
    }

    public String getUniqueBehavior() {
        return uniqueBehavior;
    }

}

class Tiger extends Felidea {

    public Tiger(int age, int weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
    }
}


public class main {
    public static void main(String [] args){
        Tiger tigger = new Tiger(12,122,true,true);
        System.out.print(tigger.getUniqueBehavior());
    }
}
