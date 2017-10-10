package trip;

import org.junit.Assert;
import org.junit.Test;
import trip.model.TripRequest;
import trip.service.TripService;

import java.util.Date;

public class TripServiceTest {


    @Test
    public void travel_singleuniquerequest_true(){
        TripService sut = new TripService();

        TripRequest request = new TripRequest(){{
            setId("a123");
            setPlace("place");
            setDate(new Date(1));
        }};
        Boolean actual = sut.Travel(request);

        Assert.assertTrue(actual);
    }

    @Test
    public void travel_samerequesttwice_false(){
        TripService sut = new TripService();

        TripRequest request = new TripRequest(){{
            setId("a123");
            setPlace("place");
            setDate(new Date(1));
        }};
        sut.Travel(request);
        Boolean actual = sut.Travel(request);

        Assert.assertFalse(actual);
    }

}
