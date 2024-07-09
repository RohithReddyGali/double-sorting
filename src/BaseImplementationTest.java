import junit.framework.TestCase;

public abstract class BaseImplementationTest extends TestCase {
	// Abstract method to perform the sorting
    public abstract void sort(int[] toSort);

	public void testSortUnsortedArray0() {
		int[] a = {1, 12, 7, 9, 4, 3};
		sort(a);
  
		assertEquals(1, a[0]);
		assertEquals(3, a[1]);
		assertEquals(4, a[2]);
		assertEquals(7, a[3]);
		assertEquals(9, a[4]);
		assertEquals(12, a[5]);
	}
	
	public void testSortUnsortedArray1() {
	    int[] a = {1, 12, 7, 9, 4, 3};
	    sort(a);

	    assertEquals(1, a[0]);
	    assertEquals(3, a[1]);
	    assertEquals(4, a[2]);
	    assertEquals(7, a[3]);
	    assertEquals(9, a[4]);
	    assertEquals(12, a[5]);
	}

	public void testSortUnsortedArray2() {
	    int[] a = {-5, -12, -7, -9, -4, -3};
	    sort(a);

	    assertEquals(-12, a[0]);
	    assertEquals(-9, a[1]);
	    assertEquals(-7, a[2]);
	    assertEquals(-5, a[3]);
	    assertEquals(-4, a[4]);
	    assertEquals(-3, a[5]);
	}
	
	public void testSortUnsortedArray3() {
	    int[] a = {-5, 12, 0, -9, 4, -3};
	    sort(a);

	    assertEquals(-9, a[0]);
	    assertEquals(-5, a[1]);
	    assertEquals(-3, a[2]);
	    assertEquals(0, a[3]);
	    assertEquals(4, a[4]);
	    assertEquals(12, a[5]);
	}
	
	public void testSortUnsortedArray4() {
	    int[] a = {150, -100, 0, -50, 200, -25};
	    sort(a);

	    assertEquals(-100, a[0]);
	    assertEquals(-50, a[1]);
	    assertEquals(-25, a[2]);
	    assertEquals(0, a[3]);
	    assertEquals(150, a[4]);
	    assertEquals(200, a[5]);
	}
	
	public void testSortEmptyArray() {
        int[] a = {};
        sort(a);

        assertEquals(0, a.length);
    }
	
	public void testSortSortedArray0() {
        int[] a = {1, 3, 5, 7, 9, 11};
        sort(a);

        assertEquals(1, a[0]);
        assertEquals(3, a[1]);
        assertEquals(5, a[2]);
        assertEquals(7, a[3]);
        assertEquals(9, a[4]);
        assertEquals(11, a[5]);
    }
	public void testSortSortedArray1() {
	    int[] a = {1, 3, 5, 7, 9, 11};
	    sort(a);

	    assertEquals(1, a[0]);
	    assertEquals(3, a[1]);
	    assertEquals(5, a[2]);
	    assertEquals(7, a[3]);
	    assertEquals(9, a[4]);
	    assertEquals(11, a[5]);
	}

	public void testSortSortedArray2() {
	    int[] a = {-8, -5, -3, 0, 2, 5};
	    sort(a);

	    assertEquals(-8, a[0]);
	    assertEquals(-5, a[1]);
	    assertEquals(-3, a[2]);
	    assertEquals(0, a[3]);
	    assertEquals(2, a[4]);
	    assertEquals(5, a[5]);
	}
	
	public void testSortSortedArray3() {
	    int[] a = {-11, -3, 0, 5, 9, 7};
	    sort(a);

	    assertEquals(-11, a[0]);
	    assertEquals(-3, a[1]);
	    assertEquals(0, a[2]);
	    assertEquals(5, a[3]);
	    assertEquals(7, a[4]);
	    assertEquals(9, a[5]);
	}
	
	public void testSortSortedArray4() {
	    int[] a = {-11, 0, 5, 50, 100, 200};
	    sort(a);

	    assertEquals(-11, a[0]);
	    assertEquals(0, a[1]);
	    assertEquals(5, a[2]);
	    assertEquals(50, a[3]);
	    assertEquals(100, a[4]);
	    assertEquals(200, a[5]);
	}

    public void testSortIdenticalElements0() {
        int[] a = {8, 8, 8, 8, 8, 8};
        sort(a);

        assertEquals(8, a[0]);
        assertEquals(8, a[1]);
        assertEquals(8, a[2]);
        assertEquals(8, a[3]);
        assertEquals(8, a[4]);
        assertEquals(8, a[5]);
    }
    
    public void testSortIdenticalElements1() {
        int[] a = {8, 8, 8, 8, 8, 8};
        sort(a);

        assertEquals(8, a[0]);
        assertEquals(8, a[1]);
        assertEquals(8, a[2]);
        assertEquals(8, a[3]);
        assertEquals(8, a[4]);
        assertEquals(8, a[5]);
    }

    public void testSortIdenticalElements2() {
        int[] a = {-5, -5, -5, -5, -5, -5};
        sort(a);

        assertEquals(-5, a[0]);
        assertEquals(-5, a[1]);
        assertEquals(-5, a[2]);
        assertEquals(-5, a[3]);
        assertEquals(-5, a[4]);
        assertEquals(-5, a[5]);
    }
    
    public void testSortIdenticalElements3() {
        int[] a = {-8, -8, 8, 8, -8, 8};
        sort(a);

        assertEquals(-8, a[0]);
        assertEquals(-8, a[1]);
        assertEquals(-8, a[2]);
        assertEquals(8, a[3]);
        assertEquals(8, a[4]);
        assertEquals(8, a[5]);
    }
    
    public void testSortIdenticalElements4() {
        int[] a = {100, -50, 0, 100, -25, 50};
        sort(a);

        assertEquals(-50, a[0]);
        assertEquals(-25, a[1]);
        assertEquals(0, a[2]);
        assertEquals(50, a[3]);
        assertEquals(100, a[4]);
        assertEquals(100, a[5]);
    }

    public void testSortEvenLengthArray0() {
        int[] a = {5, 2, 8, 1, 9, 4};
        sort(a);

        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(4, a[2]);
        assertEquals(5, a[3]);
        assertEquals(8, a[4]);
        assertEquals(9, a[5]);
    }
    
    public void testSortEvenLengthArray1() {
        int[] a = {5, 2, 8, 1, 9, 4};
        sort(a);

        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(4, a[2]);
        assertEquals(5, a[3]);
        assertEquals(8, a[4]);
        assertEquals(9, a[5]);
    }

    public void testSortEvenLengthArray2() {
        int[] a = {-1, -4, -7, -2, -9, -5};
        sort(a);

        assertEquals(-9, a[0]);
        assertEquals(-7, a[1]);
        assertEquals(-5, a[2]);
        assertEquals(-4, a[3]);
        assertEquals(-2, a[4]);
        assertEquals(-1, a[5]);
    }
    
    public void testSortEvenLengthArray3() {
        int[] a = {-5, 2, -8, 1, -9, 4};
        sort(a);

        assertEquals(-9, a[0]);
        assertEquals(-8, a[1]);
        assertEquals(-5, a[2]);
        assertEquals(1, a[3]);
        assertEquals(2, a[4]);
        assertEquals(4, a[5]);
    }
    
    public void testSortEvenLengthArray4() {
        int[] a = {150, 2, -8, 1, 0, 4};
        sort(a);

        assertEquals(-8, a[0]);
        assertEquals(0, a[1]);
        assertEquals(1, a[2]);
        assertEquals(2, a[3]);
        assertEquals(4, a[4]);
        assertEquals(150, a[5]);
    }

    public void testSortOddLengthArray0() {
        int[] a = {5, 2, 8, 1, 9};
        sort(a);

        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(5, a[2]);
        assertEquals(8, a[3]);
        assertEquals(9, a[4]);
    }
    
    public void testSortOddLengthArray1() {
        int[] a = {5, 2, 8, 1, 9};
        sort(a);

        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(5, a[2]);
        assertEquals(8, a[3]);
        assertEquals(9, a[4]);
    }

    public void testSortOddLengthArray2() {
        int[] a = {-1, -4, -7, -2, -9};
        sort(a);

        assertEquals(-9, a[0]);
        assertEquals(-7, a[1]);
        assertEquals(-4, a[2]);
        assertEquals(-2, a[3]);
        assertEquals(-1, a[4]);
    }
    
    public void testSortOddLengthArray3() {
        int[] a = {5, -2, 8, -1, 9};
        sort(a);

        assertEquals(-2, a[0]);
        assertEquals(-1, a[1]);
        assertEquals(5, a[2]);
        assertEquals(8, a[3]);
        assertEquals(9, a[4]);
    }
    
    public void testSortOddLengthArray4() {
        int[] a = {5, -2, 8, 100, 9};
        sort(a);

        assertEquals(-2, a[0]);
        assertEquals(5, a[1]);
        assertEquals(8, a[2]);
        assertEquals(9, a[3]);
        assertEquals(100, a[4]);
    }
    
    public void testSortReverseArray() {
    	int[] a= {9, 7, 5, 3, 1};
    	sort(a);
    	assertEquals(1, a[0]);
    	assertEquals(3, a[1]);
    	assertEquals(5, a[2]);
    	assertEquals(7, a[3]);
    	assertEquals(9, a[4]);
    }
  
    public void testSortReverseArray1() {
    	int[] a= {100, 98, 56, 35, 24};
    	sort(a);
    	assertEquals(24, a[0]);
    	assertEquals(35, a[1]);
    	assertEquals(56, a[2]);
    	assertEquals(98, a[3]);
    	assertEquals(100, a[4]);
    	
    }
    
    public void testSortRandomArray2() {
        int[] a = {9, 3, 7, 2, 8, 5, 1, 4, 6};
        sort(a);

        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(3, a[2]);
        assertEquals(4, a[3]);
        assertEquals(5, a[4]);
        assertEquals(6, a[5]);
        assertEquals(7, a[6]);
        assertEquals(8, a[7]);
        assertEquals(9, a[8]);
    }
    
    public void testSortWithLargeNumbers() {
        int[] a = {1000, 50000, 20000, 100000, 900, 45000};
        sort(a);

        assertEquals(900, a[0]);
        assertEquals(1000, a[1]);
        assertEquals(20000, a[2]);
        assertEquals(45000, a[3]);
        assertEquals(50000, a[4]);
        assertEquals(100000, a[5]);
    }
    
    public void testSortWithSmallNumbers() {
        int[] a = {-1000, -50000, -20000, -100000, -900, -45000};
        sort(a);

        assertEquals(-100000, a[0]);
        assertEquals(-50000, a[1]);
        assertEquals(-45000, a[2]);
        assertEquals(-20000, a[3]);
        assertEquals(-1000, a[4]);
        assertEquals(-900, a[5]);
    }
    
   
    
   
    public void testSortMixedValuesArray() {
   
        int[] a = {-5, 8, 0, -12, 4, -3};
        sort(a);

        
        assertEquals(-12, a[0]);
        assertEquals(-5, a[1]);
        assertEquals(-3, a[2]);
        assertEquals(0, a[3]);
        assertEquals(4, a[4]);
        assertEquals(8, a[5]);
    }
    
    public void testSortAlternatePositiveNegative() {
        int[] a = {5, -2, 8, -1, 9, -4};
        sort(a);
        
        
        assertEquals(-4, a[0]);
        assertEquals(-2, a[1]);
        assertEquals(-1, a[2]);
        assertEquals(5, a[3]);
        assertEquals(8, a[4]);
        assertEquals(9, a[5]);

    }
    
    public void testSortSimilarElements() {
        int[] a = {3, 5, 2, 7, 3, 8, 2, 5, 7};
        sort(a);

        assertEquals(2, a[0]);
        assertEquals(2, a[1]);
        assertEquals(3, a[2]);
        assertEquals(3, a[3]);
        assertEquals(5, a[4]);
        assertEquals(5, a[5]);
        assertEquals(7, a[6]);
        assertEquals(7, a[7]);
        assertEquals(8, a[8]);
    }
    
    public void testLargeNumberSort() {
        int[] a = {10000, 5000, 2000, 1000, 900, 450};
        sort(a);

        assertEquals(450, a[0]);
        assertEquals(900, a[1]);
        assertEquals(1000, a[2]);
        assertEquals(2000, a[3]);
        assertEquals(5000, a[4]);
        assertEquals(10000, a[5]);
    }
    
    public void testSortArrayRepeatElements() {
        int[] a = {4, 3, 2, 4, 3, 2};
        sort(a);

        assertEquals(2, a[0]);
        assertEquals(2, a[1]);
        assertEquals(3, a[2]);
        assertEquals(3, a[3]);
        assertEquals(4, a[4]);
        assertEquals(4, a[5]);
    }
    
    public void testSortNegativeZero() {
        int[] a = {-5, 0, -2, -1, -9, -4};
        sort(a);

        assertEquals(-9, a[0]);
        assertEquals(-5, a[1]);
        assertEquals(-4, a[2]);
        assertEquals(-2, a[3]);
        assertEquals(-1, a[4]);
        assertEquals(0, a[5]);
    }
    
    public void testSortArrayWithOneElement() {
        int[] a = {42};
        sort(a);

        assertEquals(42, a[0]);
    }
    
    public void testSortLargePosNeg() {
        int[] a = {100, -500, 200, -1000, 900, -450};
        sort(a);

        assertEquals(-1000, a[0]);
        assertEquals(-500, a[1]);
        assertEquals(-450, a[2]);
        assertEquals(100, a[3]);
        assertEquals(200, a[4]);
        assertEquals(900, a[5]);
    }
    
    public void testSortZeroes() {
        int[] a = {0, 0, 0, 0, 0, 0};
        sort(a);

        assertEquals(0, a[0]);
        assertEquals(0, a[1]);
        assertEquals(0, a[2]);
        assertEquals(0, a[3]);
        assertEquals(0, a[4]);
        assertEquals(0, a[5]);
    }
    
    public void testSortTwoRepeat() {
    	int[] a= {1,1};
    	sort(a);
    	assertEquals(1, a[0]);
        assertEquals(1, a[1]);
    }
    
    public void testSortAlternate() {
    	int[] a= {-1, 2,-3, 4, -5};
    	sort(a);
    	assertEquals(-5, a[0]);
        assertEquals(-3, a[1]);
        assertEquals(-1, a[2]);
        assertEquals(2, a[3]);
        assertEquals(4, a[4]);
    }
    
    public void testSortLarge() {
    	int[] a= {90000,50000,70000};
    	sort(a);
    	assertEquals(50000, a[0]);
        assertEquals(70000, a[1]);
        assertEquals(90000, a[2]);
        
    }
    
    public void testSortAllEqualLArge() {
        int[] a = {30000, 30000, 30000, 30000, 30000};
        sort(a);

        assertEquals(30000, a[0]);
        assertEquals(30000, a[1]);
        assertEquals(30000, a[2]);
        assertEquals(30000, a[3]);
        assertEquals(30000, a[4]);
    }
    
    public void testSortAlreadySorted() {
        int[] a = {3, 4, 5, 6, 7};
        sort(a);

        assertEquals(3, a[0]);
        assertEquals(4, a[1]);
        assertEquals(5, a[2]);
        assertEquals(6, a[3]);
        assertEquals(7, a[4]);
    }
  
  
    
  
//	public void testSortSortedArray() {
//		// Unsorted array.
//		createArray(it(11, 14, 8, 97, 82, 3));
//		sort();
//
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		// Sort array again.
//		sort();
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		// Print out list.
//		System.out.print("testSortSortedArray: ");
//		printList(sortedArray.getSortArray());
//	}
//
//	public void testSortIdenticalElements() {
//		createArray(it(1, 1, 1, 1, 1));
//		sort();
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		// Print out the list post sort.
//		System.out.print("testSortIdenticalElements: ");
//		printList(sortedArray.getSortArray());
//	}
//
//	public void testSortEmptyArray() {
//		createArray(it());
//		sort();
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		// Print out the list post sort.
//		System.out.print("testSortEmptyArray: ");
//		printList(sortedArray.getSortArray());
//	}
//	
//	public void testSortUnsortedArray01() {
//		createArray(it(12, 1));
//		sort();
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		// Print out the list post sort.
//		System.out.print("testSortUnsortedArray01: ");
//		printList(sortedArray.getSortArray());
//	}
//	
//    public void testSortUnsortedArray06() {
//        createArray(it(5, 3, 8, 6, 2));
//        sort();
//        assertEquals(true, isSorted(sortedArray.getSortArray()));
//        
//        // Print out the list post sort.
//        System.out.print("testSortUnsortedArray06: ");
//        printList(sortedArray.getSortArray());
//    }
//
//    public void testSortUnsortedArray07() {
//        createArray(it(10, -2, -4, 5, 1));
//        sort();
//        assertEquals(true, isSorted(sortedArray.getSortArray()));
//        
//        // Print out the list post sort.
//        System.out.print("testSortUnsortedArray07: ");
//        printList(sortedArray.getSortArray());
//    }
//
//    public void testSortUnsortedArray08() {
//        createArray(it(-7, -12, -14, 0, -3, -250, -5, 100));
//        sort();
//        assertEquals(true, isSorted(sortedArray.getSortArray()));
//        
//        // Print out the list post sort.
//        System.out.print("testSortUnsortedArray08: ");
//        printList(sortedArray.getSortArray());
//    }
//
//    public void testSortUnsortedArray09() {
//        createArray(it(9, 8, 7, 6, 5, 4, 3, 2, 1));
//        sort();
//        assertEquals(true, isSorted(sortedArray.getSortArray()));
//        
//        // Print out the list post sort.
//        System.out.print("testSortUnsortedArray09: ");
//        printList(sortedArray.getSortArray());
//    }
//
//    public void testSortUnsortedArray10() {
//        createArray(it(1000, 500, 250, 125, 100, 50, 400, 1200, 25));
//        sort();
//        assertEquals(true, isSorted(sortedArray.getSortArray()));
//        
//        // Print out the list post sort.
//        System.out.print("testSortUnsortedArray10: ");
//        printList(sortedArray.getSortArray());
//    }
//
//	public void testSortEvenLengthArray() {
//		// TODO Auto-generated method stub
//		createArray(it(400, 300, 200, 100));
//		sort();
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		System.out.print("testSortEvenLengthArray: ");
//        printList(sortedArray.getSortArray());
//	}
//
//	public void testSortOddLengthArray() {
//		// TODO Auto-generated method stub
//		createArray(it(500, 400, 300, 200, 100));
//		sort();
//		assertEquals(true, isSorted(sortedArray.getSortArray()));
//		
//		System.out.print("testSortOddLengthArray: ");
//        printList(sortedArray.getSortArray());
//	}
//    

//    
//    // Converted print code from the paper.
//    /**
//     * This prints the passed in list in a reasonable manner.
//     * @param int array. May be null.
//     */
//    public void printList(int[] data) {
//        for (int datum : data) {
//            System.out.print(datum + " ");
//        }
//        
//        System.out.println();
//    }
}
