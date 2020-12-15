import java.util.ArrayList;
import java.util.Collections;

public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return 配列の中の降順で2番目の値
	 */
	int get2ndMax(int[] d) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < d.length; i++) {
			list.add(Integer.valueOf(d[i]));
		}
		Collections.sort(list,Collections.reverseOrder());
		return  list.get(2);
	}
}
