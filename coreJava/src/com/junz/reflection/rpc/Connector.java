package com.junz.reflection.rpc;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 
 * @author YY小主
 *
 */
public class Connector {

	//
	private String host;
	private int port;
	private Socket skt;
	private InputStream is;
	private ObjectInputStream ois;
	private OutputStream os;
	private ObjectOutputStream oos;
	
	/**
	 * Constructor
	 * @param host
	 * @param port
	 * @throws Exception 
	 */
	public Connector(String host, int port) throws Exception {
		super();
		this.host = host;
		this.port = port;
		connect(host, port);
	}
	
	/**
	 * send 
	 * 发送对象
	 */
	public void send(Object obj) throws Exception{
		oos.writeObject(obj);
	}
	
	//接收对象
	public Object receive() throws Exception{
		return ois.readObject();
	}
	
	//建立与远程服务器的连接
	public void connect() throws Exception{
		connect(host, port);
	}
	
	//建立与远程服务器的连接
	public void connect(String host, int port) throws Exception {
		skt = new Socket(host, port);
		os = skt.getOutputStream();
		oos = new ObjectOutputStream(os);
		is = skt.getInputStream();
		ois = new ObjectInputStream(is);
	}
	
	//关闭连接
	public void close() {
		try{
			ois.close();
			oos.close();
			skt.close();
		}catch(Exception e) {
			System.out.println("Coonector.close:" + e);
		}
	}
	
}
