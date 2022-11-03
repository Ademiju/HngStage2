package com.hng.stage2.service;

import com.hng.stage2.dto.HngRequestDto;
import com.hng.stage2.dto.HngResponseDto;
import com.hng.stage2.enums.HngEnums;
import org.springframework.stereotype.Service;

@Service
public class HngService {
    public HngResponseDto operation(HngRequestDto op){

        Integer result ;

        HngResponseDto response = new HngResponseDto();
        response.setSlackUsername("Aiva");
        if(op.getOperation()== HngEnums.ADDITION){
            result =  op.getX()+op.getY();
        }else if(op.getOperation()== HngEnums.MULTIPLICATION){
            result = op.getX()*op.getY();
        }else
        {
            result = op.getX()-op.getY();
}
        response.setResult(result);
        response.setOperationType(op.getOperation());
        return response;
    }
}
