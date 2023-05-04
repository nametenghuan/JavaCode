package main.java.niuke.erfen;

/**
 * 要尊重编程
 *
 * @Author: 庞欢腾
 * @Date: 2023/4/28
 * @Description: JavaCode
 */
public class BM17二分查找1 {

    public static void main(String[] args) {

    }

    public static int search(int[] sour, int tag) {
        if (sour.length == 0) {
            return -1;
        }
        int low = 0;
        int high = sour.length - 1;
        int mid = 0;
        while (low <= high) {
            // 计算出中间下标值
            mid = (low + high) / 2;
            // 判断tag是在中间值右侧吗？
            if (tag > sour[mid]) {
                low = mid + 1;
            }
            // 判断tag是在中间值左侧吗？
            if (tag < sour[mid]) {
                high = mid - 1;
            }
            if (tag == sour[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
