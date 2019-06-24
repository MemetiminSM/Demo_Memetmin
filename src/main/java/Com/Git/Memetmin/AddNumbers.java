package Com.Git.Memetmin;

public class AddNumbers {
    public static void main(String[] args){

        int sum = 0;
        for(int i = 1; i < 1001; i++){
            sum += i;
            System.out.println(String.format("Sum : %d for %d ",sum,i));
        }

    }
}
