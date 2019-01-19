package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

/**
 * Controller class for the login vista.
 */
public class VistaBackupsController implements VistaContainable {
    public VistaBackupsController(VistaContainer parent){
        this.init(parent);
    }

    private VistaContainer parent;

    @Override
    public void init(VistaContainer parent){
        this.parent = parent;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(VistaNavigator.VISTA_BACKUPS));
        loader.setController(this);
        try {
            parent.setVista(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void submit(ActionEvent event) {
        Dialogs.error("Wykryto niezgodność w systemie! Kliknij OK, aby wyświetlić szczegóły.", "Alert!");
    }

}