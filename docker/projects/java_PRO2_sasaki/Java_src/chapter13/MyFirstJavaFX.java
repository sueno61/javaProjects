import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class MyFirstJavaFX extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage myStage) {
    FlowPane rootNode = new FlowPane(10, 10);
    rootNode.setAlignment(Pos.TOP_LEFT);
    Scene myScene = new Scene(rootNode, 400, 200);
    myStage.setTitle("はじめてのJavaFXプログラミング");
    myStage.setScene(myScene);
    Label message = new Label("Hello.");
    rootNode.getChildren().add(message);
    myStage.show();
  }
}
