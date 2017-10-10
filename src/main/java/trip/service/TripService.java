package trip.service;

import org.springframework.stereotype.Service;
import trip.model.TripRequest;

import java.util.HashSet;
import java.util.Set;

@Service
public class TripService {

    Set<String> trips = new HashSet<>();

    public Boolean Travel(TripRequest tripRequest){
        String key = tripRequest.toString();

        return trips.add(key);
    }
}
