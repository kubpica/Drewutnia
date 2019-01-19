package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * Main controller class for the entire layout.
 */
public class MainController extends VistaContainer  {

    /** Holder of a switchable vista. */
    @FXML
    private StackPane vistaHolder;
    @FXML
    private Label bottomLabel;

    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    @Override
    public void setVista(Node node) { vistaHolder.getChildren().setAll(node); }

    @FXML
    private void closeAppAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void changePasswordAction(ActionEvent event) {
        new VistaChangePasswordController(this);
    }

    @FXML
    private void inventorizationAction(ActionEvent event) {
        new VistaInventorizationController(this);
    }

    @FXML
    private void contactsAction(ActionEvent event) {
        VistaEntryViewerController entryViewer = new VistaEntryViewerController(this, "Contacts");
        entryViewer.addEntry("Menadżer", "784630405" );
        entryViewer.addEntry("Ochroniarz", "784630405" );
    }

    @FXML
    private void docsAction(ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.VISTA_MANAGER, this);
        bottomLabel.setText("Perspektywa menadżera");
    }

    @FXML
    private void backupsAction(ActionEvent event) {
        new VistaBackupsController(this);
    }

    @FXML
    private void logInAction(ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.VISTA_LOGIN, this);
    }
}