package Task4;

public class Main {
    public static void main(String[] args) {
        IndividualSubscriber individual = new IndividualSubscriber("Іван", "+380123456789", "Безлім");
        individual.signContract();
        individual.topUpAccount(100);
        System.out.println(individual.getSubscriberInfo());

        CorporateSubscriber corporate = new CorporateSubscriber("IT Solutions", "+380987654321", "Корпоративний");
        corporate.addEmployeeNumber("Анна", "+380987654322");
        corporate.addEmployeeNumber("Світлана", "+380987654323");
        corporate.topUpAccount(1000);
        System.out.println(corporate.getSubscriberInfo());
        corporate.topUpAccount(465);
        corporate.removeEmployeeNumber("+380987654323");
    }
}
