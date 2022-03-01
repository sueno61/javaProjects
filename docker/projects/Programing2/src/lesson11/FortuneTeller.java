package lesson11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//JavaFXをつかうときには public を付けましょう
public class FortuneTeller extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {
		myStage.setTitle("占いアプリ");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.TOP_LEFT);
		// Sceneの作成
		Scene myScene = new Scene(rootNode, 400, 300);
		// stage 上に sceneを作成
		myStage.setScene(myScene);
		// TextFieldの作成
		TextField message = new TextField();
		// TextFieldのサイズの設定
		message.setPrefWidth(250);
		// テキストの設定
		message.setText("占いたい人の名前を入力してください");
		// labelを作成
		Label response = new Label();

		Image img = new Image("https://nop.takushoku-u.ac.jp/common/images/pc_header_log.png");
		ImageView logo = new ImageView(img);

		// Buttonの作成
		Button btnSend = new Button("占う");
		// Buttonが押されたときの処理
		btnSend.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText(message.getText() + "の今日の運勢は、" + "大吉" + "です。");

				Image img2 = new Image(
						"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTICzKl7nWgiLrU62A9Gmm8yvwoBh5byKNR4Q&usqp=CAU");
				logo.setImage(img2);

			}
		});
		// scene にテキストフィールド、ボタン、ラベルを設置
		rootNode.getChildren().addAll(logo, message, btnSend, response);
		myStage.show();
	}
}