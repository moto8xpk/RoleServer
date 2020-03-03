package com.bosch.role.Controller;

import com.bosch.role.Entity.Tag;
import com.bosch.role.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/tags")
    List<Tag> findAll() {
        return (List<Tag>) tagRepository.findAll();
    }
}
