package legion.alpha.ssd_shop.data;

import jakarta.persistence.*;
import legion.alpha.ssd_shop.domain.FormFactor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Table(name = "Products")
public class ProductDbModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column(name = "Name")
    private final String name;

    @Column(name = "Maker")
    private final String maker;

    @Column(name = "CapacityInGb")
    private final int capacityInGb;

    @Column(name = "FormFactor")
    @Enumerated(EnumType.ORDINAL)
    private final FormFactor formFactor;

    @Column(name = "ReadingSpeed")
    private final int readingSpeed;

    @Column(name = "WritingSpeed")
    private final int writingSpeed;

    @Column(name = "Price")
    private final int price;
}