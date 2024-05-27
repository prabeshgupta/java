public class OutputBird {
    private Bird bird;

    OutputBird(Bird bird) {
        this.bird = bird;
    }

    public void displayBird() {
        bird.eat();
        bird.run();
    }
}
