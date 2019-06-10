import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class InitClass {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SampleClassReturnsHashMap obj = new SampleClassReturnsHashMap();

		Class cls = obj.getClass();

		System.out.println(cls.getName());
		System.out.println((cls.getField("users")));
		Constructor constructor = cls.getConstructor();
		System.out.println("The name of constructor is " + constructor.getName());
		// System.out.println("The public methods of class are : ");

		// Getting methods of the class through the object
		// of the class by using getMethods

		Method[] methods = cls.getMethods();

		// Printing method names
		// for (Method method : methods)
		// System.out.println(method.getName());

		Method methodcall1 = cls.getDeclaredMethod("getUsers", int.class);
		Object o = methodcall1.invoke(obj, 19);
		HashMap<Integer, String> users = (HashMap<Integer, String>) o;
		for (Map.Entry<Integer, String> e : users.entrySet()) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}

	}

}
