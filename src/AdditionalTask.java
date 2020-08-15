public class AdditionalTask {

    public static int sumOfNum(int num) {
        int result = 0;
        while (num != 0) {
            result = result + (num % 10);
            num = num / 10;
        }
        return result;
    }

    public static int recurSumOfNum(int num) {
        if (num / 10 > 0) {
            int temp = num % 10;
            int remain = num / 10;
            return temp + recurSumOfNum(remain);
        } else {
            return num;
        }
    }

    public static void reverseNum(int num) {
        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }

    public static void recurReverseNum(int num) {
        if (num / 10 > 0) {
            System.out.print(num % 10);
            recurReverseNum(num / 10);
        } else {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(1234));
        System.out.println(recurSumOfNum(1234));
        reverseNum(1234);
        System.out.println(" ");
        recurReverseNum(1234);
    }
}
