import java.util.Scanner;


public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
        System.out.print("Cual es la temperatura (en celcius) en tu ciudad? ");
        int temperature = scanner.nextInt();

        //Si es bajo 0: Te estás congelando
        if (temperature<0){
            System.out.print("Te estás congelando");
       
        //Si es entre 0 y 10: Hace mucho frío 
        } else if (temperature>= 0 && temperature <= 10) {
            System.out.print("Hace mucho frio");

        //Si es entre 11 y 17: Con un abrigo estás bien
        } else if (temperature> 10 && temperature<=17) {
            System.out.print("Con un abrigo estás bien");

        //Si es entre 18 y 25: Parece que ha llegado el verano
        } else if (temperature >17 && temperature<=26){
            System.out.print("Parece que ha llegado el verano");

        //Si es entre 26 y 35: Que calooorrrrr
         } else if (temperature >26 && temperature<=35){
            System.out.print(" Que calooorrrrr");
        //Si es mayor a 36: Ahí no hay quien viva  
         } else if (temperature > 26){
            System.out.print("Ahí no hay quien viva ");
         }

        scanner.close();
        //Imprime el resultado
    }
}