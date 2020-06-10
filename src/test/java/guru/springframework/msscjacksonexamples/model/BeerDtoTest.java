package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

@JsonTest
@ActiveProfiles("kebab")
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void serializationTest() throws JsonProcessingException {
        String serializedDto = objectMapper.writeValueAsString(getBeerDto());
        System.out.println(serializedDto);
    }

    @Test
    void deserializationTest() throws IOException {
        String serializedDto = "{\"id\":\"59b364f8-96ec-46a6-889e-86d85065cbf7\",\"beer-name\":\"TestName\",\"beer-style\":\"TestStyle\",\"upc\":5053976553082851690,\"price\":-8748697615749813207,\"created-date\":\"2020-06-10T10:53:46.327152+04:00\",\"last-updated-date\":\"2020-06-10T10:53:46.3550088+04:00\"}";
        BeerDto beerDto = objectMapper.readValue(serializedDto, BeerDto.class);
        System.out.println(beerDto.toString());
    }
}