
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class HotelReservationTest {
    static HotelReservationService hotelReservation;

    @BeforeAll
    static void initialize() {
        hotelReservation = new HotelReservationService();
        hotelReservation.addHotel(new Hotel("Lakewood", 110,90));
        hotelReservation.addHotel(new Hotel("Bridgewood", 150,50));
        hotelReservation.addHotel(new Hotel("Ridgewood", 220,150));
    }

    @Test
    void givenHotelShouldBeAddedToHotelList() {
        boolean result = hotelReservation.addHotel(new Hotel("Lakewood",110,90));
        Assertions.assertTrue(result);
    }

    @Test
    void givenCheckInAndCheckOutDatesShouldGetCheapestHotel() {
        Hotel hotel = hotelReservation.getCheapestHotel("1-08-2022", "10-08-2022");
        Assertions.assertEquals("Lakewood", hotel.getName());
    }

    @Test
    void givenWeekendDatesShouldReturnCheapestHotel() {
        Hotel hotel = hotelReservation.getCheapestHotel("13-08-2022", "14-08-2022");
        Assertions.assertEquals("Bridgewood", hotel.getName());
    }
}
