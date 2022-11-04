package com.hng.stage2.controller;

import com.hng.stage2.dto.HngRequestDto;
import com.hng.stage2.dto.HngResponseDto;
import com.hng.stage2.service.HngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HngController {
    @Autowired
    private HngService hs;

    @PostMapping(value = "/stage2")
    public HngResponseDto get(@RequestBody HngRequestDto dto){
        HngResponseDto serv = hs.operation(dto);
        return serv;
    }

}
