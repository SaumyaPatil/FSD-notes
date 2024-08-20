import java.math.BigInteger;
import java.util.Scanner;

public class Question_16_08_2024 {

//    public void commonElementInArrays(int arr1[], int arr2[], int arr3[]){
//        int size1 = arr1.length;
//        int size2 = arr2.length;
//        int size3 = arr3.length;
//        int i=0, j=0, k=0;
//        while (i<size1 && j<size2 && k<size3){
//            if ((arr1[i] < arr3[k] && arr2[j] < arr3[k])){
//                i++;
//                j++;
//            } else if (arr2[j] < arr1[i] && arr3[k] < arr1[i]) {
//                j++;
//                k++;
//            } else if (arr1[i] < arr2[j] && arr3[k] < arr2[j]) {
//                i++;
//                k++;
//            } else if (arr1[i]<arr2[j] && arr1[i]<arr3[k] && arr2[j]==arr3[k]) {
//                i++;
//            } else if (arr2[j]<arr1[i] && arr2[j]<arr3[k] && arr1[i]==arr3[k]) {
//                j++;
//            } else if (arr3[k]<arr2[j] && arr3[k]<arr1[i] && arr2[j]==arr1[i]) {
//                k++;
//            } else if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                System.out.print(arr1[i]+" ");
//                i++;
//                j++;
//                k++;
//            }
//        }
//    }

    public void factorialOfANumber(int num){
        BigInteger ans = new BigInteger("1");
        BigInteger itr = new BigInteger("2");
        BigInteger bigProduct = new BigInteger("");

        for (int i=2; i<=num; i++){
            bigProduct = ans.multiply(itr);
        }
        System.out.println(bigProduct);
    }

    public static void main(String[] args) {
        //Q1. Write a program to find common element in three sorted arrays.
        int arr1[] = {5, 9, 7, 10, 20, 30};
        int arr2[] = {4, 5, 6, 7, 8, 9};
        int arr3[] = {5, 6, 7, 8, 9, 10};

//        SearchingAnELement obj = new SearchingAnELement();
//        obj.commonElementInArrays(arr1, arr2, arr3);

        //Q2. Write a program to find factorial of larger number.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        obj.factorialOfANumber(num);

        //Q3. Write

    }
}
