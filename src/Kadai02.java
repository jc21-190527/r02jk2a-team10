
public class Kadai02 {

	/**
	 * 課題02
	 * 文字列の中に、指定されたアルファベットが何文字入っているかを返すメソッド
	 * @param s 文字列
	 * @param c 文字
	 * @return sの中に入っていたcの文字数
	 */
	int countString(String s,char c) {
		int count = 0;
		for(int i = 0;i < s.length();i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
