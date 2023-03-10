package SemiColon;

public class SNative {
    private String name;
    private String laptopType;
    private String eatFood;
    private int Id;

    public void setId(int id) {
        Id = id;
    }



    public static void print(SNative sNative){
        System.out.println(sNative);
    }
    public static void print(String word){
        System.out.println(word);
    }

    public int getId() {
        return Id;
    }

    public SNative(String name, String laptop, String eatFood, int id) {
        this.name = name;
        this.laptopType = laptop;
        this.eatFood = eatFood;
        this.Id = id;
    }
    public SNative(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public String getEatFood() {
        return eatFood;
    }

    public void setEatFood(String eatFood) {
        this.eatFood = eatFood;
    }

    public String toString(){
        return String.format("\n\n||======================================||\n" +
                                "|| name : %s                         ||\n" +
                                "__________________________________________\n" +
                                "||laptop : %s                            ||\n  " +
                                "||---------------------------------------||\n" +
                                "||the food i ate is : %s                 ||\n " +
                                "||=======================================||\n", getName(),
                getLaptopType(), getEatFood());
    }

//    @Override
//    public String toString() {
//        return "SNative{" +
//                "name='" + name + '\n'' +
//                ", laptopType='" + laptopType + '\'' +
//                ", eatFood='" + eatFood + '\'' +
//                '}
//    }
}
