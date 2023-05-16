import javafx.application.Application;
import javafx.stage.Stage;

//JavaFXをつかうときには public を付けましょう
public class JavaFXSample extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {
		myStage.setTitle("はじめてのGUIプログラミング");
		myStage.show();
	}
}