interface IPlayer {
    // What to do ?
    void walk();        // internally - public abstract void walk();
    void run();
    void jump();
    void punch();
    void kick();
    int JUMP_HEIGHT = 10;      // public static final int JUMP_HEIGHT = 10
}

interface IPower {
    void invisible();
}

abstract class CommonFeatures implements IPlayer {
    @Override
    public void walk() {
        System.out.println("Walk Logic...");
    }

    @Override
    public void run() {
        System.out.println("Run Logic...");
    }

    @Override
    public void jump() {
        System.out.println("Jump Logic...");
    }
}

class King extends CommonFeatures implements IPlayer, IPower {

    @Override
    public void punch() {
        System.out.println("Punch Logic...");
    }

    @Override
    public void kick() {
        System.out.println("Kick Logic...");
    }
    
    @Override
    public void invisible() {

    }

}

class Eddy extends CommonFeatures implements IPlayer {

    @Override
    public void punch() {
        System.out.println("Punch Logic...");
    }

    @Override
    public void kick() {
        System.out.println("Kick Logic...");
    }
}

class Paul extends CommonFeatures implements IPlayer {

    @Override
    public void punch() {
        System.out.println("Punch Logic...");
    }

    @Override
    public void kick() {
        System.out.println("Kick Logic...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
