package legion.alpha.ssd_shop.data;

import legion.alpha.ssd_shop.domain.Product;

public class Mapping {
    public static Product toDomainEntity(ProductDbModel product) {
        return new Product(
                product.getId(),
                product.getName(),
                product.getMaker(),
                product.getCapacityInGb(),
                product.getFormFactor(),
                product.getReadingSpeed(),
                product.getWritingSpeed(),
                product.getPrice()
        );
    }
    public static ProductDbModel toDbModel(Product product) {
        return new ProductDbModel(
                product.getId(),
                product.getName(),
                product.getMaker(),
                product.getCapacityInGb(),
                product.getFormFactor(),
                product.getReadingSpeed(),
                product.getWritingSpeed(),
                product.getPrice()
        );
    }
}