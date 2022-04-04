package kz.microservicedockerkubertraining.repository;

import kz.microservicedockerkubertraining.model.Hata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HataRepository extends JpaRepository<Hata, String> {

}
