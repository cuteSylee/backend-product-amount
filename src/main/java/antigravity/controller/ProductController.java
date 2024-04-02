package antigravity.controller;

import antigravity.model.request.ProductInfoRequest;
import antigravity.model.response.ProductAmountResponse;
import antigravity.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private final ProductService service;

    //상품 가격 추출 api
    @GetMapping("/amount")
    public ResponseEntity<ProductAmountResponse> getProductAmount() {

        ProductAmountResponse response = service.getProductAmount(getParam());
        
        System.out.println("gggggggggggg");
        System.out.println(response);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private ProductInfoRequest getParam() {
        long[] couponIds = {1L, 2L};

        ProductInfoRequest request = ProductInfoRequest.builder()
                .productId(1L)
                .couponIds(couponIds)
                .build();

        return request;
    }
}
