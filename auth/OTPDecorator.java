package auth;

import java.util.Random;
import java.util.Scanner;

public class OTPDecorator extends AuthDecorator {

    public OTPDecorator(Auth auth) {
        super(auth);
    }

    @Override
    public boolean authenticate() {
        if (!super.authenticate()) {
            return false;
        }

        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000);

        System.out.println("OTP anda: " + otp);

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan OTP: ");
        int userOtp = input.nextInt();

        if (userOtp == otp) {
            System.out.println("OTP valid.");
            return true;
        } else {
            System.out.println("OTP salah.");
            return false;
        }
    }
}
