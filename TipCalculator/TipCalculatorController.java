import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {
	    @FXML
	    private TextField amountTextField;

	    @FXML
	    private TextField percentageTextField;

	    @FXML
	    private Label tipLabel;

	    @FXML
	    private void calculateTip() {
	        double amount = Double.parseDouble(amountTextField.getText());
	        double percentage = Double.parseDouble(percentageTextField.getText());
	        double tip = TipCalculator.calculateTip(amount, percentage);
	        tipLabel.setText(String.format("Tip: $%.2f", tip));
	    }
	}
