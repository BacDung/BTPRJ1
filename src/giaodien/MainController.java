package giaodien;

import java.io.IOException;

import baitaptuan5.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController extends Application {
	@FXML
	private Button Tuan2;
	private Parent parent;
	@FXML
	private Button Tuan1;
//	@FXML
//	private Button Back;
//	@FXML
//	private Button Quit;
	@FXML
	private Label lb1;
	@FXML
	private Label lb2;
//	@FXML
//	private Label lb3;
//	@FXML
//	private Label lb4;
//	@FXML
//	private Label lb5;
//	@FXML
//	private Label lb6;
//	@FXML
//	private Label lb7;
//	@FXML
//	private Label lb8;
//	@FXML
//	private Label lb9;
//	@FXML
//	private Label lb10;
	
	
	public void Scene(ActionEvent e) {	
		Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Tuan1.fxml"));
		try {
			parent = loader.load();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		Scene scene = new Scene(parent);
		stage.setScene(scene);
	}
	
	
//	@FXML
//	public void Showex1(ActionEvent e) {
//		lb1.setText(Debai.Debai1[0]);
//		Bai1.main(null);
//	}
//	public void Showex2(ActionEvent e) {
//		lb2.setText("qadfasdf");
//	}
//	@FXML
//	public void Showex2(ActionEvent e) {
//		lb2.setText(Debai.Debai1[1]);
//		Bai2.main(null);
//	}
//	@FXML
//	public void Showex3(ActionEvent e) {
//		lb3.setText(Debai.Debai1[2]);
//		Bai3.main(null);
//	}
//	@FXML
//	public void Showex4(ActionEvent e) {
//		lb4.setText(Debai.Debai1[3]);
//		Bai4.main(null);
//	}
//	@FXML
//	public void Showex5(ActionEvent e) {
//		lb5.setText(Debai.Debai1[4]);
//		Bai5.main(null);
//	}
//	@FXML
//	public void Showex6(ActionEvent e) {
//		lb6.setText(Debai.Debai1[5]);
//		Bai6.main(null);
//	}
//	@FXML
//	public void Showex7(ActionEvent e) {
//		lb7.setText(Debai.Debai1[6]);
//		Bai7.main(null);
//	}
//	@FXML
//	public void Showex8(ActionEvent e) {
//		lb8.setText(Debai.Debai1[7]);
//		Bai8.main(null);
//	}
//	@FXML
//	public void Back(ActionEvent e) {
//		Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//		FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(getClass().getResource("Application.fxml"));
//		try {
//			parent = loader.load();
//		}
//		catch(IOException e1) {
//			e1.printStackTrace();
//		}
//		Scene scene = new Scene(parent);
//		stage.setScene(scene);
//	}
//	@FXML 
//	public void Quit(ActionEvent e) {
//		Platform.exit();
//	}
	
	@Override
	public void start(Stage primaryStage) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
