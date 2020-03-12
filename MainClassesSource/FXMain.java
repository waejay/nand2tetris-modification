import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.embed.swing.SwingNode;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
//        final SwingNode swingNode = new SwingNode();
//
//        loadSwingContent(swingNode);

        Parent root = FXMLLoader.load(getClass().getResource("skeleton.fxml"));
        primaryStage.setTitle("Hello Mason");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

//    private void loadSwingContent(final SwingNode swingNode){
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                swingNode.setContent(new JButton("Click Me"));
//            }
//        });
//    }
}
