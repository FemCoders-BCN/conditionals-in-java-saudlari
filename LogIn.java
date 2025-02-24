import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String userName = "Avatar";
        int keyPass = 12345;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre de usuarie: "); 
        String nameInput = scanner.nextLine();
        
        System.out.print("Ingrese su contraseña: "); 
        int keyInput = scanner.nextInt();

     
        if (userName.equals(nameInput) && keyPass == keyInput){
            System.out.print("Acceso concedido.");
        } else {
            System.out.print("Nombre de usuario o contraseña incorrecta.");
        }

        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.


        scanner.close();
    }
}
