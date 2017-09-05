package trip.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trip.model.Trip;
import trip.model.TripRequest;

import javax.validation.Valid;

@RestController
public class TripController {

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/trip")
    public ResponseEntity<Trip> trip(@Valid @RequestBody TripRequest trip) {
        // TODO
        // persist the trip somewhere

        return new ResponseEntity<>(new Trip(), HttpStatus.CREATED);
    }
}