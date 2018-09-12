package com.junz.designPattern.Adapter.eleAdapter.objAdapter;

public class Main {

	public static void main(String[] args) {
		PrintBanner p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
