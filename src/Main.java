import java.util.*;
import java.io.*;

/*
 * Author:JumHuang
 * Date:2019-7-11 12:53
 * 参考手册：JavaAPI
 * QQ：3116075662
 */

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("请输入保存地址：");
		String path = input.nextLine();
		
		System.out.println("请输入保存内容：");
		String content=input.nextLine();
		try
		{
			//这个是最简单的文本写入方法，若文件不存在，就创建
			//下面这行中的false，是指写在文件开始处，true是指在文件末尾追加内容
			FileWriter writer=new FileWriter(new File(path),false);
			writer.write(content);   
			writer.flush();
			writer.close();   //关闭IO流
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
