package decorator.demo2.javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * java的I/O流也采用了装饰者模式
 * 利用装饰者模式写一个输入流的装饰者，将读入的大写字母转成小写字母
 * @author Mr.luo
 *
 */
public class LowerCaseInputStream extends FilterInputStream{

	public  LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	//针对字节
	public int read() throws IOException{
		int c=super.read();
		return (c==-1?c:Character.toLowerCase((char)c));
	}
	//针对字节数组
	public int read(byte[] b,int offset,int len) throws IOException{
		int  result=super.read(b, offset, len);
		for(int i=offset ; i<offset+result ; i++){
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
