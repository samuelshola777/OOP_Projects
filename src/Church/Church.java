package Church;

import java.util.ArrayList;
import java.util.List;

public class Church  {

    private List<MemberImpl> memberList = new ArrayList<>();
    private List<OsherImpl> osherList = new ArrayList<>();
    private int balance;
    public Church (){}
    public Church(MemberImpl member){
        if (member != null){
            memberList.add(member);
        }
    }
    public void receivePayment(){

    }
    public Church(OsherImpl osher){
        if (osher != null){
            osherList.add(osher);
        }
    }

    public void createChurchMember(String name , String id){
        MemberImpl churchMember = new MemberImpl(name, id);
                memberList.add(churchMember);
    }
    public void checkNumberOfMember(){
        System.out.println("we have  "+memberList.size()+" member s in my church");
    }
    public  void findById(int id ){
        memberList.get(id).getId();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void viewAllChurchMember(){
        for (int i = 0; i < memberList.size(); i++) {
            System.out.println(memberList.get(i));
        }
        }
    }


