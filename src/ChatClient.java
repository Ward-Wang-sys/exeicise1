import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ChatClient extends Application {
    BorderPane bor = new BorderPane();
    AnchorPane buttonPane = new AnchorPane();
    AnchorPane rightPane = new AnchorPane();
    AnchorPane centerPane = new AnchorPane();
    VBox vBox1=new VBox();
    HBox hBox1=new HBox();
    TextField textField = new TextField ("");
    TextArea textArea=new TextArea(" ");

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("ChatClient");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);


        Scene scene = new Scene(bor); // Create a scene
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        Button button1=new Button("Send");
        Button button2=new Button("Quit ");

        button1.setOnAction(new  EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {

            }
        });

        button2.setOnAction(new  EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {

            }
        });


        textField.setPrefSize(50,30);
        textField.setMaxWidth(50);
        textField.setStyle("-fx-background-color: #F1E3D2");

        textArea.setPrefColumnCount(50);
        textArea.setStyle("-fx-background-color: #F1E3D2 ");
        textArea.setStyle("-fx-progress-color: #F1E3D2 ");
        textArea.setStyle("-fx-color-label-visible: #F1E3D2  ");

        vBox1.getChildren().addAll(button1,button2);
        vBox1.setPadding(new Insets(10));
        vBox1.setSpacing(10);

        buttonPane.setStyle("-fx-background-color:#EBFF43");
        buttonPane.setPrefHeight(20);
        // buttonPane.setPadding(new Insets(10)); 内边距
        // buttonPane.setOpacity(10.0);  不透明度
        buttonPane.getChildren().add(textField);
        buttonPane.getChildren().addAll();
        AnchorPane.setLeftAnchor(textField,0.0);
        AnchorPane.setRightAnchor(textField,0.0);
        AnchorPane.setTopAnchor(textField,0.0);

        rightPane.setStyle("-fx-background-color:#D9C1B2");
        rightPane.getChildren().addAll(vBox1);
        AnchorPane.setLeftAnchor(vBox1,15.0);

        //centerPane.setStyle("-fx-background-color:#5567FF");
        centerPane.getChildren().add(textArea);
        AnchorPane.setLeftAnchor(textArea,0.0);
        AnchorPane.setRightAnchor(textArea,0.0);
        AnchorPane.setBottomAnchor(textArea,4);
        AnchorPane.setTopAnchor(textArea,0.0);

        //centerPane.setBottomAnchor(s1,50.0);
        //centerPane.setMaxHeight(200.0);

        bor.setPrefSize(50,50);
        bor.setStyle("-fx-background-color: #A65459");
        bor.setPadding(new Insets(4));
        bor.setBottom(buttonPane);
        bor.setRight(rightPane);
        bor.setCenter(centerPane);
    }
        public static void main(String[] args) {
        launch(args);
    }
}
