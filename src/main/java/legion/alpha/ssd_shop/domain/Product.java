package legion.alpha.ssd_shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Product {
    Long id;
    String name;
    String maker;
    int capacityInGb;
    FormFactor formFactor;
    int readingSpeed;
    int writingSpeed;
    int price;
}