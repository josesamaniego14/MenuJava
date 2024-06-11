package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Label messageLabel; // Label para mostrar mensajes

    @Override
    public void start(Stage primaryStage) {
        // BorderPane
        BorderPane root = new BorderPane();

        // Inicializar el Label y añadirlo al centro del BorderPane
        messageLabel = new Label();
        root.setCenter(messageLabel);

        // Barra de menú
        MenuBar menuBar = new MenuBar();

        // Menú Archivo
        Menu menuFile = new Menu("Archivo");
        MenuItem newFile = new MenuItem("Nuevo");
        MenuItem openFile = new MenuItem("Abrir");
        MenuItem saveFile = new MenuItem("Guardar");
        MenuItem exitFile = new MenuItem("Salir");

        newFile.setOnAction(e -> {
            System.out.println("Nuevo archivo creado");
            updateMessage("Nuevo archivo creado");
        });

        openFile.setOnAction(e -> {
            System.out.println("Archivo abierto");
            updateMessage("Archivo abierto");
        });

        saveFile.setOnAction(e -> {
            System.out.println("Archivo guardado");
            updateMessage("Archivo guardado");
        });

        exitFile.setOnAction(e -> primaryStage.close());

        menuFile.getItems().addAll(newFile, openFile, saveFile, new SeparatorMenuItem(), exitFile);

        // Menú Editar
        Menu menuEdit = new Menu("Editar");
        MenuItem copyEdit = new MenuItem("Copiar");
        MenuItem pasteEdit = new MenuItem("Pegar");

        copyEdit.setOnAction(e -> {
            System.out.println("Archivo copiado");          
            updateMessage("Archivo copiado");
        });

        pasteEdit.setOnAction(e -> {
            System.out.println("Archivo pegado");
            updateMessage("Archivo pegado");
        });

        menuEdit.getItems().addAll(copyEdit, pasteEdit);

        // Menú Ayuda
        Menu menuHelp = new Menu("Ayuda");
        MenuItem aboutHelp = new MenuItem("Acerca de");

        aboutHelp.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Acerca de");
            alert.setHeaderText(null);
            alert.setContentText("HOLA MUNDO");
            alert.showAndWait();
            updateMessage("Mostrando información sobre la aplicación");
        });

        menuHelp.getItems().add(aboutHelp);

        // Añadir los menús a la barra de menú
        menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);

        // Añadir la barra de menú al BorderPane
        root.setTop(menuBar);

        // Crear la escena y añadir el BorderPane
        Scene scene = new Scene(root, 300, 400);

        // Invocar el archivo CSS
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("Tarea Menú");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para actualizar el mensaje en el Label
    private void updateMessage(String message) {
        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
