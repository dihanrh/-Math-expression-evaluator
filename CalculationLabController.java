package lab;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dihan
 */
public class CalculationLabController implements Initializable {

    @FXML
    private Button Evaluate;
    @FXML
    private Label EnterString;
    @FXML
    private TextField InputField;
    @FXML
    private Label Result;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Evalution(ActionEvent event) throws Exception {
        double ans = 0;
        String s = InputField.getText();
        FormulME f = new FormulME();

        try {
            if (s.equals("ID") || s.equals("Id") || s.equals("id")) {
                Result.setText("ID  : 20203038");
            } else {
                ans = f.evaluate(s);
                Result.setText("Result : " + ans);
            }
        } catch (Exception e) {
            Result.setText("Result : Error/Invalid Type\nTry i.e. (2+3/5). \nError Type: " + e);
        }
    }

}
