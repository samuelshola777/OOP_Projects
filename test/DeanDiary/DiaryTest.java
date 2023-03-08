//package DeanDiary;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryTest {
//    private Diary diary;
//
//    @BeforeEach
//    void setUp() {
//        diary = new Diary("wunmi");
//    }
//
//    @Test
//    void objectExist() {
//        assertNotNull(diary);
//    }
//
//    @Test
//    void thatDiaryCanBeLocked() {
//        assertTrue(diary.isLocked());
//    }
//
//    @Test
//    void unlockDiary() {
//        assertTrue(diary.isLocked());
//        diary.unlockDiary("wunmi");
//        assertFalse(diary.isLocked());
//    }
//
//    @Test
//    void testDiaryCanLock() {
//        assertTrue(diary.isLocked());
//        diary.unlockDiary("wunmi");
//        diary.lockedDiary();
//        assertTrue(diary.isLocked());
//
//    }
//   @Test
//    void ifWrongPasswordCanUnlockDiary(){
//        assertTrue(diary.isLocked());
//        diary.unlockDiary("samuelshola");
//        assertTrue(diary.isLocked());
//   }
//   @Test
//    void createDiary(){
////       assertTrue(diary.isLocked());
//       diary.unlockDiary("wunmi");
//       diary.write("the journey of life","now i walked the street with loaded" +
//               "six strings on my back");
//       assertEquals(1,diary.getNumberOfEntries());
//   }
//
//}
