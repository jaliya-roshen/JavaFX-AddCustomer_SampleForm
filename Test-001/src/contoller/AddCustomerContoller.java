package contoller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class AddCustomerContoller {

    @FXML
    private JFXTextField txtCustomerID;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    void saveCustomerClick(ActionEvent event) {

        System.out.println("Save Customer OK");

    }


}
