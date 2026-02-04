package auth;

public class Main {

    public static void main(String[] args) {

        Auth auth = new UserAuth1();                  // Lapisan 1
        auth = new OTPDecorator(auth);               // Lapisan 2
        auth = new BiometricDecorator(auth);          // Lapisan 3

        System.out.println("=== SISTEM AUTENTIKASI 3 LAPIS ===");

        if (auth.authenticate()) {
            System.out.println("Akses diberikan.");
        } else {
            System.out.println("Akses ditolak.");
        }
    }
}

