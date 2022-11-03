package com.hng.stage2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hng.stage2.enums.HngEnums;

public class HngResponseDto {
    @JsonProperty(value = "operation_type")
    private HngEnums operationType;
    private String slackUsername;
    private Integer result;


    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public HngEnums getOperationType() {
        return operationType;
    }

    public void setOperationType(HngEnums operationType) {
        this.operationType = operationType;
    }

}
