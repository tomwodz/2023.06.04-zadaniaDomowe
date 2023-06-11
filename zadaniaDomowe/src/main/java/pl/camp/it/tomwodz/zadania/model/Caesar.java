package pl.camp.it.tomwodz.zadania.model;

import org.springframework.stereotype.Component;

@Component
public class Caesar {
    private String[] database;
    private String[] databaseEncrypted;

    public Caesar() {
        this.database = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        "0","1","2","3","4","5","6","7","8","9"};
        this.databaseEncrypted = new String[database.length];
    }

    public String[] getDatabase() {
        return database;
    }

    public void setDatabase(String[] database) {
        this.database = database;
    }

    public String[] getDatabaseEncrypted() {
        return databaseEncrypted;
    }

    public void setDatabaseEncrypted(int k) {
        for (int i = 0; i < database.length; i++) {
            if (i < database.length - k) {
                databaseEncrypted[i] = database[i + k];
            } else {
                databaseEncrypted[i] = database[i + k -(database.length)];
            }
        }
    }
}
