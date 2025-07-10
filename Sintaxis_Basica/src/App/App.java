package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(in);

    public static void main(String[] args) throws IOException {

        App obj = new App();

        System.out.println("--------------------------------");
        System.out.println("----------Crear cuenta----------");
        System.out.println("--------------------------------");

        obj.User();
    }
    public void User() throws IOException
    {
        System.out.println("Ingrese su nombre de usuario\n-Debe contener un mínimo de 6 caracteres y un máximo de 12");
        System.out.println("-Debe contener letras y números");
        String user = (read.readLine());
        if (user.length() < 6)
        {
            System.out.println("El nombre debe contener al menos 6 carácteres.");
            User();
        }
        if (user.length() > 12)
        {
            System.out.println("El nombre de usuario no puede contener más de 12 carácteres");
            User();
        }
        Pass();

    }
    public void Pass()throws IOException
    {
        System.out.println("Ingrese su contraseña");
        String pass = read.readLine();
        Email();
    }
    //Validador de email
    public void Email()throws IOException
    {
        String email;
        boolean emailCorrecto;
        do{
            System.out.println("Introduce un email");
            email= read.readLine();
            emailCorrecto=email.matches("[-\\w\\.]+@\\w+\\.\\w+");
        }while(!emailCorrecto);

        System.out.println("Se le envió un código de verificación a " + email);
    }
}
