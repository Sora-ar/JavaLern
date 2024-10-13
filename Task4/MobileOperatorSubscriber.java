package Task4;

public interface MobileOperatorSubscriber {
    void signContract();
    void openAccountAndNumber();
    void editAccount();
    String getSubscriberInfo();
    double checkBalance();
    int checkTraffic();
    String getBillingDetails();
    void changeTariffPlan(String newTariff);
    void topUpAccount(double amount);
    void closeAccountAndNumber();
}
