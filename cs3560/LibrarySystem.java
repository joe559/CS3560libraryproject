package cs3560;
import java.util.List;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class LibrarySystem extends Student {
    public LibrarySystem(String name, int id, String email) {
        super(name, id, email);
    }

    private Library library;

    @Override
    public void start(Stage primaryStage) {
        Button searchButton = new Button("Search");
        TextField searchField = new TextField();
        ListView<Item> itemList = new ListView<>();

        searchButton.setOnAction(e -> {
            String query = searchField.getText();
            List<Item> items = library.searchItemsByTitle(query);
            itemList.getItems().setAll(items);
        });

        VBox root = new VBox();
        root.getChildren().addAll(searchField, searchButton, itemList);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {

    }
}