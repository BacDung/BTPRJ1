package giaodien;

import java.io.IOException;
import baitaptuan7.*;
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

public class ControllerTuan4 extends Application {
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
	private Button Show13;
	@FXML
	private Button Show14;
	@FXML
	private Button Show15;
	@FXML
	private Button Show16;
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
		lb1.setText(Debai.Debai4[0]);
		Bai1.main(null);
	}
	@FXML
	public void Showex2(ActionEvent e) {
		lb1.setText(Debai.Debai4[1]);
		Bai2.main(null);
	}
	@FXML
	public void Showex3(ActionEvent e) {
		lb1.setText(Debai.Debai4[2]);
		Bai3.main(null);
	}
	@FXML
	public void Showex4(ActionEvent e) {
		lb1.setText(Debai.Debai4[3]);
		Bai4.main(null);
	}
	@FXML
	public void Showex5(ActionEvent e) {
		lb1.setText(Debai.Debai4[4]);
		Bai5.main(null);
	}
	@FXML
	public void Showex6(ActionEvent e) {
		lb1.setText(Debai.Debai4[5]);
		Bai6.main(null);
	}
	@FXML
	public void Showex7(ActionEvent e) {
		lb1.setText(Debai.Debai4[6]);
		Bai7.main(null);
	}
	@FXML
	public void Showex8(ActionEvent e) {
		lb1.setText(Debai.Debai4[7]);
		Bai8.main(null);
	}
	@FXML
	public void Showex9(ActionEvent e) {
		lb1.setText(Debai.Debai4[8]);
		Bai9.main(null);
	}
	@FXML
	public void Showex10(ActionEvent e) {
		lb1.setText(Debai.Debai4[9]);
		Bai10.main(null);
	}
	@FXML
	public void Showex11(ActionEvent e) {
		lb1.setText(Debai.Debai4[10]);
		Bai11.main(null);
	}
	@FXML
	public void Showex12(ActionEvent e) {
		lb1.setText(Debai.Debai4[11]);
		Bai12.main(null);
	}
	@FXML
	public void Showex13(ActionEvent e) {
		lb1.setText(Debai.Debai4[12]);
		Bai13.main(null);
	}
	@FXML
	public void Showex14(ActionEvent e) {
		lb1.setText(Debai.Debai4[13]);
		Bai14.main(null);
	}
	@FXML
	public void Showex15(ActionEvent e) {
		lb1.setText(Debai.Debai4[14]);
		Bai15.main(null);
	}
	@FXML
	public void Showex16(ActionEvent e) {
		lb1.setText(Debai.Debai4[15]);
		Bai16.main(null);
	}

	@Override
	public void start(Stage primaryStage) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
