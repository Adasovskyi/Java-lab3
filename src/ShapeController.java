public class ShapeController {
    private final ShapeModel model;
    private final ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.printMessage("Initial data");
        view.printShapes(model.getShapes());

        view.printMessage("Total area of all shapes");
        view.printMessage(String.format("%.2f\n", model.calcTotalArea()));

        view.printMessage("Total area of all circles");
        view.printMessage(String.format("%.2f\n", model.calcTotalAreaByType(Circle.class)));

        view.printMessage("Sorting shapes in ascending order by area");
        model.sortByArea();
        view.printShapes(model.getShapes());

        view.printMessage("Sorting shapes by color (alphabetical order)");
        model.sortByColor();
        view.printShapes(model.getShapes());
    }
}