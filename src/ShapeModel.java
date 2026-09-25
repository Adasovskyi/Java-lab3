import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel {
    private final Shape[] shapes;

    public ShapeModel() {
        shapes = new Shape[]{
                new Rectangle("Red", 10.0, 5.0),
                new Circle("Blue", 7.0),
                new Triangle("Green", 6.0, 8.0),
                new Rectangle("Yellow", 4.0, 4.0),
                new Circle("Red", 3.0),
                new Triangle("Blue", 10.0, 12.0),
                new Rectangle("Green", 8.0, 3.0),
                new Circle("Yellow", 5.0),
                new Triangle("Red", 4.0, 7.0),
                new Rectangle("Blue", 12.0, 6.0)
        };
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public double calcTotalArea() {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public double calcTotalAreaByType(Class<?> shapeType) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shapeType.isInstance(shape)) {
                sum += shape.calcArea();
            }
        }
        return sum;
    }

    public void sortByArea() {
        Arrays.sort(shapes, new Comparator<>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.calcArea(), s2.calcArea());
            }
        });
    }

    public void sortByColor() {
        Arrays.sort(shapes, new Comparator<>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.getShapeColor().compareToIgnoreCase(s2.getShapeColor());
            }
        });
    }
}
