
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//JavaFXをつかうときには public を付けましょう
public class JavaFXSample2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {
		myStage.setTitle("Flowペインの練習");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.TOP_LEFT);
		// Sceneの作成
		Scene myScene = new Scene(rootNode, 200, 100);
		// stage 上に sceneを作成
		myStage.setScene(myScene);
		// labelを作成
		Label l1 = new Label("Hello,");
		Label l2 = new Label("How");
		Label l3 = new Label("are");
		Label l4 = new Label("you?");
		// scene にボタンとラベルを設置
		rootNode.getChildren().addAll(l1, l2, l3, l4);
		myStage.show();
	}
}