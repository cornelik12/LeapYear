import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Leap_Year {

    @Test
    public void Years_Dividable_By_Four_But_Not_Hundred_Are_Leap_Years()
    {
        assertEquals(true, Year.isLeapYear(2020));
        assertEquals(true, Year.isLeapYear(2024));
        assertEquals(false, Year.isLeapYear(2034));
        assertEquals(false, Year.isLeapYear(1994));
    }

    @Test
    public void Years_Dividable_By_Four_Hundred_Are_Leap_Years()
    {
        assertEquals(true, Year.isLeapYear(2000));
        assertEquals(true, Year.isLeapYear(2400));
        assertEquals(false, Year.isLeapYear(1800));
        assertEquals(false, Year.isLeapYear(2200));
    }

    //Når det ikke er skuddår
    @Test
    public void Years_Not_Dividable_By_Four_Are_Not_Leap_Years()
    {
        assertEquals(false, Year.isLeapYear(1998));
        assertEquals(false, Year.isLeapYear(2022));
        assertEquals(true, Year.isLeapYear(1936));
        assertEquals(true, Year.isLeapYear(2004));
    }

    @Test
    public void Years_Dividable_By_Hundred_But_Not_Four_Hundred_Are_Not_Leap_Years() {
        assertEquals(false, Year.isLeapYear(1700));
        assertEquals(false, Year.isLeapYear(2100));
        assertEquals(true, Year.isLeapYear(2000));
        assertEquals(true, Year.isLeapYear(1600));
    }

}
