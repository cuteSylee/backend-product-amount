package antigravity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import antigravity.domain.entity.PromotionProducts;

public interface PromotionProductsRepository extends JpaRepository<PromotionProducts, Long>{
	
}
