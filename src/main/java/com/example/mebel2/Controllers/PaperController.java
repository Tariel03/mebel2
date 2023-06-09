package com.example.mebel2.Controllers;

import com.example.mebel2.Entities.Paper;
import com.example.mebel2.Enums.FormatEnum;
import com.example.mebel2.Projections.PaperProjection;
import com.example.mebel2.Services.PaperService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/open")
public class PaperController {
    PaperService paperService;
    @GetMapping("/paper/all")
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001","http://46.8.43.42:3000" ,"*"})
    public List<Paper> findAll(){
        return paperService.findAll();
    }

    @PostMapping("/save/paper")
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001","http://46.8.43.42:3000" ,"*"})
    public Paper saved(@RequestBody Paper paper){
        return paperService.save(paper);
    }


}
