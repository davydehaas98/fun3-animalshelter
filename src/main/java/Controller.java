import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button btnAddAnimal;
    public Button btnReserve;
    public RadioButton rbFemale;
    public RadioButton rbMale;
    public TextField tbBadHabits;
    public ListView lstAnimals;
    public TextField tbReserveAnimalName;
    public TextField tbName;
    public ComboBox cmbSpecies;
    private Reservation reservations = new Reservation();

    @Override
    public void initialize(URL location, ResourceBundle resources){
        cmbSpecies.setItems(FXCollections.observableArrayList("Cat", "Dog"));
        cmbSpecies.getSelectionModel().select(0);
    }

    public void addAnimal(ActionEvent actionEvent) {
        Gender gender = rbMale.isSelected()? Gender.Male : Gender.Female;
        if (cmbSpecies.getValue().toString() == "Cat"){
            reservations.NewCat(tbName.getText(), gender, tbBadHabits.getText());
        }else if(cmbSpecies.getValue().toString() == "Dog"){
            reservations.NewDog(tbName.getText(),gender);
        }
        refreshList();
    }

    public void reserveAnimal(ActionEvent actionEvent) {
        Animal a = (Animal)lstAnimals.getSelectionModel().getSelectedItem();
        if(a != null){
            a.Reserve(tbReserveAnimalName.getText());
            refreshList();
        }
    }
    private void refreshList() {
        lstAnimals.getItems().clear();
        for (Animal animal:reservations.getAnimals()) {
            lstAnimals.getItems().add(animal);
        }
        btnReserve.setDisable(lstAnimals.getSelectionModel().getSelectedItem() == null);
    }

    public void selectSpecies(ActionEvent actionEvent) {
        tbBadHabits.setDisable(cmbSpecies.getValue().toString() == "Dog");

    }

    public void selectAnimal(MouseEvent mouseEvent) {
        btnReserve.setDisable(lstAnimals.getSelectionModel().getSelectedItem() == null);
    }
}
