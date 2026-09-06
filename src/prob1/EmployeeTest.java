package prob1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    // 0 is Monday, 1 is Tuesday, 2 is Wednesday, 3 is Thursday, 4 is Friday, 5 is Saturday, 6 is Sunday.

    @Test
    void getZeroDaysAndZeroHours() {
        Employee e = new Employee("A",10);
        Assertions.assertEquals(0, e.getPay());
    }

    @Test
    void getSevenHrsWeekendPay() {
        Employee e = new Employee("A",10);
        e.setHours(5,7);
        Assertions.assertEquals(140, e.getPay());
    }

    @Test
    void getFourWeekDayLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,8);
        e.setHours(1,8);
        e.setHours(2,8);
        e.setHours(3,8);
        Assertions.assertEquals(320, e.getPay());
    }

    @Test
    void getFourWeekDayGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,12);
        e.setHours(1,12);
        e.setHours(2,12);
        e.setHours(3,12);
        Assertions.assertEquals(520, e.getPay());
    }

    @Test
    void getFourWeekDayOneWeekDayLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,8);
        e.setHours(1,8);
        e.setHours(2,8);
        e.setHours(3,4);
        e.setHours(5,8);
        Assertions.assertEquals(440, e.getPay());
    }

    @Test
    void getFourWeekDayOneWeekDayGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,12);
        e.setHours(1,12);
        e.setHours(2,12);
        e.setHours(3,12);
        e.setHours(5,12);
        Assertions.assertEquals(760, e.getPay());
    }

    @Test
    void getFiveWeekDayZeroWeekEndLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,7);
        e.setHours(1,7);
        e.setHours(2,7);
        e.setHours(3,7);
        e.setHours(4,7);
        Assertions.assertEquals(350, e.getPay());
    }

    @Test
    void getFiveWeekDayEqualTo40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,8);
        e.setHours(1,8);
        e.setHours(2,8);
        e.setHours(3,8);
        e.setHours(4,8);
        Assertions.assertEquals(400, e.getPay());
    }

    @Test
    void getFiveWeekDayGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,10);
        e.setHours(1,10);
        e.setHours(2,10);
        e.setHours(3,10);
        e.setHours(4,10);
        Assertions.assertEquals(550, e.getPay());
    }

    @Test
    void getFourWeekDayOneWeekEndLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,7);
        e.setHours(1,7);
        e.setHours(2,7);
        e.setHours(3,7);
        e.setHours(5,7);
        Assertions.assertEquals(420, e.getPay());
    }

    @Test
    void getFiveWeekDayOneWeekEndGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,10);
        e.setHours(1,10);
        e.setHours(2,10);
        e.setHours(3,10);
        e.setHours(4,6);
        e.setHours(5,10);
        Assertions.assertEquals(690, e.getPay());
    }

    @Test
    void getFiveWeekDayTwoWeekEndLessThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,7);
        e.setHours(1,7);
        e.setHours(2,7);
        e.setHours(3,2);
        e.setHours(4,1);
        e.setHours(5,7);
        e.setHours(6,7);
        Assertions.assertEquals(570, e.getPay());
    }

    @Test
    void getFiveWeekDayTwoWeekEndGreaterThan40HrsPay() {
        Employee e = new Employee("A",10);
        e.setHours(0,10);
        e.setHours(1,10);
        e.setHours(2,10);
        e.setHours(3,6);
        e.setHours(4,4);
        e.setHours(5,10);
        e.setHours(6,10);
        Assertions.assertEquals(850, e.getPay());
    }
}