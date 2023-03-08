package Church;

public class OsherImpl  implements  MemberRepository{

    private  String name;
    private String position;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void payTithe(int titheAmount) {

    }

    @Override
    public String dance() {
        return null;
    }
}
