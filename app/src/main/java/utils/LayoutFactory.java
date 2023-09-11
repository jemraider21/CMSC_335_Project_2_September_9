package utils;

import java.util.Map;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutFactory {
    private static Pane drawingPane;

    private LayoutFactory() {
    }

    public static void createStage(Stage primaryStage, ShapeFactory chosenShapeType,
            ComboBox<ShapeFactory> shapeComboBox, Map<String, Node> currentDrawingImageMap) {
        // Create UI elements
        drawingPane = new Pane();
        shapeComboBox.setValue(chosenShapeType);

        VBox layout = LayoutFactory.createLayout(chosenShapeType, shapeComboBox, currentDrawingImageMap);
        primaryStage.setScene(new Scene(layout, 400, 400));
        primaryStage.show();
    }

    private static VBox createLayout(ShapeFactory chosenShape, ComboBox<ShapeFactory> shapeComboBox,
            Map<String, Node> currentDrawingImageMap) {
        final String height = "height";
        final String radius = "radius";
        final String width = "width";

        switch (chosenShape) {
            case CIRCLE:
                return singleInputBoxLayout(radius, shapeComboBox, currentDrawingImageMap);
            case CONE:
                return doubleInputBoxLayout(height, radius, shapeComboBox, currentDrawingImageMap);
            case CUBE:
                return singleInputBoxLayout(width, shapeComboBox, currentDrawingImageMap);
            case CYLINDER:
                return doubleInputBoxLayout(height, radius, shapeComboBox, currentDrawingImageMap);
            case RECTANGLE:
                return doubleInputBoxLayout(width, height, shapeComboBox, currentDrawingImageMap);
            case SPHERE:
                return singleInputBoxLayout(radius, shapeComboBox, currentDrawingImageMap);
            case SQUARE:
                return singleInputBoxLayout(width, shapeComboBox, currentDrawingImageMap);
            case TRIANGLE:
                return doubleInputBoxLayout("base", height, shapeComboBox, currentDrawingImageMap);
            case TORUS:
                return doubleInputBoxLayout("radius major", "radius minor", shapeComboBox, currentDrawingImageMap);
        }
        return null;
    }

    private static VBox singleInputBoxLayout(String textBoxName, ComboBox<ShapeFactory> shapeComboBox,
            Map<String, Node> currentDrawingImageMap) {
        TextField value1Field = new TextField();
        value1Field.setPromptText(textBoxName);

        Button drawButton = new Button("Draw");
        drawButton.setOnAction(event -> DrawShapeFactory.drawShape(shapeComboBox.getValue(),
                value1Field.getText(), drawingPane, currentDrawingImageMap));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(shapeComboBox, value1Field, drawButton, drawingPane);

        return layout;
    }

    private static VBox doubleInputBoxLayout(String textBoxName1, String textBoxName2,
            ComboBox<ShapeFactory> shapeComboBox, Map<String, Node> currentDrawingImageMap) {
        TextField value1Field = new TextField();
        value1Field.setPromptText(textBoxName1);

        TextField value2Field = new TextField();
        value2Field.setPromptText(textBoxName2);

        Button drawButton = new Button("Draw");
        drawButton.setOnAction(event -> DrawShapeFactory.drawShape(shapeComboBox.getValue(),
                value1Field.getText(), value2Field.getText(), drawingPane, currentDrawingImageMap));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(shapeComboBox, value1Field, value2Field, drawButton, drawingPane);

        return layout;
    }
}
