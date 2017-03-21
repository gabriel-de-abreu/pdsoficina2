/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeplayer;

import codeplayer.FXML.PlayerController;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Gabriel
 */
public final class ControleUI{

   private ControleUI(){};

   private static ControleUI INSTANCE = null;

   public static ControleUI getInstance(){
      return((INSTANCE == null)?INSTANCE = new ControleUI():INSTANCE);
   }

   public void start(Stage primaryStage) throws Exception {//Chama a parimeira tela
      mainStage = primaryStage;
      initUI();
   }

   private static Parent playerFXML; //Classes parent para manipulação do Fxml
   private static Parent equalizerFXML;

   private static Scene playerScene;
   private static Scene equalizerScene;
   
   private static Stage mainStage;
   private static Stage secondStage;
   public PlayerController playControl;
   public PlayerController getPlayerController(){
       return playControl;
   }
   
   public Stage getSecondStage(){
       return secondStage;
   }


   private void initUI(){ //Metódo inicializador
      mainStage.centerOnScreen();
      mainStage.setTitle("CodePlayer 2017");
      secondStage= new Stage();
      
      mainStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }

        });
      try {
          FXMLLoader loader=new FXMLLoader();
          loader.setLocation(getClass().getResource("FXML/Player.fxml"));
          playerFXML = (Parent)loader.load(); //Carrega o arquivo FXML na classe pai
          playControl=loader.getController();

      } catch (IOException ex) {
         //fazer algo para mostrar erro
         System.out.println("Erro" + ex);
      }
        playerScene = new Scene(playerFXML); //Transforma a classe parent em um objeto do tipo Scene
       
      mostraPlayer();
   }

   public void mostraPlayer(){ //Método para chamar o login
      mainStage.setScene(playerScene);
      mainStage.show();
   }
   public void mostraEqualizer(){
       try{
        equalizerFXML=FXMLLoader.load(getClass().getResource("FXML/Equalizer.fxml"));
        equalizerScene=new Scene(equalizerFXML);
       }
       catch(Exception e){
           
       }
      secondStage.setScene(equalizerScene);
      secondStage.show();
   }
   
}