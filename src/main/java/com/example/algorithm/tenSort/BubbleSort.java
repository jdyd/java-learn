package com.example.algorithm.tenSort;

import com.example.util.SortUtils;
import org.junit.Test;

/**
 * @Auther: cuijian05
 * @Date: 2020/8/28
 * @Description: 冒泡排序
 * 1）描述
 * 比较两个相邻元素的关键值，如果反序，则交换。若按升序排序，每一趟将被扫描的数据序列中的最大元素交换到最后位置，就像气泡从水里冒出一样。
 * 2）复杂度分析
 * <p>
 * 时间复杂度:  o(n)~o(n * n)
 * 空间复杂度:  o(1)
 * <p>
 * <p>
 * 稳定性
 * <p>
 * 稳定
 */
public class BubbleSort{

    @Test
    public void test(){
        int[] arr = new int[]{ 5, 1, 8, 2, 3, 4, 6, 7 };
        bubbleSort( arr );
        SortUtils.println( arr );
    }

    private void bubbleSort( int[] arr ){
        int size = arr.length;
        for( int i = 0; i < size - 1; i++ ){
            for( int j = 0; j < size - i - 1; j++ ){
                if( arr[ j ] > arr[ j + 1 ] ){
                    SortUtils.swap( arr, j, j + 1 );
                }
            }
        }
    }
}
