package com.junz.collection.iterator;

import java.util.ListIterator;

public class ListIteratorTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	public static void ListIteratorTest() {
		//
		ListIterator litr = new ListIterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer previous() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int nextIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int previousIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void set(Integer e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void add(Integer e) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
	
}
