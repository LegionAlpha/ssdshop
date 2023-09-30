package legion.alpha.ssd_shop.data;

import legion.alpha.ssd_shop.domain.Product;
import legion.alpha.ssd_shop.domain.ProductService;
import legion.alpha.ssd_shop.domain.search.ProductSearchParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DefaultProductService implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public DefaultProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> findById(Long id) {
        Optional<ProductDbModel> optionalProduct = productRepository.findById(id);
        return optionalProduct.map(Mapping::toDomainEntity);
    }

    @Override
    public List<Product> get(ProductSearchParams searchParams) {
        List<ProductDbModel> results = productRepository.findAll(
                RequestBuilder.withSearchParams(searchParams),
                RequestBuilder.withSort(searchParams)
        );
        return results.stream().map(Mapping::toDomainEntity).toList();
    }

    @Override
    public Product createOrUpdate(Product product) {
        ProductDbModel savedProduct = productRepository.save(Mapping.toDbModel(product));
        return Mapping.toDomainEntity(savedProduct);
    }

    @Override
    public void delete(Long productId) {
        productRepository.deleteById(productId);
    }
}