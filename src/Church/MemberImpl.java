package Church;

public class MemberImpl implements MemberRepository {
    private String name;
    private String id;

    public String getName() {
        return name;
    }
    public MemberImpl (){}

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MemberImpl(String name, String id) {
        this.id = id;
        this.name = name;
    }


//    @Override
//    public void payTithe(int titheAmount) {
//        Church church = new Church();
//titheAmount +=
//    }

    @Override
    public void payTithe(int titheAmount) {

    }

    @Override
    public String dance() {
        return null;
    }
    public String toString(){
        return String.format("""
              ||==============================||\n
               || name -->  %s           ||\n
               ||==============================||\n        
               || id --> %s                    ||\n
               ||===============================||\n
               
               \n\n 
                """,getName(),getId());
    }
}
