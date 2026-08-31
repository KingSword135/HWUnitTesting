package prob1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getSevenHrsWeekendPay() {
        Employee e = new Employee("A",10);
        e.setHours(5,7);
        Assertions.assertEquals(e.getPay(),70);
    }

    @Test
    void getFourDayLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,8);
        e.setHours(1,8);
        e.setHours(2,8);
        e.setHours(3,8);
        Assertions.assertEquals(e.getPay(),320);
    }


}