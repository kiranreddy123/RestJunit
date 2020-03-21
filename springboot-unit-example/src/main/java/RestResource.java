import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestResource {

	@GetMapping("/hello")
	public String test() {
		return "Hello Rest";
	}
	@GetMapping("/json")
	public Hello testHelo() {
		
		return new Hello("kiran", "Hello");
	}
	private class Hello{
		private String name;
		private String greet;
		public Hello(String name, String greet) {
			super();
			this.name = name;
			this.greet = greet;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGreet() {
			return greet;
		}
		public void setGreet(String greet) {
			this.greet = greet;
		}
		
	}
}
