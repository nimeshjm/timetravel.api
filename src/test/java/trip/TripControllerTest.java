package trip;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import trip.controller.TripController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class TripControllerTest {
    private final MockMvc mockMvc;

    public TripControllerTest()
    {
        TripController sut = new TripController();
        mockMvc = standaloneSetup(sut).build();
    }

    @Test
    public void trip_singletriprequest_true() throws Exception {
        mockMvc.perform(post("/trip")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"id\": \"id-1232131\",\n" +
                        "\t\"place\": \"london\",\n" +
                        "\t\"date\": \"2017-09-03T10:10:00.000Z\"\n" +
                        "}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void trip_singletriprequestinvalidid_false() throws Exception {
        mockMvc.perform(post("/trip")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"id\": \"1232131\",\n" +
                        "\t\"place\": \"london\",\n" +
                        "\t\"date\": \"2017-09-03T10:10:00.000Z\"\n" +
                        "}"))
                .andExpect(status().isBadRequest());
    }


    // TODO
    // implement cross cutting: test 4XX, 5XX
}
