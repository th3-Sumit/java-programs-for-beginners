public class Fish implements Pray, Predator{
    @Override
    public void flee() {
        System.out.println("The fish is fleeing.");
    }

    @Override
    public void hunt() {
        System.out.println("the fish is hunting.");
    }
}
