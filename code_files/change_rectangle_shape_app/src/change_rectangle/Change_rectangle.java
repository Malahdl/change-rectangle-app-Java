/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change_rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author malah
 */
public class Change_rectangle extends Application implements Initializable {

    @FXML
    private TextField w;
    @FXML
    private TextField h;
    @FXML
    private ComboBox<String> clrs;
    @FXML
    private CheckBox stroke;
    @FXML
    private RadioButton one;
    @FXML
    private ToggleGroup group;
    @FXML
    private RadioButton two;
    @FXML
    private RadioButton three;
    @FXML
    private Rectangle rec;
    
    private ObservableList<String> colorList = FXCollections.observableArrayList("Red", "Green", "Blue","Black");
    @FXML
    private Pane panel;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Change_rectangle.class.getResource("FXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 778, 381);
        
        primaryStage.setTitle("Chang Rectangle Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        panel.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        clrs.setValue("Red");
        clrs.setItems(colorList);
    }

    @FXML
    private void onWidth(KeyEvent event) 
    {
        if (event.getCode().equals(KeyCode.ENTER))
        {
            rec.setWidth(Integer.parseInt(w.getText()));
        }
        
    }

    @FXML
    private void onHight(KeyEvent event) 
    {
        if (event.getCode().equals(KeyCode.ENTER))
        {
            rec.setHeight(Integer.parseInt(h.getText()));
        }
    }

    @FXML
    private void onSelect(ActionEvent event) 
    {
        if(clrs.getValue() == "Red")
        {
            rec.setFill(Color.RED);
        }
        else if(clrs.getValue() == "Green")
        {
            rec.setFill(Color.GREEN);
        }
        else if(clrs.getValue() == "Blue")
        {
            rec.setFill(Color.BLUE);
        }
        else if(clrs.getValue() == "Black")
        {
            rec.setFill(Color.BLACK);
        }
    }

    @FXML
    private void onCheck(ActionEvent event) 
    {
        if(stroke.isSelected())
        {
            rec.setStroke(Color.BLACK);
        }
        else
        {
            rec.setStrokeWidth(0);
        }
        
    }

    @FXML
    private void onOne(ActionEvent event) 
    {
        if(stroke.isSelected())
        {
            rec.setStrokeWidth(1);
        }
    }

    @FXML
    private void onTwo(ActionEvent event)
    {
        if(stroke.isSelected())
        {
            rec.setStrokeWidth(2);
        }
    }

    @FXML
    private void onThree(ActionEvent event) 
    {
        if(stroke.isSelected())
        {
            rec.setStrokeWidth(3);
        }
    }

    @FXML
    private void onMouseClick(MouseEvent event) 
    {
        if(event.getButton().equals(MouseButton.PRIMARY))
        {
            int wd = (int)rec.getWidth();
            rec.setWidth(wd += 5);
        }
        else if(event.getButton().equals(MouseButton.SECONDARY))
        {
            int ht = (int)rec.getHeight();
            rec.setHeight(ht += 5);
        }
    }
    
    
}
