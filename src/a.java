import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class a extends Application{
    TextField textField = new TextField();
    TextArea textArea = new TextArea("NMSL");
    public void launchFrame() {


    }
    public static void main(String[] args) {
        launch(args);
        ChatClient chat =new ChatClient();

    }
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane =new BorderPane();
        pane.setBottom(textField);
        pane.setCenter(textArea);
        pane.setRight(addVBox());
        Scene scene = new Scene(pane,800,600);
        stage.setTitle("ChatClient");
        stage.setScene(scene);
        stage.show();

    }
    public VBox addVBox() {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(15, 12, 15, 12));
        vbox.setSpacing(10);
        Button send = new Button("Send");
        Button quit = new Button("Quit");
        vbox.getChildren().addAll(send,quit);
        return vbox;
    }

}
