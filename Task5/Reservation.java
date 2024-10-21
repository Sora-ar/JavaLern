package Task5;
import java.util.Date;

public class Reservation {
    private final String customerName;
    private final Date reservationDate;

    public Reservation(String customerName, Date reservationDate) {
        this.customerName = customerName;
        this.reservationDate = reservationDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    @Override
    public String toString() {
        return "Резервація для " + customerName + " на " + reservationDate;
    }
}
