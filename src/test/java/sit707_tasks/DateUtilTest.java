package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222435189";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Samadhi Jayasinghe";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testDayD1MonthM1YearY1() {
        // Increment day
        DateUtil date = new DateUtil(15, 4, 2024);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD1MonthM1YearY2() {
        // Increment day
        DateUtil date = new DateUtil(15, 4, 2023);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD1MonthM2YearY1() {
        // Increment day
        DateUtil date = new DateUtil(15, 1, 2024);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD1MonthM2YearY2() {
        // Increment day
        DateUtil date = new DateUtil(15, 1, 2023);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD1MonthM3YearY1() {
        // Increment day
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD1MonthM3YearY2() {
        // Increment day or Reset day and Increment month
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD2MonthM1YearY1() {
        // Increment day
        DateUtil date = new DateUtil(29, 4, 2024);
        date.increment();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD2MonthM1YearY2() {
        // Increment day
        DateUtil date = new DateUtil(29, 4, 2023);
        date.increment();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD2MonthM2YearY1() {
        // Increment day
        DateUtil date = new DateUtil(29, 1, 2024);
        date.increment();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD2MonthM2YearY2() {
        // Increment day
        DateUtil date = new DateUtil(29, 1, 2023);
        date.increment();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD2MonthM3YearY1() {
        // Reset day and Increment month
        DateUtil date = new DateUtil(29, 2, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD2MonthM3YearY2() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(29, 2, 2023);
    }
    
    @Test
    public void testDayD3MonthM1YearY1() {
        // Reset day and Increment month
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD3MonthM1YearY2() {
        // Reset day and Increment month
        DateUtil date = new DateUtil(30, 4, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD3MonthM2YearY1() {
        // Increment day
        DateUtil date = new DateUtil(30, 1, 2024);
        date.increment();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD3MonthM2YearY2() {
        // Increment day
        DateUtil date = new DateUtil(30, 1, 2023);
        date.increment();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD3MonthM3YearY1() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(30, 2, 2024);
    }

    @Test
    public void testDayD3MonthM3YearY2() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(30, 2, 2023);
    }

    @Test
    public void testDayD4MonthM1YearY1() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(31, 4, 2024);
    }

    @Test
    public void testDayD4MonthM1YearY2() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(31, 4, 2023);
    }

    @Test
    public void testDayD4MonthM2YearY1() {
        // Reset day and Increment month
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testDayD4MonthM2YearY2() {
        // Reset day and Increment month
        DateUtil date = new DateUtil(31, 1, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testDayD4MonthM3YearY1() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(31, 2, 2004);
    }

    @Test
    public void testDayD4MonthM3YearY2() {
        // Invalid Date
        thrown.expect(RuntimeException.class);
        DateUtil date = new DateUtil(31, 2, 2003);
    }
}
