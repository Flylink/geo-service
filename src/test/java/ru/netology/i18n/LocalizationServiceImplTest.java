package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @Test
    void localeTest() {
        LocalizationServiceImpl localizationServiceImpl = new LocalizationServiceImpl();
        String expectedMessage = "Welcome";
        String actualMessage = localizationServiceImpl.locale(Country.BRAZIL);
        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}