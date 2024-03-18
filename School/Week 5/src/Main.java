public class Main {
    public static void main(String[] args) {

        Eagle eagle = new Eagle();

        OutputBird bird1 = new OutputBird(eagle);
        bird1.displayBird();
        OutputBirdFly birdFly1 = new OutputBirdFly(eagle);
        birdFly1.displayBirdFly();

        System.out.println();

        Penguin penguin = new Penguin();

        OutputBird bird2 = new OutputBird(penguin);
        bird2.displayBird();

    }
}
