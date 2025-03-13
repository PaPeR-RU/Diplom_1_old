package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class BunTests {

    @Test
    public void getNameIsSuccess() {
        String bunName = "bunName";
        Bun bun = new Bun(bunName, 100);

        MatcherAssert.assertThat(
                "Некорректное наименование булочки",
                bun.getName(),
                equalTo(bunName)
        );
    }

    @Test
    public void getPriceIsSuccess() {
        float bunPrice = 100;
        Bun bun = new Bun("bunName", bunPrice);

        MatcherAssert.assertThat(
                "Некорректная стоимость булочки",
                bun.getPrice(),
                equalTo(bunPrice)
        );
    }
}