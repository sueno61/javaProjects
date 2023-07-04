import java.util.Random;

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
		Label result = new Label(" ");

		// Buttonの作成
		Button btnR = new Button("グー");
		Button btnS = new Button("チョキ");
		Button btnP = new Button("パー");

		// Images
		Image[] imgs = new Image[3];

		imgs[0] = new Image("rock.gif");
		imgs[1] = new Image("scissors.gif");
		imgs[2] = new Image("paper.gif");

		ImageView myHand = new ImageView();
		ImageView javaHand = new ImageView();

		// ボタンが押されたら・・・
		btnR.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				int M = 0;
				myHand.setImage(imgs[M]);
				int J = getJavaHand();
				javaHand.setImage(imgs[J]);
				result.setText(HANTEI(M, J));
			}
		});

		btnS.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				int M = 1;
				myHand.setImage(imgs[M]);
				int J = getJavaHand();
				javaHand.setImage(imgs[J]);
				result.setText(HANTEI(M, J));
			}
		});

		btnP.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				int M = 2;
				myHand.setImage(imgs[M]);
				int J = getJavaHand();
				javaHand.setImage(imgs[J]);
				result.setText(HANTEI(M, J));
			}
		});

		// scene にラベルを設置
		rootNode.getChildren().addAll(btnR, btnS, btnP, response, myHand, javaHand, result);
		myStage.show();
	}

	public int getJavaHand() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

	public String HANTEI(int M, int J) {
		// グー、チョキ、パー
		// たて：人の手、横：javaの手
		// 0:引き分け、1:人の勝ち、2:javaの勝ち
		int[][] wlMat = {
				{ 0, 1, 2 },
				{ 2, 0, 1 },
				{ 1, 2, 0 }
		};
		String[] commt = {
				"引き分けです",
				"あなたの勝ち",
				"javaの勝ち"
		};

		return commt[wlMat[M][J]];
	}
}
