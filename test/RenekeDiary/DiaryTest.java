package RenekeDiary;

import ReneKeDiary.DiaryPage;
import ReneKeDiary.DiaryZ;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    DiaryZ diary;
    DiaryPage diaryPage;

    @BeforeEach
    void setUp() {
        DiaryPage diaryPage = new DiaryPage("how i wrote tdd on my own", "i borrowed wunmi laptop to write tdd," +
                " while i was writting it she came and collect her system so i had to continue my self");
        diary = new DiaryZ("samuel", "correct");
    }

    @Test
    void diaryExist() {
        assertNotNull(diary);
    }

    @Test
    void newDiaryIsLocked() {
        assertTrue(diary.isLocked());
    }

    @Test
    void unlockDiaryWithPassword() {
        assertTrue(diary.isLocked());
        diary.unlockWithPassword("correct");
        assertFalse(diary.isLocked());
    }

    @Test
    void lockDiaryWithPassword() {
        assertTrue(diary.isLocked());
        diary.unlockWithPassword("correct");
        assertFalse(diary.isLocked());
        diary.lockDiary("correct");
        assertTrue(diary.isLocked());

    }

    @Test
    void testThatDiaryHasPages() {
        DiaryPage diaryPage = new DiaryPage("how i wrote tdd on my own", "i borrowed wunmi laptop to write tdd," +
                " while i was writting it she came and collect her system so i had to continue my self");
        assertNotNull(diaryPage);

    }

    @Test
    void testThatDiaryPageHasPagies() {
        diary.writeInsideDiary("how i wrote tdd on my own", "i borrowed wunmi laptop to write tdd," +
                " while i was writting it she came and collect her system so i had to continue my self");


    }

    @Test
    void checkNumberOfPagesInDiary() {
        diary.writeInsideDiary("how hungry i am ", "i'm just hungry and i don't have what to eat" +
                " bt i'll eat anything i see sha maybe ricr");
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ");
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ")
        ;
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ");
        assertEquals(4, diary.checkNumberOfWriting());
    }

    @Test
    void testThatWeCanChangeTitle() {
        diary.writeInsideDiary("how hungry i am ", "i'm just hungry and i don't have what to eat" +
                " bt i'll eat anything i see sha maybe ricr");
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ");
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ")
        ;
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ");
        diary.setDiryTitle(2, "the day that never come");
        assertEquals("the day that never come", diary.getDiaryPageTitle(2));
    }

    @Test
    void testThatWeCanChangeMessage() {
        diary.writeInsideDiary("how hungry i am ", "i'm just hungry and i don't have what to eat" +
                " bt i'll eat anything i see sha maybe ricr");
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ");
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ")
        ;
        diary.writeInsideDiary("the sound of silence ", "take the time just to listen" +
                " when the when the voices screeming are much to loud ");
        diary.setDiaryMessage(2, "don't change the way you think of me we'er from the same story, life " +
                "moves on can't stay the same for some of us i'm worried");
        assertEquals("don't change the way you think of me we'er from the same story, life " +
                "moves on can't stay the same for some of us i'm worried", diary.getDiaryMessage(2));

    }
    @Test
    void testThatWeCanGetAllWringingInDiary(){

    }
}
