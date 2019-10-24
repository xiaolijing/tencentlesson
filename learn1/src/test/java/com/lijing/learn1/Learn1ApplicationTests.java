package com.lijing.learn1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learn1ApplicationTests {

    private MockMvc mvc;

    @Before
    public void before(){
        mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();

    }

    @Test
    public void contextLoads() {
//        RequestBuilder requestBuilder = get("/index");
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/find/1/%E9%BB%84%E8%81%BF%E5%85%83");
        RequestBuilder requestBuilder = get("/find/1/黄聿元").characterEncoding("UTF-8");
        try {
            MvcResult mvcResult = mvc.perform(requestBuilder).andReturn();
//            mvc.perform(requestBuilder).andExpect(status().isNotFound());
            System.out.println(mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
