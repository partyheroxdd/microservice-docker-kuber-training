package kz.microservicedockerkubertraining.controller;


import kz.microservicedockerkubertraining.model.Hata;
import kz.microservicedockerkubertraining.service.HataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hata")
public class HataController {
    private final HataService hataService;

    @GetMapping("/getAll")
    public List<Hata> getAll(){
        return hataService.getAllHata();
    }

    @PostMapping("/addHata")
    public Hata addHata(@RequestBody Hata hata){
        return hataService.save(hata);
    }
}
