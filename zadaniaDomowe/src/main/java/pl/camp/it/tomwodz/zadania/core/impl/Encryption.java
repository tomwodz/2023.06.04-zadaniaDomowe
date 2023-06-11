package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.camp.it.tomwodz.zadania.core.IEncryption;
import pl.camp.it.tomwodz.zadania.model.Caesar;

@Service
public class Encryption implements IEncryption {
    @Autowired
    private Caesar caesar;
    public String encryption(int k, String str){
        caesar.setDatabaseEncrypted(k);
        String msg="";
        for(int i = 0; i <str.length(); i++){
            msg = msg + encryptionRek(str.substring(i,i+1), caesar.getDatabase(), caesar.getDatabaseEncrypted(), 0);
        }
        return msg;
    }
    private String encryptionRek(String str, String[] database, String databaseEncrypted[], int n){
        if(n == database.length){
            return "";
        }
        else {
            if(str.equals(" ")){return " ";}
            else if(str.equals(".")){return ".";}
            else {
                for (int i = 0; i < database.length; i++) {
                    if (str.equals(database[i])) {
                        return databaseEncrypted[i];
                    }
                }
            }
            return encryptionRek(str,database,databaseEncrypted,n+1);}
    }


}
