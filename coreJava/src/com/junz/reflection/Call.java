package com.junz.reflection;

import java.io.Serializable;

/**
 * 客户端对服务器的一次调用，抽象为 call 类
 * @author YY小主
 *
 */
public class Call implements Serializable {

	//
	private String className;		//表示类名或接口名
	private String methodName;		//表示方法名
	private Class[] paramType;		//表示方法参数类型
	private Object[] params;		//表示方法参数值
	
	//表示方法的执行结果
	//如果方法正常执行，则result 为方法返回值；如果方法抛出异常，那么result 为该异常
	private Object result;
	
	public Call(){}
	
	public Call(String className, String methodName, Class[] paramType, Object[] params) {
		this.className = className;
		this.methodName = methodName;
		this.paramType = paramType;
		this.params = params;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Class[] getParamType() {
		return paramType;
	}

	public void setParamType(Class[] paramType) {
		this.paramType = paramType;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	//
	public String toString() {
		
		return "className=" + className + "  methodName=" + methodName;
	}
	
	
	
}
