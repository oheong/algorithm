import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<String, String>();
		maps.put("0", "0000");
		maps.put("1", "0001");
		maps.put("2", "0010");
		maps.put("3", "0011");
		maps.put("4", "0100");
		maps.put("5", "0101");
		maps.put("6", "0110");
		maps.put("7", "0111");
		maps.put("8", "1000");
		maps.put("9", "1001");
		maps.put("A", "1010");
		maps.put("B", "1011");
		maps.put("C", "1100");
		maps.put("D", "1101");
		maps.put("E", "1110");
		maps.put("F", "1111");

		 String ss = "0F97A3";
//		String ss = "01D06079861D79F99F";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ss.length(); i++) {
			sb.append(maps.get(ss.charAt(i) + ""));
			// s+=maps.get(ss.charAt(i)); // 이게 너무 느림
		}
		// System.out.println(sb);
		ss = sb.toString();
		// 7bit씩 잘라내서 10진수로 만들기
		int size = ss.length() / 7 * 7;
		for (int i = 0; i < size; i += 7) {
			System.out.println(Integer.parseInt(ss.substring(i, i + 7), 2));
		}
		System.out.println(Integer.parseInt(ss.substring(size, ss.length()), 2));
	}
}
