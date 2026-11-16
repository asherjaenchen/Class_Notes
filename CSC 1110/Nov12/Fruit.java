package Nov12;

interface Fruit {
    String PREPPED_COLOR = "\u001b[32m";
    String NOT_PREPPED_COLOR = "\u001b[31m";
    String RESET = "\u001b[0m";

    boolean isPrepped();
    void prep();
    void display();
    static void processFruit(Fruit fruit){
        if (!fruit.isPrepped()){
            fruit.prep();
        } else {
            System.out.println("Fruit already prepped.");
        }
    }
}
