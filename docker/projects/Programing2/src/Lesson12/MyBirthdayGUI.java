package Lesson12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyBirthdayGUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {

		myStage.setTitle("誕生日アプリ");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.TOP_LEFT);
		// Sceneの作成
		Scene myScene = new Scene(rootNode, 280, 200);

		// stage 上に sceneを作成
		myStage.setScene(myScene);

		// 入力フィールド
		TextField year = new TextField();
		TextField month = new TextField();
		TextField day = new TextField();
		// TextFieldのサイズの設定
		year.setPrefWidth(100);
		month.setPrefWidth(40);
		day.setPrefWidth(40);
		// テキストの設定
		year.setText("年(西暦)");
		month.setText("月");
		day.setText("日");

		// labelを作成
		Label wareki_t = new Label("和暦:");
		Label wareki = new Label("　　　　");
		Label youbi_t = new Label("曜日:");
		Label youbi = new Label(" 　");

		// Buttonの作成
		Button btn = new Button("表示");

		// Images
		//		Image[] imgs = new Image[3];
		//		imgs[0] = new Image("rock.gif");
		//		imgs[1] = new Image("scissors.gif");
		//		imgs[2] = new Image("paper.gif");

		//		ImageView myHand = new ImageView();

		// ボタンが押されたら・・・
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {

				int yyyy = Integer.parseInt(year.getText());
				int mm = Integer.parseInt(month.getText());
				int dd = Integer.parseInt(day.getText());
				int md = mm * 100 + dd;
				MyBirthday mb = new MyBirthday(yyyy, md);
				wareki.setText(mb.toWareki());
				youbi.setText(mb.getDayOfWeek());

				//				myHand.setImage(imgs[0]);

			}
		});

		// scene にラベルを設置
		rootNode.getChildren().addAll(year, month, day, btn, wareki_t, wareki, youbi_t, youbi);
		myStage.show();
	}

}
