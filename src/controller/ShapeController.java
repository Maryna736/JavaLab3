package controller;

import model.*;
import view.ConsoleView;

import java.util.Scanner;

public class ShapeController {
    private final ShapeModel model;
    private final ConsoleView view;

    public ShapeController(ShapeModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            view.showMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    view.showShapes(model.getShapes());
                    break;
                case "2":
                    view.drawShapes(model.getShapes());
                    break;
                case "3":
                    view.showTotalArea(model.totalArea());
                    break;
                case "4":
                    view.askType();
                    String t = sc.nextLine().trim();
                    switch (t) {
                        case "1":
                            view.showTotalAreaByType("Rectangle", model.totalAreaByType(Rectangle.class));
                            break;
                        case "2":
                            view.showTotalAreaByType("Triangle", model.totalAreaByType(Triangle.class));
                            break;
                        case "3":
                            view.showTotalAreaByType("Circle", model.totalAreaByType(Circle.class));
                            break;
                        default:
                            view.showMessage("Невірний вид фігури.");
                    }
                    break;
                case "5":
                    model.sortByArea();
                    view.showMessage("Відсортовано за площею (за зростанням).");
                    view.showShapes(model.getShapes());
                    break;
                case "6":
                    model.sortByColor();
                    view.showMessage("Відсортовано за кольором.");
                    view.showShapes(model.getShapes());
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    view.showMessage("Невірний пункт меню.");
            }
        }
    }
}
