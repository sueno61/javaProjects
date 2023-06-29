import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//JavaFXをつかうときには public を付けましょう
public class Jyanken extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {

		myStage.setTitle("ジャンケン");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		// Sceneの作成
		Scene myScene = new Scene(rootNode, 200, 200);
		// stage 上に sceneを作成
		myStage.setScene(myScene);

		// labelを作成
		Label response = new Label("ジャンケンしよう！");

		// Buttonの作成
		Button btnG = new Button("グー");

		// Images
		Image[] imgs = new Image[3];

		imgs[0] = new Image("rock.gif");
		imgs[1] = new Image("scissors.gif");
		imgs[2] = new Image("paper.gif");

		ImageView myHand = new ImageView();
		// ボタンが押されたら・・・
		btnG.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				myHand.setImage(imgs[0]);

			}
		});

		// scene にラベルを設置
		rootNode.getChildren().addAll(btnG, response, myHand);
		myStage.show();
	}
}
