package app;

public class Main {
    public static void main(String[] args) {

        int[] numArr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int numeration = 1;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
            System.out.println(numeration + ") Num is " + numArr[i] + ", sum is " + sum);
            numeration++;
        }
        System.out.println("------------------------\nSum of numbers is " + sum);
    }
}
//------------ another way ------------------------
//        for (int num : numArr) {
//            sum += num;
//            System.out.println(numeration + ") Num is " + num + ", sum is " + sum);
//            numeration++;
//        }
//        System.out.println("------------------------\nSum of numbers is " + sum);
//    }
//}