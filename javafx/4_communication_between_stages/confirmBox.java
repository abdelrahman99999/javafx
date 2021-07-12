
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class confirmBox {
    static boolean result;
    public  static void display(String title,String message){
        Stage window=new Stage();
        window.setTitle(title);

        //we are going to block input events or user interaction with other windows
        window.initModality(Modality.APPLICATION_MODAL);

        Label label2=new Label(message);
        Button YesButton=new Button("Yes");
        Button NoButton=new Button("No");
        YesButton.setOnAction(e->{
            result=true;
            window.close();
        });
        NoButton.setOnAction(e->{
            result=false;
            window.close();
        });
        VBox layout2=new VBox(10);
        layout2.getChildren().addAll(label2,YesButton,NoButton);
        layout2.setAlignment(Pos.CENTER);
        Scene scene2=new Scene(layout2,400,200);
        window.setScene(scene2);

        window.showAndWait();
    }
}
