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
import javafx.stage.Stage;
import javafx.scene.control.Label;
public class ControllerTuan1 extends Application {
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
	private Button Show5;
	@FXML
	private Button Show6;
	@FXML
	private Button Show7;
	@FXML
	private Button Show8;
	@FXML
	private Button Show9;
	@FXML
	private Button Show10;
	@FXML
	private Button Show11;
	@FXML
	private Button Show12;
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
		lb1.setText(Debai.Debai1[0]);
		Bai1.main(null);
	}
	@FXML
	public void Showex2(ActionEvent e) {
		lb1.setText(Debai.Debai1[1]);
		Bai2.main(null);
	}
	@FXML
	public void Showex3(ActionEvent e) {
		lb1.setText(Debai.Debai1[2]);
		Bai3.main(null);
	}
	@FXML
	public void Showex4(ActionEvent e) {
		lb1.setText(Debai.Debai1[3]);
		Bai4.main(null);
	}
	@FXML
	public void Showex5(ActionEvent e) {
		lb1.setText(Debai.Debai1[4]);
		Bai5.main(null);
	}
	@FXML
	public void Showex6(ActionEvent e) {
		lb1.setText(Debai.Debai1[5]);
		Bai6.main(null);
	}
	@FXML
	public void Showex7(ActionEvent e) {
		lb1.setText(Debai.Debai1[6]);
		Bai7.main(null);
	}
	@FXML
	public void Showex8(ActionEvent e) {
		lb1.setText(Debai.Debai1[7]);
		Bai8.main(null);
	}
	@FXML
	public void Showex9(ActionEvent e) {
		lb1.setText(Debai.Debai1[8]);
		Bai9.main(null);
	}
	@FXML
	public void Showex10(ActionEvent e) {
		lb1.setText(Debai.Debai1[9]);
		Bai10.main(null);
	}
	@FXML
	public void Showex11(ActionEvent e) {
		lb1.setText(Debai.Debai1[10]);
		Bai11.main(null);
	}
	@FXML
	public void Showex12(ActionEvent e) {
		lb1.setText(Debai.Debai1[11]);
		Bai12.main(null);
	}

	@Override
	public void start(Stage primaryStage) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
