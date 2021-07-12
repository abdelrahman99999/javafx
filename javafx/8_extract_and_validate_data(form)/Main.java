
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        window.setTitle("Form");

        HBox layout =new HBox(20);
        //age label
        Label AgeLabel=new Label("Age:");
        //age input
        TextField AgeInput=new TextField("20");


        //login button
        Button button=new Button("click");
        button.setOnAction(e->{
            check(AgeInput);
        });
        layout.getChildren().addAll(AgeLabel,AgeInput,button);

        Scene scene1=new Scene(layout,300,200);
        window.setScene(scene1);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    private void check(TextField t){
        try {
            int age = Integer.parseInt(t.getText());
            System.out.println("User age: "+age);
        }catch (NumberFormatException e){
            System.out.println("Error: "+t.getText()+" is not int number");
            System.out.println("you should enter integer Number");
        }

    }

}





