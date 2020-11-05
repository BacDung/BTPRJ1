package giaodien;

import java.io.IOException;

import baitaptuan5.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerTuan2 extends Application {
	private Parent parent;
	@FXML
	private Button Back;
	@FXML
	private Button Show1;
	@FXML
	private Button Show2;
	@FXML
	private Button Show3;
	@FXML
	private Button Show4;
	@FXML
	private Label lb1;
	
	
	@FXML
	public void Back(ActionEvent e) {
		Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("AppController.fxml"));
		try {
			parent = loader.load();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		Scene scene = new Scene(parent);
		stage.setScene(scene);
	}
	@FXML
	public void Showex1(ActionEvent e) {
		lb1.setText(Debai.Debai2[0]);
		Bai13.main(null);
	}
	@FXML
	public void Showex2(ActionEvent e) {
		lb1.setText(Debai.Debai2[1]);
		Bai14.main(null);
	}
	@FXML
	public void Showex3(ActionEvent e) {
		lb1.setText(Debai.Debai2[2]);
		Bai15.main(null);
	}
	@FXML
	public void Showex4(ActionEvent e) {
		lb1.setText(Debai.Debai2[3]);
		Bai16.main(null);
	}

	@Override
	public void start(Stage primaryStage) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
