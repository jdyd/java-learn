package com.example.util;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * @Auther: cuijian05
 * @Date: 2020/8/28
 * @Description:
 */
public class SortUtils{

    public static void println( int[] arr ){
        if( ArrayUtils.isNotEmpty( arr ) ){
            Arrays.stream( arr ).forEach( System.out::println );
        }
    }

    public static void swap( int[] arr, int i, int j ){
        int temp = arr[ i ];
        arr[ i ] = arr[ j ];
        arr[ j ] = temp;
    }
}
