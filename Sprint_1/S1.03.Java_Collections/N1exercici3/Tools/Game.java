package Tools;

import java.io.*;
import java.util.*;

public class Game {
    private static Map<String, String> countryCapital = new HashMap<String, String>();
    private static Map<String, Integer> scorePlayers = new HashMap<String, Integer>();
    private static int score = 0;
    private static String player = "";
    static Scanner sc = new Scanner(System.in);
    private static final String path = "C:\\egranero_java\\S103\\N1exercici3\\src\\countries.txt";
    private static final String pathScore = "C:\\egranero_java\\S103\\N1exercici3\\src\\classificacio.txt";

    public static void initialMapList(){
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    countryCapital.put(parts[0], parts[1]);
                } else {
                    //ignoramos las lineas en blanco o que no cumplan.
                }
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error: El archivo no existe o la ruta es incorrecta.");
        }

    }

    public static void randomQuestion(int numQuestion) {
        String answer = "";
        Random random = new Random();
        int numRand = random.nextInt(countryCapital.size());
        Object country = countryCapital.keySet().toArray()[numRand];
        String city = countryCapital.get(country);
        System.out.println(numQuestion + ". Cual es la capital de " + country + "?");
        answer = sc.nextLine();
        if(city.equalsIgnoreCase(answer)){
            System.out.println("Correcto! La capital de " + country + " es " + city);
            score+= 1;
        } else {
            System.out.println("Error! La capital de " + country + " es " + city);
        }
    }

    public static void startGame (){
        initialMapList();
        System.out.println("Bienvenido al juego de las capitales\n" +
                "Introduce tu nombre:");
        player = sc.nextLine();
        System.out.println("Se te realizaran 10 preguntas, si aciertas sumaras un punto. En caso contrario no sumaras nada.\n");
        for (int i = 0; i < 10; i++) {
            randomQuestion(i+1);
        }
        checkScore();
    }

    public static void saveScore(){
        try {
            File scoreFile = new File(pathScore);
            if(scoreFile.exists()){
                scoreFile.delete();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathScore));
            bw.write("Jugador-Puntuacion");
            if (scorePlayers.size() > 0) {
                String line;
                for (String key : scorePlayers.keySet()) {
                    bw.write("\n" + key + " " + scorePlayers.get(key));
                }
            } else {
                bw.write("\n" + player + " " + score);
            }
            bw.close();
        }catch (IOException e){
            System.out.println("Error: no se ha podido crear o modificar el archivo classificacio.txt");
        }catch (NullPointerException e){
            System.out.println("Error: el path es incorrecto");
        }
    }

    public static void checkScore(){
        boolean flag = false;
        try {
            String mensaje = "";
            File file = new File(pathScore);
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(pathScore));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    scorePlayers.put(parts[0], Integer.valueOf(parts[1]));
                } else {
                    //ignoramos las lineas en blanco o que no cumplan.
                }
            }
            for(String key : scorePlayers.keySet()){
                if(key.equalsIgnoreCase(player)) {
                    if (scorePlayers.get(key) > score) {
                        mensaje = "Tu puntuación maxima es " + scorePlayers.get(key) + " y ahora has sacado " + score;
                    } else if (scorePlayers.get(key) < score) {
                        mensaje = "Lo has logrado, has superado tu puntuacion de " + scorePlayers.get(key) + ". Tu nuevo record es " + score;
                        scorePlayers.put(key, score);
                    } else if (scorePlayers.get(key) == score){
                        mensaje = "Has igualado tu puntuación. Has conseguido " + score;
                    }
                    flag = true;
                }
            }
            if(!flag){
                mensaje = "Has logrado un nuevo record de " + score;
                scorePlayers.put(player,score);
            }
            System.out.println(mensaje);
            reader.close();
            saveScore();
        } catch (IOException e){
            System.out.println("Error: El archivo no existe o la ruta es incorrecta.");
        }
    }
}
