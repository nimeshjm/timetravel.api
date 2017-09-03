package trip.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trip.model.Trip;
import trip.model.TripRequest;

@RestController
public class TripController {

    @RequestMapping(method = RequestMethod.POST, value = "/trip")
    public ResponseEntity<Trip> trip(@RequestBody TripRequest trip) {
        // TODO
        // validate the trip
        // persist the trip somewhere

        return new ResponseEntity<>(new Trip(), HttpStatus.CREATED);
    }
}