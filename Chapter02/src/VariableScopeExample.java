
public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		// int v3 = v1 + v2 + 5; // v2는 제어문 내에서 잠깐 사용되는 변수라서 컴파일 에러 발생
		

	}

}
