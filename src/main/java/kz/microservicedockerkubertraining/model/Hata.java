package kz.microservicedockerkubertraining.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Hata {
    @Id
    private String id;

    private String name;

    private LocalDate enteringTime;

    private LocalDateTime createdAt;
}
