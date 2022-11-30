package Diary;

import java.time.LocalDateTime;

public class Entry {
    private  String title;
    private String message;
    private int id;
    private LocalDateTime timeOfEntry;

    public Entry(int id, String title, String message) {
        this.id = id;
        this.title = title;
        this.message = message;
        timeOfEntry = LocalDateTime.now();

    }

    public String getTile() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", id=" + id +
                ", timeOfEntry=" + timeOfEntry +
                '}';
    }
}
