import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author davis you
 * @Date 2022/11/15 10:11 PM
 * @Version 1.0
 */
public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的长度: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.println("请输入数组的第" + (i+1) + "元素:");
            array[i] = scanner.nextInt();
        }
        printArray("未排序之前：", array);
        Arrays.sort(array);
        printArray("排序之后：", array);

        // 下面是排序逻辑
        for (int i = 0; i < arraySize; i++) {
            for (int j = i; j < arraySize; j++) {


            }
        }
    }

    /**
     * 剥离出打印方法 以便代码复用
     * @param text
     * @param array
     */
    public static void printArray(String text, int[] array){
        System.out.printf(text);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] +" ");
        }
    }

}
