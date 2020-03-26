package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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

    @FXML
    private void DrawSquare(MouseEvent event){
        double x = event.getX();
        double y = event.getY();
        //System.out.println(x+" "+y);

        GraphicsContext g = canvas.getGraphicsContext2D();
        g.fillRect(x,y, Integer.parseInt(Size),Integer.parseInt(Size));
    }
}
