package com.practice.mockitoFramework.MockitoPractice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockWithoutAnnotationTest {

	// Creating mock object of the DataService
	// @Mock
	// DataService dataServiceMock;

	// For Injecting the dependency to the class
	// @InjectMocks
	// SomeBusinessImpl someBusinessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 6, 15 });
		assertEquals(24, someBusinessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_OneValue() {
		DataService dataServiceMock = mock(DataService.class);
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
	}

}