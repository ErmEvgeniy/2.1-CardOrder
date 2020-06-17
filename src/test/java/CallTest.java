
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.*;

        public class CallTest {

            @Test
            void shouldTestV1() {
                open("http://localhost:9999");
                $(By.xpath("//*[@id=\"root\"]/div/form/div[1]/span/span/span[2]/input")).sendKeys("Василий Пупкин");
                $("[data-test-id=phone] input").sendKeys("+79270000000");
                $("[data-test-id=agreement]").click();
                $("button.button").click();
                String actual = $("[data-test-id=order-success]").getText();
                assertEquals("Ваша заявка успешно отправлена! ", actual.trim());

            }
        }