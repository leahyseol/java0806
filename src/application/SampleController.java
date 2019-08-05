package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	private TextField tfId;
	
	@FXML
	private TextField tfPw;
	
	public void onLoginCliked() {
		String id = tfId.getText();
		String pw = tfPw.getText();
		System.out.println("push login button");
		System.out.println(id + " : " + pw);
	}
	
	
	public void onCancelClicked(ActionEvent event) {
		System.out.println("push cancel");
	}
	
}
