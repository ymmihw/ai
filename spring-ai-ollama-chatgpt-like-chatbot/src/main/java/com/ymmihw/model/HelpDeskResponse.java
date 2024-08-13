package com.ymmihw.model;

import lombok.Data;

@Data
public class HelpDeskResponse {
    String result;
    public HelpDeskResponse(String result) {
        this.result = result;
    }
}
