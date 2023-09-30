package legion.alpha.ssd_shop.domain;

import legion.alpha.ssd_shop.domain.search.ProductSearchParams;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);

    List<Product> get(ProductSearchParams searchParams);

    Product createOrUpdate(Product product);

    void delete(Long productId);
}