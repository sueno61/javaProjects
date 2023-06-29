package Lesson11;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//JavaFXをつかうときには public を付けましょう
public class JavaFXSample_ extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {
		myStage.setTitle("はじめてのGUIプログラミング");

		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.TOP_LEFT);
		// Sceneの作成
		Scene myScene = new Scene(rootNode, 400, 300);
		// stage 上に sceneを作成
		myStage.setScene(myScene);

		// labelを作成
		Label l1 = new Label("Hello,");
		rootNode.getChildren().addAll(l1);

		myStage.show();
	}
}
