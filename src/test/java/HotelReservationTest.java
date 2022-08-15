
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class HotelReservationTest {
    static HotelReservationService hotelReservation;

    @BeforeAll
    static void initialize() {
        hotelReservation = new HotelReservationService();
        hotelReservation.addHotel(new Hotel("Lakewood", 110));
        hotelReservation.addHotel(new Hotel("Bridgewood", 160));
        hotelReservation.addHotel(new Hotel("Ridgewood", 220));
    }

    @Test
    void givenHotel_ShouldBe_AddedToHotelList() {
        boolean result = hotelReservation.addHotel(new Hotel("Lakewood",110));
        Assertions.assertTrue(result);
    }

    @Test
    void givenCheckInAndCheckOutDates_userShould_GetCheapestHotel() {
        Hotel hotel = hotelReservation.getCheapestHotel("01-08-2022", "10-08-2022");
        Assertions.assertEquals("Lakewood", hotel.getName());
    }
}
