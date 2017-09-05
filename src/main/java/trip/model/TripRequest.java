package trip.model;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class TripRequest {

    @Pattern(regexp = "[a-zA-Z]+\\w")
    private String id;

    private String place;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
