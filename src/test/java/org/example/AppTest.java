package org.example;

import junit.framework.TestCase;

import static org.example.App.search;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    public AppTest( String testName )
    {
        super( testName );
    }

    public void testSearch() {
        int[][] arr = {{1, 2, 6}, {
                        3, 4}};
        int i1 = 0, j1 = 2;
        System.out.println((search(arr, i1, j1)));
        assertEquals(6,search(arr, i1, j1));

    }
    public void testGroup()
    {
        assertTrue( true );
    }
}
