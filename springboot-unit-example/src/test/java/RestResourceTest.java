import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class RestResourceTest {

	private MockMvc mockMvc;

	@InjectMocks
	private RestResource restResource;

	@Before
	public void before() {
		mockMvc = MockMvcBuilders.standaloneSetup(restResource).build();
	}

	@Test
	public void testRestR() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello Rest"));
	}

	@Test
	public void testJson() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/json")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.name", org.hamcrest.Matchers.is("kiran")))
				.andExpect(MockMvcResultMatchers.jsonPath("$.greet", org.hamcrest.Matchers.is("Hello")));

	}

}
