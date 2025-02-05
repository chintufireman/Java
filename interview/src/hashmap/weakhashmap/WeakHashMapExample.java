package hashmap.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		imageCache.put("img1", new Image("Image 1"));
		imageCache.put("img2", new Image("Image 2"));
		System.out.println(imageCache.toString());
//		System.gc();
		simulateApplicationRunning();
		System.out.println("Cache after running some entries may be cleared "+imageCache);
//		even if u called garbage collector function the imageCache won't get cleared like 
//		weakreference even though it was not in use for 5sec or 10sec now let's see
//		what weakhashmap tells 
//		An entry in a WeakHashMap will automatically be removed whenits key is
//		no longer in ordinary use. the weakhashmap contains weak keys
		
//		the reason for this is the keys in above map are string literals which are stored
//		in String pool which means these keys are strong referenced, and we know 
//		the strings inside the string pool are strongly referenced throughout the life
//		cycle program
//		so what we have to do so that these keys are garbage collected which means we have 
//		to create non literal keys 
		
		WeakHashMap<String, Image> imageCache2 = new WeakHashMap<>();
//		String s1 = new String("img1");
//		String s2 = new String("img2"); //these are strong reference
//		imageCache2.put(new String("img1"), new Image("Image 1"));
//		imageCache2.put(new String("img2"), new Image("Image 2"));
//		s1= null;
//		s2= null;
		loadCache(imageCache2);
		System.gc();
		System.out.println(imageCache2.toString());
//		if u dont make s1 and s2 null the garbage collection wont work and entry
//		wont be removed but then this thing was done in strong reference as well 
//		where we make references null and call System.gc(); method so if u dont want
//		to do this then directly create object inside the put method and that wont be
//		strong reference.
		
//		and still u want to use reference variable then create method 
//		and create inside it strong reference
		
	}
	
	public static void loadCache(Map<String, Image> imageCache2) {
		
		String s1 = new String("img1");
		String s2 = new String("img2");
		
		imageCache2.put(s1, new Image("Image 1"));
		imageCache2.put(s2, new Image("Image 2"));
//		and the result will be empty why because the scope of these s1 and s2 is till
//		the function only after that they are removed from pool
//		so those objects are ready to be garbage collected
	}
	
	public static void simulateApplicationRunning() throws InterruptedException {
		Thread.sleep(5000);
	}
}
class Image{
	String name;
	
	Image(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Image [name=" + name + "]";
	}
}