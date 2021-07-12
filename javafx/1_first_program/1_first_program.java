//first program
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception{

        Button button =new Button();
        button.setText("click me");
        StackPane layout = new StackPane(); // create a pane
        layout.getChildren().add(button);

        //registering between event source object and event handler
        //anonymous inner class
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hello world");
            }
        });
        //lambda expression
        button.setOnAction(e->{
            System.out.println("hello world");
        });
        // Create a scene and place it in the stage
        final double WIDTH = 300, HEIGHT = 450; // See Fig. 14.40 (a)
        Scene scene = new Scene(layout, WIDTH, HEIGHT);
        primaryStage.setTitle("first program"); // Set the stage title
        primaryStage.setScene(scene); // Put scene in stage
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
 