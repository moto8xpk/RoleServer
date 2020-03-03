package com.bosch.role.Controller;

import com.bosch.role.Entity.Line;
import com.bosch.role.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LineController {
    @Autowired
    private LineRepository lineRepository;


    @GetMapping("/lines")
    List<Line> findAll() {
        return (List<Line>) lineRepository.findAll();
    }
}
