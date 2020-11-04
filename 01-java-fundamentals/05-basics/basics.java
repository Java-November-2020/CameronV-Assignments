import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
        
        for(int i = 0; i<= 255; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 255; i++){
            if ( i % 2 != 0) {
                System.out.println(i);
            }
        }

        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println(i);
            System.out.println(sum);

        }

        int[] x = {1,3,5,7,9,13};
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

        Integer[] a = {1,2,3,4,-5,-6};
        int max = 0;
        for( int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        System.out.println("max num of array is: " + max);
        }
        
        Integer[] a = {1,2,3,4,5,6};
        int sum = 0;
        
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        int avg = sum/a.length;
        System.out.println(avg);

        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++){
            if (i % 2 != 0){
                odd.add(i);
            }
        }
        System.out.println(odd);

        Integer[] greater = {1,2,3,4,5,6};
        int y = 4;
        int x = 0;
        for (int i = 0; i < greater.length+1; i++){
            if (i > y){
                x ++;
            }
        }
        System.out.println(x);

        int[] sqr = {1,2,3,4,5};
        for (int i = 0; i < sqr.length; i++){
            sqr[i] = sqr[i] * sqr[i];
        }
        
        int[] negatives = {-1,-2,-3,4,5,6};
        for (int i = 0; i < negatives.length; i++){
            if( negatives[i]<0){
                negatives[i]=0;
            }
        }

        int[] shift = {0,1,2,3,4,5};
        for (int i = 0; i < shift.length; i++){
            shift[i] = shift[i+1];
        }

    }
}