package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String user;
        String pass;
        String email;

        boolean emailCorrecto;
        boolean nombreCorrecto = false;

        System.out.println("----------Crear cuenta----------");
        System.out.println("--------------------------------\n");

        System.out.println("Ingrese su nombre de usuario\n-Debe contener un mínimo de 6 caracteres y un máximo de 12");
        do {
            user = (read.readLine());
            if (user.length() < 6) {
                System.out.println("El nombre debe contener al menos 6 carácteres.\nIntente de nuevo");
            } else if (user.length() > 12) {
                System.out.println("El nombre de usuario no puede contener más de 12 carácteres\nIntente de nuevo");
            } else nombreCorrecto = true;
        } while (!nombreCorrecto);



        System.out.println("Ingrese su contraseña");
        pass = read.readLine();



        System.out.println("Introduce un email");
        do {
            if () {

            }
            email = read.readLine();
            emailCorrecto = email.matches("[-\\w\\.]+@\\w+\\.\\w+");
        } while (!emailCorrecto);

        System.out.println("Se le envió un código de verificación a " + email);
    }
}