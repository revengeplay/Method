public class TestJava {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

		
		String path = "C:\\pleiades\\2023-06\\workspace\\Method\\src\\test.txt";
		String method1 = Utill.getFileData(path);
		
		System.out.printf("%sをParamで getTodayTostring:%s",path,method1);
		System.out.println();
		
		String format = "yyyy/MM/dd";
		String method2 = Utill.getTodayTostring(format);
		
		System.out.printf("%sをParamで getTodayTostring:%s",format,method2);
		System.out.println();
		
		String inputStr = "abc";
		String method3 = Utill.getReverseString(inputStr);
		String methodd3 = Utill.getReverseString2(inputStr);
		
		System.out.printf("%sをParamで getReverseString:%s getReverseString2:%s",inputStr,method3,methodd3);
		System.out.println();
		
		String length = "5";
		
		String method4 = Utill.getLeftPad(inputStr,length);
		
		System.out.printf("%s,%sをParamで getLeftPad:%s",inputStr,length,method4);
		System.out.println();
		
	}

}	
