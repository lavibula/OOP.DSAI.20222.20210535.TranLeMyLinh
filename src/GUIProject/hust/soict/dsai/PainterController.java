package GUIProject.hust.soict.dsai;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private RadioButton Eraser;

    @FXML
    private RadioButton Pen;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (Pen.isSelected()) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        } else if (Eraser.isSelected()) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 10, drawingAreaPane.getBackground().getFills().get(0).getFill());
            drawingAreaPane.getChildren().add(newCircle);
        }
    }

}

