package SemiColon;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private List<SNative> sNativeList;

    public static void print(Cohort cohort) {
        System.out.println(cohort);
    }

    public static void print(String word) {
        System.out.println(word);
    }

    public Cohort(SNative snative) {
        this.sNativeList = new ArrayList<>();
        this.sNativeList.add(snative);
    }

    public List<SNative> getsNativeList() {
        return sNativeList;
    }

    public void setsNativeList(SNative sNativeList) {
        this.sNativeList.add(sNativeList);
    }
public SNative readNatives(int id ){
//    for (int i = 0; i < sNativeList.size(); i++) {
//        if (id == sNativeList.get(id).getId()) {
//            return sNativeList.get(id);
//        }
//    }
//    return null;
    for (var natives: sNativeList) {
        if (natives.getId() == id) return natives;
    }
    return null;
}

public SNative updateNative(int id, String name){
        SNative gottenNative = readNatives(id);
        gottenNative.setName(name);
        return gottenNative;
}

public void deleteNative(int id){
    for (var natives: sNativeList) {
        if (natives.getId() == id) sNativeList.remove(natives);
    }
}

    public String toString() {
        return String.format("the list of natives in cohort %s", sNativeList);
    }


}
