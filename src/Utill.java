import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utill {

	public static String getFileData(String path) {
		FileReader fr;
		try {
			fr = new FileReader(path);
			BufferedReader reader = new BufferedReader(fr);
			StringBuilder builder = new StringBuilder();
			String line;

			try {
				while ((line = reader.readLine()) != null) {
					builder.append(line);
				}
				return builder.toString();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return null;

	}

	public static String getTodayTostring(String format) {
		Date nowDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String strNowDate = simpleDateFormat.format(nowDate);

		return strNowDate;
	}

	public static String getReverseString(String inputStr) {
		StringBuilder sb = new StringBuilder(inputStr);
		sb.reverse();
		return sb.toString();
	}

	public static String getReverseString2(String inputStr) {
		String text = inputStr;

		String result = "";
		for (int i = 0; i < text.length(); i++) {
			result = text.charAt(i) + result;
		}
		return result;
	}

	public static String getLeftPad(String inputStr, String length) {

		if (inputStr == null) {
			return "";
		}

		String message = inputStr;
		int inputLength = inputStr.length();

		int number = Integer.parseInt(length);

		if (number < inputLength) {
			String result2 = message.substring(0, number);
			return result2;
		} else if (inputStr != "") {
			String result = "";
			for (int i = 0; i < number - inputLength; i++) {
				result = " " + result;
			}

			String result1 = result + message;

			return result1;
		}

		return "";

	}

}
