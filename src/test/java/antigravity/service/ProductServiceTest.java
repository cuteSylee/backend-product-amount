package antigravity.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class ProductServiceTest {

    @Test
    @DisplayName("한번해보기")
    void getProductAmount() {
        System.out.println("상품 가격 추출 테스트");
        log.debug("aaaa");
        log.debug("bbbbbbbb");
    }
}