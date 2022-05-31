import java.sql.Timestamp;
import java.util.*;


public class comp1 extends company {

    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    static List<comp1> ctList = new ArrayList<>();
    static List<History> histList = new ArrayList<>();
    int ctId;
    int ctBalance;

    //constructor
    comp1(int ctId, int ctBalance) {
        this.ctId = ctId;
        this.ctBalance = ctBalance;
    }

    public int getCtId() {
        return ctId;
    }

    public int getCtBalance() {
        return ctBalance;
    }

    public String toString() {
        return ctId + "\t" + ctBalance;
    }

    public comp1() {
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
        ArrayList<comp1> ctAList = new ArrayList<>();
        ArrayList<comp1> histAList = new ArrayList<>();
        ListIterator<comp1> li = ctAList.listIterator();
        ListIterator<History> pi = histList.listIterator();
        for (comp1 ct : ctList) {
            System.out.print("Amount to deposit: ");
            depAmount = scan2.nextInt();
            a = ct.getCtBalance() + depAmount;
            oldAmount = ct.getCtBalance();
            company Company = (new comp1(ct.getCtId(), a));


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
        company myCompany;
        int cumulPay;
        Timestamp mTime;

        //constructor
        History(company myCompany, int cumulPay, Timestamp mTime) {
            this.myCompany = myCompany;
            this.cumulPay = cumulPay;
            this.mTime = mTime;
        }

        public company getMyCompany() {
            return this.myCompany;
        }

        public int cumulPay() {
            return this.cumulPay;
        }

        public Timestamp mTime() {
            return mTime;
        }

        public String toString() {
            return myCompany + "\t" + cumulPay + "\t" + mTime;
        }
    }
}

