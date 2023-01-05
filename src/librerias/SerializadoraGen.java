package librerias;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class SerializadoraGen{
    
    public static void serializar ( String sNombreArchivo, 
                                ArrayList  arreglo ) {
        try {
            ObjectOutputStream escritor = 
              new  ObjectOutputStream (
                    new FileOutputStream (sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ArrayList deserializar (
                            String sNombreArchivo) {
        ArrayList  retorno; 
        try{
            ObjectInputStream lector = 
                new ObjectInputStream(
                     new FileInputStream(sNombreArchivo)); 
            retorno = (ArrayList) lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return retorno;    
    }
}
