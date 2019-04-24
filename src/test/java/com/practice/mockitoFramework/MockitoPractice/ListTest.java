package com.practice.mockitoFramework.MockitoPractice;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

	@Mock
	List<Object> list;

	@Test
	public void testSingleReturn() {
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
		assertEquals(10, list.size());
	}

	@Test
	public void testMultipleReturn() {
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}

	@Test
	public void testGet() {
		when(list.get(1)).thenReturn(10);
		assertEquals(10, list.get(1));
		assertEquals(null, list.get(2));
	}

	@Test
	public void testGetWithGenericParameter() {
		when(list.get(anyInt())).thenReturn(10);
		assertEquals(10, list.get(1));
		assertEquals(10, list.get(2));
	}

}
