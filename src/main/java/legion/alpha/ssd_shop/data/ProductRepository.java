package legion.alpha.ssd_shop.data;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<ProductDbModel, Long> {
    List<ProductDbModel> findAll(Specification<ProductDbModel> specification, Sort sort);
}