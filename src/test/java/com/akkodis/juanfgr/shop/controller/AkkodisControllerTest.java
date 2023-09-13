package com.akkodis.juanfgr.shop.controller;

import com.akkodis.juanfgr.shop.ShopApplication;
import com.akkodis.juanfgr.shop.model.Price;
import com.fasterxml.jackson.databind.ObjectMapper;
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
class AkkodisControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void createPrice() {
    }

    @Test
    void testCase_1() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price/product/35455?date=2020-06-14-10.00.00")
                .contentType("application/json")).andReturn().getResponse();
       Price price = new ObjectMapper().readValue(response.getContentAsString(),  Price.class);

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
        Assertions.assertEquals(1L, price.getId().longValue());
    }

    @Test
    void testCase_2() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price/product/35455?date=2020-06-14-16.00.00")
                .contentType("application/json")).andReturn().getResponse();
        Price price = new ObjectMapper().readValue(response.getContentAsString(),  Price.class);

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
        Assertions.assertEquals(2L, price.getId().longValue());
    }

    @Test
    void testCase_3() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price/product/35455?date=2020-06-14-21.00.00")
                .contentType("application/json")).andReturn().getResponse();
        Price price = new ObjectMapper().readValue(response.getContentAsString(),  Price.class);

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
        Assertions.assertEquals(1L, price.getId().longValue());
    }

    @Test
    void testCase_4() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price/product/35455?date=2020-06-15-10.00.00")
                .contentType("application/json")).andReturn().getResponse();
        Price price = new ObjectMapper().readValue(response.getContentAsString(),  Price.class);

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
        Assertions.assertEquals(3L, price.getId().longValue());
    }

    @Test
    void testCase_5() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(get("/api/price/product/35455?date=2020-06-16-21.00.00")
                .contentType("application/json")).andReturn().getResponse();
        Price price = new ObjectMapper().readValue(response.getContentAsString(),  Price.class);

        Assertions.assertEquals(HttpStatus.OK.value(),response.getStatus());
        Assertions.assertEquals(4L, price.getId().longValue());
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