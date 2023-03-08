package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private int  numberOfHappening = 0;

    private final List <Entry> entries = new ArrayList<>();
    public Diary(String ownerName, String password){
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches) isLocked  = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void write(String title, String message) {
        if (isLocked)throw new IllegalArgumentException();
        if (!isLocked) {
            int id = numberOfEntries() + 1;
//        Happening happening = new Happening(message);
            Entry entry = new Entry(id, title, message);

//        happening.setTitle;
//        happening.
            entries.add(entry);
        }

    }

    public int numberOfEntries() {

        return   entries.size();
    }

    public Entry findEntryWithId(int id) {
        for (Entry entry:entries
             ) {
            if (entry.getId() == id)return  entry;

        }
        return null;
    }
}
