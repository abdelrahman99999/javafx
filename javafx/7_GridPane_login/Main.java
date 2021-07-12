
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Login");

        GridPane layout=new GridPane();
        layout.setPadding(new Insets(10,10,10,10));
        layout.setVgap(10);
        layout.setHgap(8);
        //name label
        Label nameLabel=new Label("Username:");
        GridPane.setConstraints(nameLabel,0,0);
        //name input
        TextField nameInput=new TextField("abdelrahman");
        GridPane.setConstraints(nameInput,1,0);

        //pass label
        Label PassLabel=new Label("Password:");
        GridPane.setConstraints(PassLabel,0,1);
        //name input
        TextField passInput=new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        //login button
        Button logIn=new Button("LogIn");
        GridPane.setConstraints(logIn,1,2);

        layout.getChildren().addAll(nameLabel,nameInput,PassLabel,passInput,logIn);

        Scene scene1=new Scene(layout,300,200);
        window.setScene(scene1);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}





