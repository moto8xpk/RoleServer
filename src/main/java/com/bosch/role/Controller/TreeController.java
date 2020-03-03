package com.bosch.role.Controller;

import com.bosch.role.Entity.TabTree;
import com.bosch.role.Entity.Tree;
import com.bosch.role.repository.TabTreeRepository;
import com.bosch.role.repository.TreeRepository;
import javafx.scene.control.Tab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreeController {

    @Autowired
    private TreeRepository treeRepository;

    @Autowired
    private TabTreeRepository tabTreeRepository;


    @GetMapping("/trees")
    List<Tree> findAllTree() {
        return (List<Tree>) treeRepository.findAll();
    }

    @GetMapping("/tab-trees")
    List<TabTree> findAllTabTree() {
        return (List<TabTree>) tabTreeRepository.findAll();
    }
}
