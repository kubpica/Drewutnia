package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Controller class for the login vista.
 */
public class VistaLogInController implements VistaContainable {
    private static Permission permission = Permission.GUEST;

    public static boolean hasFullPermissions(){
        if(permission == Permission.FULL)
            return true;
        return false;
    }

    public static boolean hasOrganizerPermissions(){
        if(permission == Permission.FULL || permission == Permission.ORGANIZER)
            return true;
        return false;
    }

    public static boolean isLoggedIn(){
        if(permission != Permission.GUEST)
            return true;
        return false;
    }

    /*public VistaLogInController(VistaContainer parent){
        this.parent = parent;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(VistaNavigator.VISTA_LOGIN));
        loader.setController(this);
        try {
            parent.setVista(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.init();
    }*/

    private VistaContainer parent;
    @FXML private TextField idField;
    @FXML private PasswordField pwField;

    @Override
    public void init(VistaContainer parent){
        this.parent = parent;
    }

    @FXML
    void submit(ActionEvent event) {
        permission = Permission.FULL;
        VistaEntryViewerController entryViewer = new VistaEntryViewerController(parent, "Contestant");
        entryViewer.addEntry("500zł", "" );
        entryViewer.addEntry("200zł", "" );
        entryViewer.addEntry("100zł", "" );
        entryViewer.addEntry("50zł", "" );
        entryViewer.addEntry("20zł", "" );
        entryViewer.addEntry("10zł", "" );
        entryViewer.addEntry("5zł", "" );
        entryViewer.addEntry("2zł", "" );
        entryViewer.addEntry("1zł", "" );
        entryViewer.addEntry("50gr", "" );
        entryViewer.addEntry("20gr", "" );
        entryViewer.addEntry("10gr", "" );
        entryViewer.addEntry("5gr", "" );
        entryViewer.addEntry("2gr", "" );
        entryViewer.addEntry("1gr", "" );
    }

}