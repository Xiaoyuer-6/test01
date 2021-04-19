
链接：https://www.nowcoder.com/questionTerminal/200d8d789f9f431999fac795bb094356
        来源：牛客网

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int retExclusive = 0;
            for (int i = 0; i <n ; i++) {
                retExclusive^=arr[i];
            }
            int index = findIndex(retExclusive);
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i <n ; i++) {
                if (judgeIndex(arr[i],index)){
                    num1^=arr[i];
                }else{
                    num2^=arr[i];
                }
            }
            if (num1<num2){
                System.out.println(num1+" "+num2);
            }else{
                System.out.println(num2+ " " + num1);
            }
        }
    }
    public static int findIndex(int num){
        //在整数num中找到最右边是1的位置
        int index = 0;
        while ((num&1)==0){
            num>>=1;
            index++;
        }
        return index;
    }
    public static boolean judgeIndex(int num,int index){
        //判断整数num右边第num位是否为1
        num>>=index;
        return ((num&1)==1);
    }
}
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HuYu
// * Date: 2021-04-17
// * Time: 23:03
// */
////public class TestDemo {
//import java.util.*;
//
//public class Main2 {
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//        arr[i] = sc.nextInt();
//        }
//         int retExclusive = 0;
//         for (int i = 0; i <n ; i++) {
//                        retExclusive^=arr[i];
//                    }
//                    int index = findIndex(retExclusive);
//        int num1 = 0;
//                    int num2 = 0;
//                    for (int i = 0; i <n ; i++) {
//                        if (judgeIndex(arr[i],index)){
//                            num1^=arr[i];
//                        }else{
//                            num2^=arr[i];
//                        }
//                    }
//                    if (num1<num2){
//                        System.out.println(num1+" "+num2);
//                    }else{
//                        System.out.println(num2+ " " + num1);
//                    }
//                }
//                }
//                public static int findIndex(int num){
//                //在整数num中找到最右边是1的位置
//                int index = 0;
//                while ((num&1)==0){
//                    num>>=1;
//                    index++;
//                }
//                return index;
//                }
//                public static boolean judgeIndex(int num,int index){
//                //判断整数num右边第num位是否为1
//                num>>=index;
//                return ((num&1)==1);
//                }
//        }

    //private  static int x= 100;

//    public static void main5(String[] args) {
//        TestDemo testDemo1 = new TestDemo();
//        testDemo1.x++;
//        TestDemo testDemo2 = new TestDemo();
//        testDemo2.x++;
//        testDemo1 = new TestDemo();
//        testDemo1.x++;
//        TestDemo.x--;
//        System.out.println("x="+x);

  }
//}

//        public TestDemo(String s) {
//            System.out.print("B");
//        }
//
//        public static class Derived extends  TestDemo {
//            public Derived(String s) {
//                super(s);
//                System.out.print("D");
//            }
//            public static void main(String[] args) {
//                new Derived("C");
//            }
//        }
//    }

//        public TestDemo(String s){
//            System.out.print("B");
//        }
//    }
//    public class  Derived extends TestDemo{
//        public Derived (String s) {
//            super(s);
//            System.out.print("D");
//        }
//
//        public static void main(String[] args){
//            new Derived("C");
//        }
    //}
//        private String name = "TestDemo";
//        int age=0;
//
//    }
//    public class Child extends TestDemo{
//        public String grade;
//        public static void main(String[] args){
//            TestDemo p = new Child();
//            System.out.println(p.name);
//        }
  //  }

//    public int aMethod(){
//    static int i = 0;
//    i++;
//return i;
//}

//    public static void main3(String args[]){
//        TestDemo test = new TestDemo();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//    public static void main2(String[] args) {
//        int x,y;
//        x=5>>2;
//        y=x>>>2;
//        System.out.println(y);
//    }
//    public static void main1(String[] args) {
//        String s;
//        System.out.println("s=");
//    }
