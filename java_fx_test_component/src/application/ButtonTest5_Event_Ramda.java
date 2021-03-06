package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonTest5_Event_Ramda extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// ~~Pane으로 끝나는 클래스의 부모 : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button(); // 라벨버튼

		btn.setPrefWidth(120);
		btn.setPrefHeight(40);

		// 레이아웃 내에 버튼 위치 변경 메서드
		btn.setLayoutX(90);
		btn.setLayoutY(80);

		// 버튼 내부에 글씨 대신 이미지를 출력하기 위한 ImageView 객체 생성
		ImageView iv = new ImageView("/images/SmileReRe.png");

		btn.setGraphic(iv);

		// 이벤트 핸들러 객체 생성 : 컴포넌트 마다 이벤트 형식 변경될 수 있음..
		// ActionEvent: 가장 보편적으로 사용되는 이벤트
		// 마우스 왼쪽버튼 클릭 시, 이벤트 발생

		EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
//				Alert alert = new Alert(AlertType.INFORMATION); // 경고창 객체
//				Alert alert = new Alert(AlertType.ERROR); // 경고창 객체
//				Alert alert = new Alert(AlertType.CONFIRMATION); // 경고창 객체
				Alert alert = new Alert(AlertType.WARNING); // 경고창 객체
				alert.setTitle("경고");
				alert.setHeaderText("버튼이벤트");
				alert.setContentText("버튼을 클릭했습니다.");
				alert.show();
			}
		};// 이벤트 핸들러 객체 생성 코드 종료

		// 이벤트 핸들러 객체 생성 코드 종료
		btn.setOnAction(eh);

		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 400);

		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}

}
