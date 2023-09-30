package legion.alpha.ssd_shop.data;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.Predicate;
import legion.alpha.ssd_shop.domain.search.ProductSearchParams;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.List;

public class RequestBuilder {
    public static Specification<ProductDbModel> withSearchParams(ProductSearchParams searchParams) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (StringUtils.isNotEmpty(searchParams.getName())) {
                predicates.add(criteriaBuilder.equal(root.get("name"), searchParams.getName()));
            }
            if (StringUtils.isNotEmpty(searchParams.getMaker())) {
                predicates.add(criteriaBuilder.equal(root.get("maker"), searchParams.getMaker()));
            }
            if (searchParams.getCapacityInGb() != null) {
                predicates.add(criteriaBuilder.equal(root.get("capacityInGb"), searchParams.getCapacityInGb()));
            }
            if (searchParams.getFormFactor() != null) {
                predicates.add(criteriaBuilder.equal(root.get("formFactor"), searchParams.getFormFactor()));
            }
            if (searchParams.getMinReadingSpeed() != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("readingSpeed"), searchParams.getMinReadingSpeed()));
            }
            if (searchParams.getMaxReadingSpeed() != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("readingSpeed"), searchParams.getMaxReadingSpeed()));
            }
            if (searchParams.getMinWritingSpeed() != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("writingSpeed"), searchParams.getMinWritingSpeed()));
            }
            if (searchParams.getMaxWritingSpeed() != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("writingSpeed"), searchParams.getMaxWritingSpeed()));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }

    public static Sort withSort(ProductSearchParams searchParams) {
        final Sort.Direction direction = searchParams.isAsc() ? Sort.Direction.ASC : Sort.Direction.DESC;
        if (searchParams.getSortParams() == null) {
            return Sort.by(direction, "id");
        }
        switch (searchParams.getSortParams()) {
            case ByPrice -> {
                return Sort.by(direction, "price");
            }
            case ByWritingSpeed -> {
                return Sort.by(direction, "writingSpeed");
            }
            case ByReadingSpeed -> {
                return Sort.by(direction, "readingSpeed");
            }
            default -> {
                return Sort.by(direction, "id");
            }
        }
    }
}