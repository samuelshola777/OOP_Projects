package Animal;

public abstract class Mammal extends Animal {
    public String getMammaryGlams() {
        return mammaryGlams;
    }

    public void setMammaryGlams(String mammaryGlams) {
        this.mammaryGlams = mammaryGlams;
    }

    private String mammaryGlams;

    public void move(){
        System.out.println("let's talk a walk");
    }

}
