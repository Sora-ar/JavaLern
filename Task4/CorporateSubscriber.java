package Task4;

public class CorporateSubscriber implements MobileOperatorSubscriber {
    private final String companyName;
    private final String phoneNumber;
    private double balance;
    private final int traffic;
    private String tariffPlan;

    public CorporateSubscriber(String companyName, String phoneNumber, String tariffPlan) {
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.tariffPlan = tariffPlan;
        this.balance = 0.0;
        this.traffic = 10000;
    }

    @Override
    public void signContract() {
        System.out.println("Договір укладено з компанією " + companyName);
    }

    @Override
    public void openAccountAndNumber() {
        System.out.println("Відкрито рахунок та номер для компанії " + companyName);
    }

    @Override
    public void editAccount() {
        System.out.println("Обліковий запис компанії " + companyName + " відредаговано.");
    }

    @Override
    public String getSubscriberInfo() {
        return "Назва компанії: " + companyName + ", Номер телефону: " + phoneNumber + ", Тариф: " + tariffPlan;
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
        return "Деталізація платежів для корпоративного номера " + phoneNumber;
    }

    @Override
    public void changeTariffPlan(String newTariff) {
        this.tariffPlan = newTariff;
        System.out.println("Тарифний план компанії змінено на " + newTariff);
    }

    @Override
    public void topUpAccount(double amount) {
        this.balance += amount;
        System.out.println("Рахунок компанії поповнено на " + amount + " грн. Новий баланс: " + balance);
    }

    @Override
    public void closeAccountAndNumber() {
        System.out.println("Рахунок та номер компанії " + companyName + " закрито.");
    }

    public void addEmployeeNumber(String employeeName, String employeePhone) {
        System.out.println("Додано номер " + employeePhone + " для співробітника " + employeeName);
    }

    public void removeEmployeeNumber(String employeePhone) {
        System.out.println("Номер " + employeePhone + " видалено з корпоративного рахунку.");
    }
}

