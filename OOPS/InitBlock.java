// package OOPS;

public class InitBlock {
    int x;
    public InitBlock() {
        System.out.println("Const. Executed...");
        this.x = 12;
    }
    // Init Block - will be called before constructor...
    {
        System.out.println("Init Block Executed...");
        x = 50;
    }

    // Static Block - will be called even before init block
    // will be executed only once...
    // static things are binded with class, not with object
    static {
        System.out.println("Static Block Executed...");
    }

    public static void main(String[] args) {
        InitBlock obj_1 = new InitBlock();
        InitBlock obj_2 = new InitBlock();
        InitBlock obj_3 = new InitBlock();
    }
}
