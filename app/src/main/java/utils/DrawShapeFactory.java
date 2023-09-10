package utils;

import java.util.Map;

import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import shapes.IShape;
import shapes.threedimensionalshapes.ThreeDimensionalShape;
import shapes.twodimensionalshapes.TwoDimensionalShape;

public class DrawShapeFactory {
    public static void drawShape(ShapeFactory shapeType, String value1, Pane drawingPane,
            Map<String, Node> currentDrawingImageMap) {
        drawShape(shapeType, value1, ConstantValues.DEFAULT_NUM_VALUE, drawingPane, currentDrawingImageMap);
    }

    public static void drawShape(ShapeFactory shapeType, String value1,
            String value2, Pane drawingPane, Map<String, Node> currentDrawingImageMap) {
        IShape shape = ShapeFactory.createShape(shapeType, value1, value2);
        if (shape instanceof TwoDimensionalShape) {
            drawTwoDimShape((TwoDimensionalShape) shape, drawingPane, currentDrawingImageMap);
        } else {
            drawThreeDimShape((ThreeDimensionalShape) shape, drawingPane, currentDrawingImageMap);
        }
    }

    private static void drawTwoDimShape(TwoDimensionalShape shape, Pane drawingPane,
            Map<String, Node> currentDrawingImageMap) {
        resetDrawingPane(drawingPane, currentDrawingImageMap);

        Shape currentShape = shape.getVisualShape();
        currentDrawingImageMap.put(ConstantValues.SHAPE_KEY, currentShape);
        drawingPane.getChildren().add(currentShape);
    }

    private static void drawThreeDimShape(ThreeDimensionalShape shape, Pane drawingPane,
            Map<String, Node> currentDrawingImageMap) {
        resetDrawingPane(drawingPane, currentDrawingImageMap);

        ImageView currentImage = new ImageView(shape.getShapeImage());
        currentDrawingImageMap.put(ConstantValues.IMAGE_KEY, currentImage);
        drawingPane.getChildren().add(currentImage);
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
