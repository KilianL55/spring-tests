package fr.caensup.td4.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class MockMvcHelper {

    @Autowired
    protected MockMvc mockMvc;

    protected void checksStatusAndContent(String url, int status ,String content) throws Exception {

        ResultActions results = this.mockMvc.perform(MockMvcRequestBuilders.get(url));

        results.andExpect(MockMvcResultMatchers.status().is(status)).andExpect(content().string(containsString(content)));

    }

    protected void checksViewStatusAndContent(String view, String url, int Status, String content){

    }

}
