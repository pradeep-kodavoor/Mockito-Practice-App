package com.practice.mockitoFramework.MockitoPractice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

	// Creating mock object of the DataService
	@Mock
	DataService dataServiceMock;

	// For Injecting the dependency to the class
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 6, 15 });
		assertEquals(24, someBusinessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_OneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
	}

}