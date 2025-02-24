public class TrafficLights {
    public static void main(String[] args) {

        String traffic = "green";

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        switch (traffic) {
           
        //Si es verde imprime en la terminal: Puedes seguir
        case "green":
        System.out.println("Puedes seguir");
            break;
       
        //Si es amarillo imprime en la terminal: Ten cuidado
        case "yellow":
        System.out.println("Ten cuidado");
            break;

       
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        case "red":
        System.out.println("¡¡¡Para!!!");
            break;
            
        //Si es otro color imprime en la terminal: El semáforo está dañado
        default:
        System.out.println("El semáforo está dañado");
            break;
    }

        //Cambia el valor de la variable, corre el programa y mira el resultado 

    }
    
}
