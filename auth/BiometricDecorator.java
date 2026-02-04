package auth;

import java.util.Scanner;

import java.util.Scanner;

public class BiometricDecorator extends AuthDecorator {

    public BiometricDecorator(Auth auth) {
        super(auth);
    }

    @Override
    public boolean authenticate() {
        if (!auth.authenticate()) return false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Scan sidik jari (kode biometrik): ");
        String fingerprintInput = sc.nextLine();

        String storedFingerprintHash = "FINGER123"; // simulasi template sidik jari

        return fingerprintInput.equals(storedFingerprintHash);
    }
}


