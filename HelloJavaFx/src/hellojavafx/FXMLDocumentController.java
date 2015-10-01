/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class FXMLDocumentController implements Initializable {
  
  @FXML
  private Label label;
    @FXML
    private Button button;
    @FXML
    private Button saveButton;
    @FXML
    private Label This_is_a_Lable;
  
  @FXML
  private void handleButtonAction(ActionEvent event) {
    System.out.println("You clicked me!");
    label.setText("Hello World!");
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

    @FXML
    private void handleSaveButton(ActionEvent event) {.
        System.out.println("save Button was hit!"+ event.toString());

    }
    
  
}
