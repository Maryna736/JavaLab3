import controller.ShapeController;
import model.ShapeModel;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        new ShapeController(new ShapeModel(), new ConsoleView()).run();
    }
}
