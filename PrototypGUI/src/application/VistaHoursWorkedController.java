package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

/**
 * Controller class for the login vista.
 */
public class VistaHoursWorkedController implements VistaContainable {
    public VistaHoursWorkedController(VistaContainer parent){
        this.init(parent);
    }

    private VistaContainer parent;

    @Override
    public void init(VistaContainer parent){
        this.parent = parent;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(VistaNavigator.VISTA_HOURS_WORKED));
        loader.setController(this);
        try {
            parent.setVista(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void submit(ActionEvent event) {
        Dialogs.error("Generuję tabelę.", "Komunikat!");
    }

}