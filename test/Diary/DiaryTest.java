package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    void setup() {
        diary = new Diary("Amirah", "correctPassword");
    }

    @Test
    void createObject() {
      Diary diary = new Diary("Amirah", "correctPassword");
        assertNotNull(diary);
    }

    @Test
    void newDiaryIsLocked() {
        assertTrue(diary.isLocked());
    }

    @Test
    void lockedDiaryCanBeUnlockedTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("correctPassword");
        assertFalse(diary.isLocked());
    }

    @Test
    void
    wrongPasswordTest() {
        diary.unlockWith("martinPassword");
        assertTrue(diary.isLocked());
    }

    @Test
    void thatDiaryCanBeLocked() {
        diary.unlockWith("wrongPassword");
//        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    void happeningCanBeAdded() {
        assertTrue(diary.isLocked());
        diary.unlockWith("correctPassword");
        assertFalse(diary.isLocked());
        diary.write("day of hunger", "my name is samuel shola and i'm " +
                "presentlt hungry but it's actually almost break  time");
        assertEquals(1, diary.numberOfEntries());
    }
    @Test
    void  entriesCanBeFoundById(){
        diary.unlockWith("correctPassword");
        assertFalse(diary.isLocked());
        diary.write("day of hunger", "my name is samuel shola and i'm " +
                "presentlt hungry but it's actually almost break  time");
        assertEquals(1, diary.numberOfEntries());
        Entry foundEntry = diary.findEntryWithId(1);

        assertEquals(1, foundEntry.getId());
        assertEquals("day of hunger", foundEntry.getTile());
        assertEquals("my name is samuel shola and i'm " +
                "presentlt hungry but it's actually almost break  time", foundEntry.getMessage());

    }
}
