//package com.junz.reflection.rpc;
//
//
//import com.junz.reflection.Call;
//
///**
// * 静态代理类
// * @author YY小主
// *
// */
//public class HelloServiceProxy {
//
//	//
//	private String host;
//	private int port;
//	
//	public HelloServiceProxy(String host, int port) {
//		super();
//		this.host = host;
//		this.port = port;
//	}
//	
//	/**
//	 * 
//	 * @param msg
//	 * @return
//	 * @throws RemoteException
//	 */
//	public String echo(String msg) throws RemoteException {
//		Connector connector = null;
//		try{
//			connector = new Connector(host, port);
//			Call call = new Call("com.junz.reflection.rpc.HelloService", "echo", new Class[]{String.class}, new Object[]{msg});
//			connector.send(call);
//			
//			call = (Call)connector.receive();
//			Object result = call.getResult();
//			if(result instanceof Throwable) {
//				throw new RemoteException((Throwable)result);	//把异常转换为 RemoteException
//			}else {
//				return (String)result;		
//			}
//			
//		}catch(Exception e) {
//			throw new RemoteException(e);
//		}finally{
//			if(connector != null) {
//				connector.close();
//			}
//		}
//	}
//	
//	//
//	public Date getTime() throws RemoteException{
//		
//	}
//	
//	
//	
//}
