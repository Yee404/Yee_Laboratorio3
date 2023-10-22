// Librerias
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inicio {

    public static void main(String[] args) {
        String csvFilePath = "Inventario.csv";
        
        // Objeto BufferedReader para leer archivo 'csv'; crear arraylist para almacenar datos leídos.
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            List<String[]> allData = new ArrayList<>();

            //Lee las líneas.
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); 
                allData.add(values);
            }
            //Tabular datos para imprimir.
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
          //Rastrear excepciones del try.
        } catch (IOException e) {
            e.printStackTrace();
        }

        //hasta ahí logré :v
    }
}