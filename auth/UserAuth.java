package auth;

import java.util.Scanner;

public class UserAuth implements Auth {

    @Override
    public boolean authenticate() {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Autentikasi dasar berhasil.");
            return true;
        } else {
            System.out.println("Username atau password salah.");
            return false;
        }
    }
}

