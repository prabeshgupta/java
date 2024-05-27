public class OutputBirdFly {

    private BirdFly birdFly;

    OutputBirdFly(BirdFly birdFly) {
        this.birdFly = birdFly;
    }

    public void displayBirdFly() {
        birdFly.fly();
    }
}
