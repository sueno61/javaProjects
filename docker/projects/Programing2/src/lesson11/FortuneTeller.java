package Lesson11;

import java.util.Random;

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

		String[] eki = { "大吉", "吉", "凶" };
		String[] ekiUrl = {
				"https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiSutRv6L5RQqJdXp7Zc1JNAADwmgX3m0KMH52WympELsarGJcsKzwAp-ve1EcPOWa-iAl6XFcJX4yB6fwOkrkUPLCjetYZqzvL6GyJus2W4AkTy8-bKfVkD-48JXzLU31IivMXiYDJbJ0lDGn5-O4NV9AY7uP8OfHR18nuRmNIWrqIJ-B0fZc9TjFV8A/s400/eto_usagi_fukubukuro.png",
				"https://blogger.googleusercontent.com/img/a/AVvXsEgM85LEvtgJrUmGx95tmMptVQWhITwGOun2FEdThRoHM1iA2IV7J9KA94UtTJco4GVIvitht8kY-nc9U6SBQ6oLlsGCLSlr2S0dv9m04sUFE_suAa77Z8V-HxOFVxSsPMEqRgGGlC0ilOpb-a_tAjkvTr_ux8GfLjdCFWkj8HVQ-kGVukNz9WfrQ9_s1g=s180-c",
				"https://1.bp.blogspot.com/-KXJrCb1niqs/X5OclON7brI/AAAAAAABcA8/tz4BfmewslQC6RV3XSnPEn1L0J01ryIcgCNcBGAsYHQ/s180-c/youkai_backbeard.png" };
		Image[] ekiImg = new Image[3];

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

		ekiImg[0] = new Image(ekiUrl[0], 300, 0, true, false);
		ekiImg[1] = new Image(ekiUrl[1], 300, 0, true, false);
		ekiImg[2] = new Image(ekiUrl[2], 300, 0, true, false);
		// "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTICzKl7nWgiLrU62A9Gmm8yvwoBh5byKNR4Q&usqp=CAU");

		ImageView rep = new ImageView();

		// Buttonの作成
		Button btnSend = new Button("占う");

		// Buttonが押されたときの処理
		btnSend.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				int r = getEki();
				// response.setText(message.getText() + "の今日の運勢は、" + "大吉" + "です。");
				response.setText(message.getText() + "の今日の運勢は、" + eki[r] + "です。");

				// Image img2 = new Image(
				// "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTICzKl7nWgiLrU62A9Gmm8yvwoBh5byKNR4Q&usqp=CAU");
				rep.setImage(ekiImg[r]);

			}
		});

		// scene にテキストフィールド、ボタン、ラベルを設置
		rootNode.getChildren().addAll(logo, message, btnSend, response, rep);
		myStage.show();

	}

	public int getEki() {
		Random rand = new Random();
		return rand.nextInt(3);
	}
}