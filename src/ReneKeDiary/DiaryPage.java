package ReneKeDiary;

public class DiaryPage {
    private String title;
    private String message;
    public DiaryPage(String title, String message) {
        this.title = title;
        this.message = message;
    }
    public DiaryPage(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
