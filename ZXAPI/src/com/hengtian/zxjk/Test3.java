package demo;
  
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  
public class Test3 {
      
    /*
     * 输入字符串长度，字符串比如“3，1，2，4”,m值
     * 所输入的字符串数字都是大于0
     * 要求从左往右循环计数，数到m就将第m个元素出列，然后将出列的元素值赋给m
     * 如此进行直到所有元素都出列
     * */
  
    private static final int ZERO = 0;
  
    /**
     * @param args
     */
    public static void main(String[] args) {
  
        System.out.println("请输入字符串长度");
        Scanner sc1 = new Scanner(System.in);
        Integer.parseInt(sc1.next());
  
        System.out.println("请输入字符串 比如\"3,1,2,4\"");
        Scanner sc2 = new Scanner(System.in);
        String str = sc2.next();
        // 将字符串装入list中
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < str.split(",").length; i++) {
            list.add(Integer.parseInt(str.split(",")[i]));
        }
  
        System.out.println("请输入M值");
        Scanner sc3 = new Scanner(System.in);
        int mValue = Integer.parseInt(sc3.next());
  
        // System.out.println(strLength + str + mValue);
  
        process(list, mValue);
    }
  
    public static void process(List<Integer> list, int mValue) {
  
        int list_size = list.size();// 列表长度
        if (list_size > 1) {
            // mValue与列表长度求模,从list表中取出的元素
            int index = mValue % list_size;// list表中第index个元素
            int ys = 0;
  
            int offset = 0;// index和列表长度之差
            int new_mValue = 0;
            if (ZERO != index) {
                // ys=list.get(index);
                ys = list.remove(index - 1);
                System.out.print(ys+" ");
                offset = list_size - index;
                new_mValue = ys - offset;
                if (new_mValue <= 0) {
                    new_mValue = index -1+ ys;
                }
            } else {
                // ys=list.get(list_size);
                ys = list.remove(list_size - 1);
                System.out.print(ys+" ");
                new_mValue = ys;
            }
  
            // 递归
            process(list, new_mValue);
        } else {
            System.out.print(list.get(list_size - 1)+" ");
        }
    }
}
