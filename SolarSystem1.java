/** Demos RadioButtons */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class SolarSystem1 extends Application {
   public static void main(String[] args) {
      launch(args);
   }
   @Override
   public void start(Stage primaryStage){
      //create 2 image objects
      Image sunImage = new Image("file:sun.jpg");
      Image mercuryImage = new Image("file:mercury.jpg");
      Image venusImage = new Image("file:venus.jpg");
      Image earthImage = new Image("file:earth.jpg");
      Image marsImage = new Image("file:mars.jpg");
      Image jupiterImage = new Image("file:jupiter.jpg");
      Image saturnImage = new Image("file:saturn.jpg");
      Image uranusImage = new Image("file:uranus.jpg");
      Image neptuneImage = new Image("file:neptune.jpg");
      Image plutoImage = new Image("file:pluto.jpg");
      
      //create ImageView object
      ImageView imageView = new ImageView(sunImage);
      
      //resize ImageView, preserving aspect ratio
      imageView.setFitWidth(350);
      imageView.setPreserveRatio(true);
      
      //put ImageView into an HBox
      HBox imageHBox = new HBox(imageView);
      
      //center HBox contents
      imageHBox.setAlignment(Pos.CENTER);
      
      //create RadioButtons
      RadioButton sunRadio = new RadioButton("Sun");
      RadioButton mercuryRadio = new RadioButton("Mercury");
      RadioButton venusRadio = new RadioButton("Venus");
      RadioButton earthRadio = new RadioButton("Earth");
      RadioButton marsRadio = new RadioButton("Mars");
      RadioButton jupiterRadio = new RadioButton("Jupiter");
      RadioButton saturnRadio = new RadioButton("Saturn");
      RadioButton uranusRadio = new RadioButton("Uranus");
      RadioButton neptuneRadio = new RadioButton("Neptune");
      RadioButton plutoRadio = new RadioButton("Pluto");

      //select sunRadio control
      sunRadio.setSelected(true);
      
      //add radio buttons to a toggle group
      ToggleGroup radioGroup = new ToggleGroup();
      sunRadio.setToggleGroup(radioGroup);
      mercuryRadio.setToggleGroup(radioGroup);
      venusRadio.setToggleGroup(radioGroup);
      earthRadio.setToggleGroup(radioGroup);
      marsRadio.setToggleGroup(radioGroup);
      jupiterRadio.setToggleGroup(radioGroup);
      saturnRadio.setToggleGroup(radioGroup);
      uranusRadio.setToggleGroup(radioGroup);
      neptuneRadio.setToggleGroup(radioGroup);
      plutoRadio.setToggleGroup(radioGroup);
      
      //register ActionEvent handler
      sunRadio.setOnAction(event -> {
         imageView.setImage(sunImage);
      });
      //register an event handler
      mercuryRadio.setOnAction(event -> {
         imageView.setImage(mercuryImage);
      });
      //register an event handler
      venusRadio.setOnAction(event -> {
         imageView.setImage(venusImage);
      });
      //register an event handler
      earthRadio.setOnAction(event -> {
         imageView.setImage(earthImage);
      });
      //register an event handler
      marsRadio.setOnAction(event -> {
         imageView.setImage(marsImage);
      });
      //register an event handler
      jupiterRadio.setOnAction(event -> {
         imageView.setImage(jupiterImage);
      });
      //register an event handler
      saturnRadio.setOnAction(event -> {
         imageView.setImage(saturnImage);
      });
      //register an event handler
      uranusRadio.setOnAction(event -> {
         imageView.setImage(uranusImage);
      });
      //register an event handler
      neptuneRadio.setOnAction(event -> {
         imageView.setImage(neptuneImage);
      });
      //register an event handler
      plutoRadio.setOnAction(event -> {
         imageView.setImage(plutoImage);
      });   
      
      //add radio buttons to a VBox
      VBox radioVBox = new VBox(10, sunRadio, mercuryRadio, venusRadio, earthRadio, marsRadio, jupiterRadio, saturnRadio, uranusRadio, neptuneRadio, plutoRadio);
      
      //give radioVBox padding
      radioVBox.setPadding(new Insets(30) );
      
      //add everything to a VBox
      VBox mainVBox = new VBox(10, imageHBox, radioVBox);
      
      //create a scene with HBox as it's root node
      Scene scene = new Scene(mainVBox);
      
      //add scene to the stage
      primaryStage.setScene(scene);
      
      //show window
      primaryStage.show();
   }
}