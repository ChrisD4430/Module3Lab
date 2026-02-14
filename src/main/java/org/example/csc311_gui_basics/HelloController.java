package org.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView redImage;
    @FXML
    private ImageView blackImage;
    @FXML
    private Button btn;
    @FXML
    private VBox mainBackground;

    private Boolean sceneSelector = true;

    @FXML
    protected void onHelloButtonClick() {
        if(sceneSelector){
            welcomeText.setTextFill(Color.WHITE);
            btn.setStyle("-fx-background-color: WHITE;");
            btn.setTextFill(Color.BLACK);
            mainBackground.setStyle("-fx-background-color: BLACK;");
            blackImage.setVisible(false);
            redImage.setVisible(true);
            sceneSelector = false;
        }else{
            welcomeText.setTextFill(Color.BLACK);
            btn.setStyle("-fx-background-color: BLACK;");
            btn.setTextFill(Color.WHITE);
            mainBackground.setStyle("-fx-background-color: LightSalmon;");
            blackImage.setVisible(true);
            redImage.setVisible(false);
            sceneSelector = true;
        }

    }
}