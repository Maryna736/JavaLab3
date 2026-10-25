package model;

import java.util.Arrays;
import java.util.Comparator;

/** Модель: зберігає набір даних і містить бізнес-логіку обробки. */
public class ShapeModel {
    private final Shape[] shapes;

    public ShapeModel() {
        shapes = new Shape[]{
            new Rectangle("Red", 4, 5),
            new Triangle("Blue", 6, 3),
            new Circle("Green", 2),
            new Rectangle("Yellow", 3, 3),
            new Circle("Red", 1.5),
            new Triangle("Green", 10, 4),
            new Rectangle("Blue", 7, 2),
            new Circle("Black", 3),
            new Triangle("Red", 5, 5),
            new Rectangle("Green", 2.5, 8),
            new Circle("Blue", 4.2),
            new Triangle("Yellow", 8, 2)
        };
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public double totalArea() {
        double sum = 0;
        for (Shape s : shapes) sum += s.calcArea();
        return sum;
    }

    public double totalAreaByType(Class<? extends Shape> type) {
        double sum = 0;
        for (Shape s : shapes) {
            if (type.isInstance(s)) sum += s.calcArea();
        }
        return sum;
    }

    public void sortByArea() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape a, Shape b) {
                return Double.compare(a.calcArea(), b.calcArea());
            }
        });
    }

    public void sortByColor() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape a, Shape b) {
                return a.getShapeColor().compareToIgnoreCase(b.getShapeColor());
            }
        });
    }
}
