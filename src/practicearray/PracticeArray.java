package practicearray;

import java.util.Random;

/**
 *
 * @author Ruben
 */
public class PracticeArray {

    public static void main(String[] args) {
        int x = 12, y = 9;
        int[][] numerosAleatorios = new int[x][y];
        Random r = new Random();
        int p = 0;
        String numeroString;
        //Cargando Array como si se tratara de un plano de coordenadas X Y 
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                p = r.nextInt(51);//numeros aleatorios desde el 0 a 50
                if (j == 8 & i == 3) {//En la posicicion de memoria [8][3]
                    numerosAleatorios[j][i] = 99;
                } else {
                    numerosAleatorios[j][i] = p;
                }
            }
        }
        
        System.out.println("La forma en que se lee el Array con ForE:");
        for (int[] numerosAleatorio : numerosAleatorios) {

            for (int numeroAleatorio : numerosAleatorio) {

                numeroString = Integer.toString(numeroAleatorio);
                if (numeroAleatorio < 10) {
                    numeroString = "0" + numeroString;
                }
                System.out.print(numeroString + " ");
            }
            System.out.println("");
        }
        
        /*El mismo resultado que con el ForE.
        System.out.println("");
        System.out.println("El mismo resultado que con el ForE");
        for (int n = 0; n < numerosAleatorios.length; n++) //Filas
        {
            for (int i = 0; i < numerosAleatorios[n].length; i++) //Columnas
            {
                numeroString = Integer.toString(numerosAleatorios[n][i]);
                if (numerosAleatorios[n][i] < 10) {
                    numeroString = "0" + numeroString;
                }
                System.out.print(numeroString + " ");
            }
            System.out.println("");
        }*/
        
        
        
        System.out.println("");
        //Tabla invertida
        System.out.println("La forma en la que se cargo el Array:");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                numeroString = Integer.toString(numerosAleatorios[j][i]);
                if (numerosAleatorios[j][i] < 10) {
                    numeroString = "0" + numeroString;
                }
                System.out.print(numeroString + " ");
            }
            System.out.println("");
        }
        
        

        
    }
}
