package prob1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getSevenWeekendPay() {
        Employee e = new Employee("A",10);
        e.setHours(5,7);
        Assertions.assertEquals(e.getPay(),70);
    }

    @Test
    void getSixWeekendPay() {
        Employee e = new Employee("A",10);
        e.setHours(5,6);
        Assertions.assertEquals(e.getPay(),60);
    }


}