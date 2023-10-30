package traincar;

import java.awt.Color;

import Graphics.CanvasWindow;

/**
 * Draws a three-car train consisting of an engine, a boxcar, and a caboose.
 */
public class TrainDrawer {
    public static final int SCALE = 1;

    private TrainCar engine;
    private TrainCar caboose;
    private TrainCar boxcar;
    private TrainCar boxcar2;

    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;

    public static void main(String[] args) {
        new TrainDrawer();
    }

    public TrainDrawer() {
        // Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);
        
        double trainWidth = 4 * TrainCar.CAR_WIDTH + 4 * TrainCar.CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight() - TrainCar.getCarHeight();
        double dx = TrainCar.CAR_WIDTH + TrainCar.CONNECTOR;

        engine = new Engine(Color.BLUE);
        canvas.add(engine, x, y);

        boxcar = new Boxcar(Color.GRAY);
        canvas.add(boxcar, x + dx, y);

        boxcar2 = new Boxcar(Color.GREEN);
        canvas.add(boxcar2, x + 2 * dx, y);

        caboose = new Caboose(Color.RED);
        canvas.add(caboose, x + 3 * dx, y);
    }
}
