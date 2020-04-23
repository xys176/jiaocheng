package Nine;

import jdk.nashorn.internal.objects.NativeBoolean;

public class TestAccount7 {
    public static void main(String[] args) {
        Account7 object1=new Account7(1122,20000);
        object1.setAnnuailnterestRate(0.045);
        object1.withDraw(2500);
        object1.deposit(3000);
        System.out.println("余额是"+object1.getBalance()+"月利息是"+object1.getMonthlyInterest()+
                "开户日期是"+object1.getDateCreated());
    }
}
