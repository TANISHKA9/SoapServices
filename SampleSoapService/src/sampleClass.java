import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class sampleClass {

	@WebMethod
	 public String method1()
	 {
		 return "Hello from method1";
	 }
	
	public String interactMethod(String abc)
	{
		return "Output Of this WebService is:"+abc;
	}
}
