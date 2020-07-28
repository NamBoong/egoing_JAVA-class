import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		p1.write("Bye 1");
		p1.close();
		//파일에 대한 수정이 매우 쉽다. 후속으로 기록들도 확인하기 쉽다.
		//Math는 1회용이라면, printwriter에 new로 복제해서 다용성으로 쓸 수 있다.(constructor가 있으면 다회용 가능 printwriter가 가능한거임)
		
		// PrintWriter.write("result1.txt", "Hello 1");
		// PrintWriter.write("result2.txt", "Hello 2");
		// 이렇게하면 하나하나 그때마다 고쳐야하고, 애초에 되지도 않는다.
		

	
		
		
	}

}
