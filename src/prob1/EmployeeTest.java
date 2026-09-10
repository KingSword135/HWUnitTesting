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

    @Test
    void getFourDayGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,12);
        e.setHours(1,12);
        e.setHours(2,12);
        e.setHours(3,12);
        Assertions.assertEquals(e.getPay(),480);
    }

    @Test
    void getFiveDayAndWedwLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,8);
        e.setHours(1,8);
        e.setHours(2,8);
        e.setHours(3,4);
        e.setHours(5,8);
        Assertions.assertEquals(e.getPay(),360);
    }


    @Test
    void getFiveDayAndWedwLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,12);
        e.setHours(1,12);
        e.setHours(2,12);
        e.setHours(3,12);
        e.setHours(5,12);
        Assertions.assertEquals(e.getPay(),600);
    }

    @Test
    void getFiveDayLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,7);
        e.setHours(1,7);
        e.setHours(2,7);
        e.setHours(3,7);
        e.setHours(4,7);
        Assertions.assertEquals(e.getPay(),350);
    }

    @Test
    void getFiveDay40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,8);
        e.setHours(1,8);
        e.setHours(2,8);
        e.setHours(3,8);
        e.setHours(4,8);
        Assertions.assertEquals(e.getPay(),400);
    }

    @Test
    void getFiveDayGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,10);
        e.setHours(1,10);
        e.setHours(2,10);
        e.setHours(3,10);
        e.setHours(4,10);
        Assertions.assertEquals(e.getPay(),500);
    }

    @Test
    void getFiveDayAndWedwLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,7);
        e.setHours(1,7);
        e.setHours(2,7);
        e.setHours(3,7);
        e.setHours(5,7);
        Assertions.assertEquals(e.getPay(),350);
    }

    @Test
    void getFiveDayAndWedwGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,10);
        e.setHours(1,10);
        e.setHours(2,10);
        e.setHours(3,10);
        e.setHours(5,10);
        Assertions.assertEquals(e.getPay(),500);
    }
}