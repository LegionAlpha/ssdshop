package legion.alpha.ssd_shop.domain.search;

import legion.alpha.ssd_shop.domain.FormFactor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ProductSearchParams {
    String name;
    String maker;
    Integer capacityInGb;
    FormFactor formFactor;
    Integer minReadingSpeed;
    Integer maxReadingSpeed;
    Integer minWritingSpeed;
    Integer maxWritingSpeed;
    SortParams sortParams;
    boolean asc = true;
}