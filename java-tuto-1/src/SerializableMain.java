//Packages à importer afin d'utiliser l'objet File
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import my.library.SerializableGame;

public class SerializableMain {
  public static void main(String[] args) {
    //Nous déclarons nos objets en dehors du bloc try/catch
    ObjectInputStream ois;
    ObjectOutputStream oos;
    try {
      oos = new ObjectOutputStream(
              new BufferedOutputStream(
                new FileOutputStream(
                  new File("tmp/game.data"))));
        	
      //Nous allons écrire chaque objet Game dans le fichier
      oos.writeObject(new SerializableGame("Assassin Creed", "Aventure", 45.69));
      oos.writeObject(new SerializableGame("Tomb Raider", "Plateforme", 23.45));
      oos.writeObject(new SerializableGame("Tetris", "Stratégie", 2.50));
      //Ne pas oublier de fermer le flux !
      oos.close();
        	
      //On récupère maintenant les données !
      ois = new ObjectInputStream(
              new BufferedInputStream(
                new FileInputStream(
                  new File("tmp/game.data"))));
            
      try {
        System.out.println("Affichage des jeux :");
        System.out.println("*************************\n");
        System.out.println(((SerializableGame)ois.readObject()).toString());
        System.out.println(((SerializableGame)ois.readObject()).toString());
        System.out.println(((SerializableGame)ois.readObject()).toString());
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
	
      ois.close();
        	
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }     	
  }
}