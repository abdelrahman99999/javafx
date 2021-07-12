package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //this button refer to the button on fxml (by using id in fxml)
public Button button;
//this function will use onAction (as i write in fxml)
public void handleButtonClick(){
    System.out.println("you click me 😅");
    button.setText("stop touch me");
}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("this is the first function will be executed when opening the program");
    }
}
