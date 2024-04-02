package antigravity.service;

import antigravity.domain.entity.Product;
import antigravity.domain.entity.PromotionProducts;
import antigravity.model.request.ProductInfoRequest;
import antigravity.model.response.ProductAmountResponse;
import antigravity.repository.ProductRepository;
import antigravity.repository.PromotionProductsRepository;
import antigravity.repository.PromotionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;
	private final PromotionRepository promotionRepository;

    public ProductAmountResponse getProductAmount(ProductInfoRequest request) {
    

        Product product = productRepository.findById(request.getProductId()).orElseThrow();
        
        for(long couponId : request.getCouponIds()) {
        	System.out.println(couponId);
        }

        System.out.println("ggggg");

        return ProductAmountResponse.builder()
        		.name("")
        		.originPrice(110)
        		.discountPrice(0)
        		.finalPrice(0)
        		.build();
    }
    
    
}
