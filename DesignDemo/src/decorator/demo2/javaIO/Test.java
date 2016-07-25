package decorator.demo2.javaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试写好的IO流
 * @author Mr.luo
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in=new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("test.txt")));
			while ((c=in.read())>=0) {
				System.out.println((char)c);
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
