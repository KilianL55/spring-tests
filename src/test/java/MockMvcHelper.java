import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class MockMvcHelper {

    @Autowired
    protected MockMvc MockMvc;

    protected void checkStatusAndContent(String url, int status, String content) throws Exception{
        ResultActions results = this.MockMvc.perform(MockMvcRequestBuilders.get(url));

        results.andExpect(MockMvcResultMatchers.status().is(status)).andExpect(content().string(containsString(content)));
    }
}
