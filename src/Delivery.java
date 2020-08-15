public class Delivery {

    public static int routs(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * routs(--num);
        }
    }

        public static void main (String[]args){
            System.out.println(routs(5));
        }

    }