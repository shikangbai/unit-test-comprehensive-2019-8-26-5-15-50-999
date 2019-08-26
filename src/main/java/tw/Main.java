package tw;
import tw.commands.GuessInputCommand;
/**

 * Created by jxzhong on 2017/5/16.

 */
public class Main {
	private static final int RUN_TIMES = 6;
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < RUN_TIMES; i++) {
			String input = new GuessInputCommand().input();
			String result = Game.playGame(input);
			if(result.equals("4A0B")) {
				System.out.println("成功，一切正确");
				break;
			}
			else {
				System.out.println(result+"\t错误，请重新输入");
			}
		}
		System.out.println("游戏结束！");
	}
}