package Solution;

public class Dog {

    int legs;
    String name;
    boolean isHappy;

    public Dog() {
        this.legs = 4;
        this.name = null;
        this.isHappy = true;
    }

    public Dog(String name) {
        this.legs = 4;
        this.name = name;
        this.isHappy = true;
    }

    public int getLegs() {
        return this.legs;
    }

    public String getName() {
        return this.name;
    }

    public boolean getHappiness() {
        return this.isHappy;
    }
}
