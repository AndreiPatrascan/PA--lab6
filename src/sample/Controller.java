package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.awt.*;
import java.awt.event.MouseEvent;

public class Controller {
    String Size, NrSides, Stroke;
    @FXML private TextField StrokeField;
    @FXML private TextField NrSidesField;
    @FXML private TextField SizeField;
    @FXML private Canvas canvas;


    @FXML
    private void getSize(){
        Size = SizeField.getText();
    }

    @FXML
    private void getNrSides(){
        NrSides = NrSidesField.getText();
    }

    @FXML
    private void getStroke(){
        Stroke = StrokeField.getText();
    }

    int x_coord, y_coord;

    @FXML
    private void getCoords(MouseEvent mouseEvent){
        x_coord = mouseEvent.getX();
        y_coord = mouseEvent.getY();
    }

    @FXML
    private void DrawSquare(){
        GraphicsContext g = canvas.getGraphicsContext2D();
        g.fillRect(x_coord,y_coord, Integer.parseInt(Size),Integer.parseInt(Size));
    }
}
