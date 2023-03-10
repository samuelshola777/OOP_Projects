package ReneKeDiary;

import java.util.ArrayList;
import java.util.List;

public class DiaryZ {
    private String name;
    private String password;
    private boolean isLocked = true;

    private List<DiaryPage> diaryPageList = new ArrayList<>();


    public List<DiaryPage> getDiaryPageList() {
        return diaryPageList;
    }

    public DiaryZ(String name, String password) {
            this.name = name;
            this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWithPassword(String password) {

        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches){
            isLocked = false;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void setDiaryPageList(List<DiaryPage> diaryPageList) {
        this.diaryPageList = diaryPageList;
    }

    public void lockDiary(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches){
            isLocked = true;
        }
    }

    public void writeInsideDiary(String title, String message) {
        DiaryPage diaryPage = new DiaryPage(title, message);
        diaryPageList.add(diaryPage);

    }

    public int checkNumberOfWriting() {
        return diaryPageList.size();
    }

    public void setDiryTitle(int id, String newTitle) {
        diaryPageList.get(id).setTitle(newTitle);
    }

    public String getDiaryPageTitle(int id) {
        System.out.println(diaryPageList.get(id).getTitle());
        return diaryPageList.get(id).getTitle();
    }

    public void setDiaryMessage(int id, String message) {
        diaryPageList.get(id).setMessage(message);
    }

    public String getDiaryMessage(int id) {
        System.out.println(diaryPageList.get(id).getMessage());
        return diaryPageList.get(id).getMessage();
    }
}
