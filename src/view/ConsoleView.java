package view;

import model.Shape;

public class ConsoleView {
    public void showMenu() {
        System.out.println("\n===== МЕНЮ =====");
        System.out.println("1. Показати набір даних");
        System.out.println("2. Намалювати всі фігури (draw)");
        System.out.println("3. Сумарна площа всіх фігур");
        System.out.println("4. Сумарна площа фігур заданого виду");
        System.out.println("5. Сортувати за площею");
        System.out.println("6. Сортувати за кольором");
        System.out.println("0. Вихід");
        System.out.print("Ваш вибір: ");
    }

    public void showShapes(Shape[] shapes) {
        System.out.println("--- Набір фігур ---");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i + 1) + ". " + shapes[i]);
        }
    }

    public void drawShapes(Shape[] shapes) {
        for (Shape s : shapes) s.draw();
    }

    public void showTotalArea(double area) {
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", area);
    }

    public void showTotalAreaByType(String type, double area) {
        System.out.printf("Сумарна площа фігур виду %s: %.2f%n", type, area);
    }

    public void askType() {
        System.out.print("Вид фігури (1 - Rectangle, 2 - Triangle, 3 - Circle): ");
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}
