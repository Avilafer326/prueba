package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String user;
        String pass;
        String verifyPassword;
        String email;

        boolean nombreCorrecto = false;
        boolean contraseñaCorrecto = false;
        boolean emailCorrecto = false;

        System.out.println("----------Crear cuenta----------");
        System.out.println("--------------------------------\n");

        System.out.println("Ingrese su nombre de usuario\n-Debe contener un mínimo de 6 caracteres y un máximo de 12");
        do {
            user = (read.readLine());
            if (user.length() < 6) {
                System.out.print("El nombre debe contener al menos 6 carácteres.\nIntente de nuevo: ");
            } else if (user.length() > 12) {
                System.out.print("El nombre de usuario no puede contener más de 12 carácteres\nIntente de nuevo: ");
            } else nombreCorrecto = true;
        } while (!nombreCorrecto);


        System.out.print("Ingrese su contraseña: ");
        pass = read.readLine();
        System.out.print("Confirme su contraseña: ");
        do {
            verifyPassword = (read.readLine());
            if (!(pass.equals(verifyPassword))) {
                System.out.println("Contraseñas no coinciden");
            } else contraseñaCorrecto = true;
        } while (!contraseñaCorrecto);


        System.out.println("Introduce un email");
        do {
            email = read.readLine();
            if (email.matches("[-\\w\\.]+@\\w+\\.\\w+")) {
                emailCorrecto = true;
            }else {
                System.out.print("Ingrese un email válido: ");
            }
        } while (!emailCorrecto);
        System.out.println("Se le envió un código de verificación a " + email);

    }
}