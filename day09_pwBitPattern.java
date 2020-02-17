import java.util.HashMap;

public class pwBitPattern {
	public static void main(String[] args) {
		HashMap<String, String> pw = new HashMap<String, String>();
		pw.put("001101", "0");
		pw.put("010011", "1");
		pw.put("111011", "2");
		pw.put("110001", "3");
		pw.put("100011", "4");
		pw.put("110111", "5");
		pw.put("001011", "6");
		pw.put("111101", "7");
		pw.put("011001", "8");
		pw.put("101111", "9");

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

//		String ss = "0DEC";
		String ss = "0269FAC9A0";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ss.length(); i++) {
			sb.append(maps.get(ss.charAt(i) + ""));
		}

		// System.out.println(sb);
		int size = sb.length() - 6;
		ss = sb.toString();
		for (int i = 0; i < size; i++) {
			if (pw.get(ss.substring(i, i + 6)) != null) {
				System.out.print(pw.get(ss.substring(i, i + 6)));
				i += 5;
			}
		}
	}
}
