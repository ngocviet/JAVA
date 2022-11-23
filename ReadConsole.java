import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {

				System.out.print("Nhập nội dung: ");
				String input = br.readLine();

				if ("q".equals(input)) {
					System.out.println("Thoát!");
					System.exit(0);
				}

				System.out.println("Đã nhâp : " + input);
				System.out.println("-----------\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
