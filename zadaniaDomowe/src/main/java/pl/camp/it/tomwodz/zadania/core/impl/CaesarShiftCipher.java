package pl.camp.it.tomwodz.zadania.core.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.tomwodz.zadania.core.ICaesarShiftCipher;
import pl.camp.it.tomwodz.zadania.core.IDeciphering;
import pl.camp.it.tomwodz.zadania.core.IEncryption;

import java.util.Scanner;

@Component
public class CaesarShiftCipher implements ICaesarShiftCipher {

    @Autowired
    private IEncryption encryption;
    @Autowired
    private IDeciphering deciphering;
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiadomość do zaszyfrowania: ");
        String str = scanner.nextLine();
        System.out.println("Podaj klucz szyfrowania [1-25]: ");
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println("Wiadomość do zaszyforwania: ");
        System.out.println(str.toUpperCase());
        System.out.println("Wiadomość zaszyforwana: ");
        String str_encrypted = encryption.encryption(k, str.toUpperCase());
        System.out.println(str_encrypted);
        System.out.println("Podaj wiadomość do roszyfrowania: ");
        String str_str_encrypted = scanner.nextLine();
        System.out.println("Wiadomość rozszyforwana: ");
        System.out.println("Podaj klucz do rozszyfrowania [1-25]: ");
        int key = Integer.parseInt(scanner.nextLine());
        System.out.println(deciphering.deciphering( key,str_encrypted.toUpperCase()));
    }

}
