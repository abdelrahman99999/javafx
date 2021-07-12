
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class alertBox {
    public  static void display(String title,String message){
        Stage stage2=new Stage();
        stage2.setTitle(title);

        //we are going to block input events or user interaction with other windows
        stage2.initModality(Modality.APPLICATION_MODAL);

        Label label2=new Label(message);
        Button button2=new Button("click to close");
        button2.setOnAction(e->{
            stage2.close();
        });
        VBox layout2=new VBox(10);
        layout2.getChildren().addAll(label2,button2);
        layout2.setAlignment(Pos.CENTER);
        Scene scene2=new Scene(layout2,400,200);
        stage2.setScene(scene2);

        stage2.showAndWait();

    }
}
