import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[10];
        int[] prefixSum=new int[10];
        for (int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        prefixSum[0]=array[0];
        System.out.println(prefixSum[0]);
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+array[i];
            System.out.println(prefixSum[i]);
        }

    }
}
