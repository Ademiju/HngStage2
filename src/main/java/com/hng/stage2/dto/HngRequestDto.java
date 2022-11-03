package com.hng.stage2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hng.stage2.enums.HngEnums;

public class HngRequestDto {
    private Integer y;
    private Integer x;
    @JsonProperty(value = "operation_type")
    private HngEnums operation;

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public HngEnums getOperation() {
        return operation;
    }

    public void setOperation(HngEnums operation) {
        this.operation = operation;
    }
}
