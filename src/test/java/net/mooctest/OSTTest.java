package net.mooctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.TreeSet;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import net.mooctest.OST;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;

public class OSTTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test(timeout = 4000)
	public void test() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		assertEquals(set.isEmpty(), tree.isEmpty());
	}

	@Test(timeout = 4000)
	public void test1() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		assertEquals(set.size(), tree.size());
	}

	@Test(timeout = 4000)
	public void test2() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		assertFalse(tree.addAll(set));
	}

	@Test(timeout = 4000)
	public void test3() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		assertTrue(tree.addAll(set));
	}

	@Test(timeout = 4000)
	public void test4() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		assertTrue(tree.addAll(set));
	}

	@Test(timeout = 4000)
	public void test5() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		assertTrue(tree.addAll(set));
	}

	@Test(timeout = 4000)
	public void test6() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		assertFalse(tree.retainAll(set));
	}

	@Test(timeout = 4000)
	public void test7() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(1);
		assertFalse(tree.retainAll(set));
	}

	@Test(timeout = 4000)
	public void test8() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(1);
		assertTrue(tree.removeAll(set));
	}

	@Test(timeout = 4000)
	public void test9() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		// set.add(1);
		assertFalse(tree.removeAll(set));
	}

	@Test(timeout = 4000)
	public void test10() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		assertFalse(tree.add(1));
	}

	@Test(timeout = 4000)
	public void test11() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		assertTrue(tree.add(1));
	}

	@Test(timeout = 4000)
	public void test12() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("The input element is null.");
		assertTrue(tree.add(null));
	}
	
	@Test(timeout = 4000)
	public void test13() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		thrown.expect(NullPointerException.class);
		assertTrue(tree.contains(null));
	}
	
	@Test(timeout = 4000)
	public void test14() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(1);
		assertTrue(tree.contains(1));
	}
	
	@Test(timeout = 4000)
	public void test15() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(1);
		assertFalse(tree.contains(2));
	}
	
	@Test(timeout = 4000)
	public void test16() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
//		tree.add(1);
//		set.add(1);
		assertFalse(tree.remove(null));
	}
	
	@Test(timeout = 4000)
	public void test17() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(1);
		assertTrue(tree.remove(1));
	}
	
	@Test(timeout = 4000)
	public void test18() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(1);
		assertFalse(tree.remove(2));
	}
	
	@Test(timeout = 4000)
	public void test19() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("The input index is too large: 2, the size of this tree is 1");
		tree.get(2);
	}
	
	@Test(timeout = 4000)
	public void test20() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("The input index is too large: 1, the size of this tree is 1");
		tree.get(1);
	}
	
	@Test(timeout = 4000)
	public void test21() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		assertEquals(new Integer(1), tree.get(0));
	}
	
	@Test(timeout = 4000)
	public void test22() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("The input index is negative: -1");
		tree.get(-1);
	}
	
	@Test(timeout = 4000)
	public void test23() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		assertEquals(0, tree.indexOf(1));
	}
	
	@Test(timeout = 4000)
	public void test24() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		assertEquals(-1, tree.indexOf(2));
	}
	
	@Test(timeout = 4000)
	public void test25() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		assertFalse(tree.isEmpty());
	}
	
	@Test(timeout = 4000)
	public void test26() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		set.add(2);
		assertTrue(tree.retainAll(set));
	}
	
	@Test(timeout = 4000)
	public void test27() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		assertTrue(tree.isHealthy());
	}
	
	@Test(timeout = 4000)
	public void test28() {
		OST<Integer> tree = new OST<>();
		TreeSet<Integer> set = new TreeSet<>();
		tree.add(1);
		tree.add(4);
		tree.add(3);
		tree.add(2);
		assertTrue(tree.isHealthy());
	}
}
