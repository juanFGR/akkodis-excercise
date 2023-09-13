package com.akkodis.juanfgr.shop.controller;

import com.akkodis.juanfgr.shop.ShopApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@AutoConfigureJsonTesters
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = ShopApplication.class)
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void createPrice() {
    }

    @Test
    void getAllPrice() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price")
                .contentType("application/json")).andReturn().getResponse();

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
    }

    @Test
    void searchPrice() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price/1")
                .contentType("application/json")).andReturn().getResponse();

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
    }

    @Test
    void searchPriceByProduct() {
    }


}