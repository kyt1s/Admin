import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class Button extends Application 
 {

    public void start(Stage my) throws Exception
 {
        my.setTitle("HBox Experiment 1");

        Button button = new Button("My Button");

        Scene scene = new Scene(button, 200, 100);
        my.setScene(scene);
        my.show();

    }
    
public static void main(String[] args) 
    {
        Application.launch(args);
    }
}