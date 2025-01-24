package string.immutable;

public class ImmutableToMutable {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("harshwardhan");
		sb.append(" shetty");
		System.out.println(sb);
		sb.delete(5,12);
		System.out.println(sb);
	}
}
