package pl.camp.it.tomwodz.zadania.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.tomwodz.zadania.core.IDeciphering;
import pl.camp.it.tomwodz.zadania.model.Caesar;

@Service
public class Deciphering implements IDeciphering {

    @Autowired
    private Caesar caesar;
    public  String deciphering(int k, String str)  {
        caesar.setDatabaseEncrypted(k);
        String msg="";
        for(int i = 0; i <str.length(); i++){
            msg = msg + decipheringRek(str.substring(i,i+1), caesar.getDatabase(), caesar.getDatabaseEncrypted(), 0);
        }
        return msg;
    }

    private String decipheringRek(String str, String[] database, String databaseEncrypted[], int n){
        if(n == database.length){
            return "";
        }
        else {
            if(str.equals(" ")){return " ";}
            else if(str.equals(".")){return ".";}
            else {
                for (int i = 0; i < database.length; i++) {
                    if (str.equals(databaseEncrypted[i])) {
                        return database[i];
                    }
                }
            }
            return decipheringRek(str,database,databaseEncrypted,n+1);}
    }
}
