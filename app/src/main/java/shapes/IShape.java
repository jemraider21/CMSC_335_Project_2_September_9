package shapes;

import javafx.scene.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class IShape {
    private int numberOfSides;
    private Image shapeImage;
}