package application;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 */
public class VistaNavigator {

    /**
     * Convenience constants for fxml layouts managed by the navigator.
     */
    public static final String MAIN    = "/application/main.fxml";
    public static final String VISTA_LOGIN = "/application/vistaLogIn.fxml";
    public static final String VISTA_MANAGER = "/application/vistaManager.fxml";
    public static final String VISTA_WORKER = "/application/vistaWorker.fxml";
    public static final String VISTA_HOLDER = "/application/vistaHolder.fxml";
    public static final String VISTA_ENTRY = "/application/vistaEntryViewer.fxml";
    public static final String VISTA_REGISTER = "/application/vistaRegistration.fxml";
    public static final String VISTA_CHANGE_PASSWORD = "/application/vistaChangePassword.fxml";
    public static final String VISTA_INVENTORIZATION = "/application/vistaInventorization.fxml";
    public static final String VISTA_NOTE = "/application/vistaNote.fxml";
    public static final String VISTA_HOURS_WORKED = "/application/vistaHoursWorked.fxml";
    public static final String VISTA_REPORT_GENERATOR = "/application/vistaReportGenerator.fxml";
    public static final String VISTA_BACKUPS = "/application/vistaBackups.fxml";

    /**
     * Loads the vista specified by the fxml file into the
     * vistaHolder pane of the main application layout.
     *      *
     * Previously loaded vista for the same fxml file are not cached.
     * The fxml is loaded anew and a new vista node hierarchy generated
     * every time this method is invoked.
     *
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example:
     *   cache FXMLLoaders
     *   cache loaded vista nodes, so they can be recalled or reused
     *   allow a user to specify vista node reuse or new creation
     *   allow back and forward history like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public static void loadVista(String fxml, VistaContainer vc) {
        try {
            FXMLLoader loader = new FXMLLoader(VistaNavigator.class.getResource(fxml));
            vc.setVista( loader.load() );

            VistaContainable child = loader.getController();
            child.init(vc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}