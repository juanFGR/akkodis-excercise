package com.akkodis.juanfgr.shop.tools;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HandleResponse {
    public static <T> T handleResponse(ResponseEntity response, Class<T> type) {
        HttpStatus code = (HttpStatus) response.getStatusCode();
        if (code == HttpStatus.OK || code == HttpStatus.CREATED)
            return (T) response.getBody();
        return null;
    }

}
