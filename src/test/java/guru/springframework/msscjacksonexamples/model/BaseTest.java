package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class BaseTest {
    BeerDto getBeerDto() {
        return BeerDto.builder()
                .beerName("TestName")
                .beerStyle("TestStyle")
                .createdDate(OffsetDateTime.now())
                .id(UUID.randomUUID())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal(ThreadLocalRandom.current().nextLong()))
                .upc(ThreadLocalRandom.current().nextLong())
                .build();
    }
}
