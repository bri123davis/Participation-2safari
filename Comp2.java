import java.sql.Timestamp;
import java.util.*;


public class Comp2 extends company{

    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    static List<Comp2> ctList = new ArrayList<>();
    static List<History> histList = new ArrayList<>();

    int ctId;
    int ctBalance;
    //constructor
    Comp2(int ctId, int ctBalance){
        this.ctId=ctId;
        this.ctBalance=ctBalance;
    }
    public int getCtId(){
        return ctId;
    }
    public int getCtBalance(){
        return ctBalance;
    }
    public String toString(){
        return ctId+"\t"+ctBalance;
    }
    public Comp2() {
    }
    public float interestRate() {
        return 0.99f;
    }
    static public void displayData() {
        for (company Company : ctList) {
            System.out.println(Company);
        }
    }

    public static void deposit() {
        int depAmount, oldAmount, newAmount, a, cd;
        boolean b2 = false;
        //CampA ct;
        ArrayList<Comp2> ctAList = new ArrayList<>();
        ArrayList<Comp2> histAList = new ArrayList<>();
        ListIterator<Comp2> li = ctAList.listIterator();
        ListIterator<Comp2.History> pi = histList.listIterator();
        for (Comp2 ct : ctList) {
            System.out.print("Amount to deposit: ");
            depAmount = scan2.nextInt();
            a = ct.getCtBalance() + depAmount;
            oldAmount = ct.getCtBalance();
            company Company = (new Comp2(ct.getCtId(), a));

            b2 = true;
        }
        if (b2) {
            System.out.println("Deposit is Successful");
        } else {
            System.out.println("Deposit Failed");
        }

    }



    public static void displayHistory() {
        Iterator iter = histList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    class History {
        company mycompany;
        int cumulPay;
        Timestamp mTime;

        //constructor
        History(company mycompany, int cumulPay, Timestamp mTime) {
            this.mycompany = mycompany;
            this.cumulPay = cumulPay;
            this.mTime = mTime;
        }

        public company getMycompany() {
            return this.mycompany;
        }

        public int cumulPay() {
            return this.cumulPay;
        }

        public Timestamp mTime() {
            return mTime;
        }

        public String toString() {
            return mycompany + "\t" + cumulPay + "\t" + mTime;
        }
    }
}
