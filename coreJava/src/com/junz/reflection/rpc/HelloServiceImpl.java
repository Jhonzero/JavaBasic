package com.junz.reflection.rpc;

import java.util.Date;

public class HelloServiceImpl implements HelloService {

	@Override
	public String echo(String msg) {
		// TODO Auto-generated method stub
		return "echo " + msg;
	}

	@Override
	public Date getTime() {
		// TODO Auto-generated method stub
		return new Date();
	}

}
