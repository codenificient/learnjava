package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// basic implementation of sets and lists (Data Structures)
		
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		

		// set operations are really fast, constant time (not much affected by data size)
		// Arrays are slower and affected by data size
		
		boolean x = t.contains(5);
		
		System.out.println(x);
		
		
			System.out.println(t);
		
		t.remove(-8);
		int y = t.size();
		
		System.out.println(y);
		
		// TreeSets will provide an ordered list
		Set<Integer> u = new TreeSet<Integer>();
		
		u.add(5);
		u.add(7);
		u.add(5);
		u.add(9);
		u.add(-8);
		
		System.out.println(u);
		
		
		// LinkedHashSet is another one. time complexity is better on some operations
		Set<Integer> w = new LinkedHashSet<Integer>();
		w.add(7);
		w.add(5);
		w.add(5);
		w.add(-8);
		w.add(9);
		
		System.out.println(w);
		
		
		// Arrays and Lists are similar,but lists are slower than Arrays and they can change in size after implementation
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		z.add(5);
		z.add(7);
		z.add(-8);
		z.add(9);
		z.add(5);
		// to remove things, t.remove; to obtain the value, t.get(index), to set an existing value to a new value(index, value), t.set(1, 5)
		z.subList(1, 3);
		System.out.println(z);
		
		System.out.println(z.subList(1, 4));
	}

}
