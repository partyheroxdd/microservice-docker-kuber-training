package kz.microservicedockerkubertraining.service;


import kz.microservicedockerkubertraining.model.Hata;
import kz.microservicedockerkubertraining.repository.HataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HataService {
    private final HataRepository hataRepository;

    public List<Hata> getAllHata(){
        return hataRepository.findAll();
    }

    public Hata save(Hata hata){
        return hataRepository.save(hata);
    }
}
