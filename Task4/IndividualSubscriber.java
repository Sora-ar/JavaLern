package Task4;

public class IndividualSubscriber implements MobileOperatorSubscriber {
    private final String name;
    private final String phoneNumber;
    private double balance;
    private final int traffic;
    private String tariffPlan;

    public IndividualSubscriber(String name, String phoneNumber, String tariffPlan) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.tariffPlan = tariffPlan;
        this.balance = 0.0;
        this.traffic = 5000;
    }

    @Override
    public void signContract() {
        System.out.println("Договір укладено з абонентом " + name);
    }

    @Override
    public void openAccountAndNumber() {
        System.out.println("Відкрито рахунок та номер для абонента " + name);
    }

    @Override
    public void editAccount() {
        System.out.println("Обліковий запис абонента " + name + " відредаговано.");
    }

    @Override
    public String getSubscriberInfo() {
        return "Ім'я: " + name + ", Номер телефону: " + phoneNumber + ", Тариф: " + tariffPlan;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public int checkTraffic() {
        return traffic;
    }

    @Override
    public String getBillingDetails() {
        return "Деталізація платежів для номера " + phoneNumber;
    }

    @Override
    public void changeTariffPlan(String newTariff) {
        this.tariffPlan = newTariff;
        System.out.println("Тарифний план змінено на " + newTariff);
    }

    @Override
    public void topUpAccount(double amount) {
        this.balance += amount;
        System.out.println("Рахунок поповнено на " + amount + " грн. Новий баланс: " + balance);
    }

    @Override
    public void closeAccountAndNumber() {
        System.out.println("Рахунок та номер абонента " + name + " закрито.");
    }
}
