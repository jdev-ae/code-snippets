public class StringTester {

	public String strReverse(String string) {
		if (string.length() == 1) {
			return string;
		}
		return strReverse(string.substring(1)) + string.charAt(0);
	}
}
