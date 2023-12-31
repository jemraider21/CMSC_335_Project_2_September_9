package factories;

import java.util.Map;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import shapes.IShape;
import shapes.threedimensionalshapes.ThreeDimensionalShape;
import shapes.twodimensionalshapes.TwoDimensionalShape;
import utils.ConstantValues;

public class DrawShapeFactory {
    private DrawShapeFactory() {
    }

    public static void drawShape(ShapeFactory shapeType, String value1, Pane drawingPane,
            Map<String, Node> currentDrawingImageMap) {
        drawShape(shapeType, value1, ConstantValues.DEFAULT_NUM_VALUE, drawingPane, currentDrawingImageMap);
    }

    public static void drawShape(ShapeFactory shapeType, String value1,
            String value2, Pane drawingPane, Map<String, Node> currentDrawingImageMap) {
        IShape shape = ShapeFactory.createShape(shapeType, value1, value2);

        resetDrawingPane(drawingPane, currentDrawingImageMap);
        ImageView currentImage = new ImageView(shape.getShapeImage());
        currentDrawingImageMap.put(ConstantValues.IMAGE_KEY, currentImage);
        drawingPane.getChildren().add(currentImage);

        if (shape instanceof TwoDimensionalShape) {
            showAlertDialog("Calculating Area", "Area", shape.getClass().getSimpleName(), shape.getNumberOfSides(),
                    ((TwoDimensionalShape) shape).getArea());
        } else {
            showAlertDialog("Calculating Volume", "Volume", shape.getClass().getSimpleName(), shape.getNumberOfSides(),
                    ((ThreeDimensionalShape) shape).getVolume());
        }
    }

    private static void showAlertDialog(String header, String calculationType, String shapeName, int shapeNumSides,
            double calculationResult) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(header);

        String shapeNumSidesMessage = String.format("Number of sides for %s: %d", shapeName, shapeNumSides);
        String calculationMessage = String.format("%s of the %s: %.3f", calculationType, shapeName, calculationResult);
        alert.setContentText(String.format("%s%n%s", shapeNumSidesMessage, calculationMessage));
        alert.showAndWait();
    }

    private static void resetDrawingPane(Pane drawingPane, Map<String, Node> currentDrawingImageMap) {
        ImageView currentImage = (ImageView) currentDrawingImageMap.get(ConstantValues.IMAGE_KEY);
        if (currentImage != null) {
            drawingPane.getChildren().remove(currentImage);
        }

        Shape currentShape = (Shape) currentDrawingImageMap.get(ConstantValues.SHAPE_KEY);
        if (currentShape != null) {
            drawingPane.getChildren().remove(currentShape);
        }
    }
}
