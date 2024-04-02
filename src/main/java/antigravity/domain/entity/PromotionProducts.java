package antigravity.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class PromotionProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private int promotion_id;
	private int product_id;
    
    @Builder
    public PromotionProducts(int promotion_id, int product_id) {
    	this.promotion_id = promotion_id;
    	this.product_id = product_id;
    }
}
