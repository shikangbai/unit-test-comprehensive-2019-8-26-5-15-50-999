package tw;
public class Game {
	private static boolean judgeInput(String input) {
		input = input.replace(" ", "");
		if(input.length() != 4) {
			return false;
		}
		StringBuffer sb = new StringBuffer(input);
		String rs = sb.reverse().toString().replaceAll("(.)(?=.*\\1)", "");
		StringBuffer out = new StringBuffer(rs);
		String result = out.reverse().toString();
		if(result.length() != 4) {
			return false;
		}
		return true;
	}
	public static String playGame(String input) throws Exception {
		if(!judgeInput(input)) {
			return "error";
		}
		String[] answer = { "1", "2", "3", "4" };
		// ֵ��ȷ��λ�ò���ȷ
		int valueCount = 0;
		// ֵ��ȷ��λ����ȷ
		int positionCount = 0;
		String[] result = input.split(" ");
		for (int j = 0; j < result.length; j++) {
			for (int k = 0; k < answer.length; k++) {
				if (result[j].equals(answer[k])) {
					// λ�����
					if (j == k) {
						positionCount++;
					} else {
						// ֻ��ֵ���
						valueCount++;
					}
				}
			}
		}
		return positionCount + "A" + valueCount + "B";
	}
}