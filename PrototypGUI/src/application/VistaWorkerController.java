package application;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;

/**
 * Controller class for the first vista.
 */
public class VistaWorkerController implements VistaContainable{
    private VistaContainer parent;

    @Override
    public void init(VistaContainer parent){
        this.parent = parent;
        selectMenu();

        ObservableList<String> ols = FXCollections.observableArrayList();
        lvContestants.setItems(ols);
    }

    @FXML
    private ListView<String> lvContestants;
    @FXML
    private ListView<String> lvTeams;
    @FXML
    private ListView<String> lvEvents;
    @FXML
    private ListView<String> lvMatches;
    @FXML
    private ListView<String> lvArenas;
    @FXML
    private ListView<String> lvNotes;
    @FXML
    private TabPane tbpane;
    @FXML
    private TitledPane contestantsPane;
    @FXML
    private TitledPane teamsPane;
    @FXML
    private TitledPane eventsPane;
    @FXML
    private TitledPane matchesPane;
    @FXML
    private TitledPane arenasPane;
    @FXML
    private TitledPane usersPane;

    TabController newTab(String tabTitle){
        TabController tabCtrl = new TabController(tabTitle);
        tbpane.getTabs().add(tabCtrl.getTab());
        return tabCtrl;
    }

    private void selectMenu(){
        contestantsPane.expandedProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(contestantsPane.isExpanded()){
                    ObservableList<String> ols = FXCollections.observableArrayList();
                    ols.add("** Dodaj **");
                    ols.add("Woda gazowana 0.5l");
                    ols.add("CocaCola 0.5l");
                    lvContestants.setItems(ols);
                }else {
                    lvContestants.getSelectionModel().clearSelection();
                }
            }
        });

        lvContestants.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String s = lvContestants.getSelectionModel().getSelectedItem();

                VistaEntryViewerController entryViewer = new VistaEntryViewerController(newTab("Produkt - " + s), "Contestant");
                entryViewer.addEntry("Id", "1" );
                entryViewer.addEntry("Nazwa", s );
                entryViewer.addEntry("Cena", "2zł" );
                entryViewer.addEntry("Na stanie", "50" );
                entryViewer.addEntry("Sprzedanych dzisiaj", "5" );
                entryViewer.addEntry("Informacje dodatkowe", "Wysoko nasycona CO2" );
            }
        });

        teamsPane.expandedProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(teamsPane.isExpanded()){
                    ObservableList<String> ols = FXCollections.observableArrayList();
                    ols.add("** Dodaj **");
                    lvTeams.setItems(ols);
                }else {
                    lvTeams.getSelectionModel().clearSelection();
                }
            }
        });

        lvTeams.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String s = lvTeams.getSelectionModel().getSelectedItem();
                if(s==null)
                    return;
                //TODO
            }
        });

        eventsPane.expandedProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(eventsPane.isExpanded()){
                    ObservableList<String> ols = FXCollections.observableArrayList();
                    ols.add("** Dodaj **");
                    lvEvents.setItems(ols);
                }else {
                    lvEvents.getSelectionModel().clearSelection();
                }
            }
        });

        lvEvents.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String s = lvEvents.getSelectionModel().getSelectedItem();
                if(s==null)
                    return;
                //TODO
            }
        });

        matchesPane.expandedProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(matchesPane.isExpanded()){
                    ObservableList<String> ols = FXCollections.observableArrayList();
                    ols.add("** Dodaj **");
                    lvMatches.setItems(ols);
                }else {
                    lvMatches.getSelectionModel().clearSelection();
                }
            }
        });

        lvMatches.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String s = lvMatches.getSelectionModel().getSelectedItem();
                if(s==null)
                    return;
                //TODO
            }
        });

        arenasPane.expandedProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(arenasPane.isExpanded()){
                    ObservableList<String> ols = FXCollections.observableArrayList();
                    ols.add("** Dodaj **");
                    lvArenas.setItems(ols);
                }else {
                    lvArenas.getSelectionModel().clearSelection();
                }
            }
        });

        lvArenas.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String s = lvArenas.getSelectionModel().getSelectedItem();
                if(s==null)
                    return;
                //TODO
            }
        });

        usersPane.expandedProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(usersPane.isExpanded()){
                    ObservableList<String> ols = FXCollections.observableArrayList();
                    ols.add("** Dodaj **");
                    lvNotes.setItems(ols);
                }else {
                    lvNotes.getSelectionModel().clearSelection();
                }
            }
        });

        lvNotes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                String s = lvNotes.getSelectionModel().getSelectedItem();
                if(s==null)
                    return;

                if(s.equals("** Dodaj **")){
                    new VistaNoteController(newTab("Nowa notatka"));
                }
            }
        });
    }
}