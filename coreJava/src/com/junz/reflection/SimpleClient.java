package com.junz.reflection;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

	//
	public void invoke() throws Exception {
		Socket socket = new Socket("localhost", 8000);
		OutputStream out = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		InputStream in = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		//
//		Call call = new Call("com.junz.reflection.HelloService", "getTime", new Class[]{}, new Object[]{});
		Call call = new Call("com.junz.reflection.HelloService", "echo", new Class[]{String.class}, new Object[]{"Hello"});
		
		oos.writeObject(call);			//向服务器发送 call 对象
		call =(Call)ois.readObject();	//接收包含了方法执行结果的Call 对象
		System.out.println(call.getResult());
		
		ois.close();
		oos.close();
		socket.close();
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new SimpleClient().invoke();
	}

}
