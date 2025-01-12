package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;


class GeoServiceImplTest {

    @Test
    void byIpTest() {
        GeoServiceImpl geoServiceImpl = new GeoServiceImpl();
        String ip = "96.44.183.149";
        Location actualLocation = geoServiceImpl.byIp(ip);
        Country expectedCountry = Country.USA;
        Assertions.assertEquals(expectedCountry, actualLocation.getCountry());
    }
}