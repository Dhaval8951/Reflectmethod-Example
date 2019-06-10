import java.util.HashMap;
import java.util.Map;

public class SampleClassReturnsHashMap {

	public HashMap<Integer, String> users;

	public Map getUsers(int i) {
		users = new HashMap<>();
		users.put(1, "Dhaval");
		users.put(2, "Test");
		users.put(3, "Charlotte");
		System.out.println(i);
		return users;

	}

}
