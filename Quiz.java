import java.util.Scanner;


public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        int score = 0;

        System.out.println("1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware? \n a. Ada Lovelace \n b. Jude Milhon \n c. Martha Ackelsberg \n d. Jane Jacobs");
        String optionInput1 = scanner.nextLine().toLowerCase();
      
        if (optionInput1.equals("b")){
            score +=5;
            System.out.print("Tu respuesta fue: " + optionInput1 + ". Respuesta correcta. Ganaste 5 puntos.");  
            scanner.nextLine();   
        } else {
            System.out.print("Fail. Intenta la próxima. No puntuas");
        }

        System.out.println("2. ¿Quién es Fuencisla Clemares? \n a. La directora general de IBM Europa, Oriente Medio y África \n b. La vicepresidenta de Microsoft Western Europe \n c. La directora general de Google en España y Portugal \n d. Fundadora y CEO de Marsi Bionics");
        String optionInput2 = scanner.nextLine().toLowerCase();
        if (optionInput2.equals("c")){
            score +=5;
            System.out.print("Tu respuesta fue: " + optionInput2 + ". Respuesta correcta. Ganaste 5 puntos.");  
            scanner.nextLine();        
         } else {
            System.out.print("Fail. Intenta la próxima. No puntuas");
        }
        
        System.out.println("3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr? \n a. Primera programadora de software \n b. Una actriz de cine \n c. Inventora del procesador de datos \n d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        String optionInput3 = scanner.nextLine().toLowerCase();
        if (optionInput3.equals("c") || optionInput3.equals("d")){
            score +=5;
            System.out.print("Tu respuesta fue: " + optionInput2 + ". Respuesta correcta. Ganaste 5 puntos.");  
            scanner.nextLine();        
         } else {
            System.out.print("Fail. Intenta la próxima. No puntuas");
        }

        System.out.println("4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito? \n a. Katherine Johnson, Dorothy Vaughan y Mary Jackson \n b. Jessica Miller, Emily Johnson, Sarah Davis \n c. bell hooks, Toni Morrison y Alice Walker \n d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
        String optionInput4 = scanner.nextLine().toLowerCase();
        if (optionInput4.equals("a")){
            score +=5;
            System.out.print("Tu respuesta fue: " + optionInput4 + ". Respuesta correcta. Ganaste 5 puntos.");  
            scanner.nextLine();        
        } else {
            System.out.print("Fail. Intenta la próxima. No puntuas");
            scanner.nextLine();
        }
        scanner.close();
      

        if (score >= 15){
            System.out.println("Tú si que sabes mucho");
        } else if ( score >= 5 && score < 15){
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buena suerte la próxima vez");
        }
    }

    }
    

        //Escribe un programa que sea un pequeño +juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a
