package MyArray;


import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {

    public static void main(String[] args) {
//        System.out.println("Hello");
        demoArray arr=new demoArray();
//        arr.arr();
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);

        //array is non primitive
//        shallow copy,array is non primitive
        //deep copy-> arr.clone()
        //deep clone
        int [] arr1={1,2,3};
        int [] arr2=arr1.clone();
        int [] arr3= Arrays.copyOf(arr1,arr1.length);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);




    }

}
 class demoArray{
    void arr(){
        int [] ages=new int[5];
        int name[] =new int[3];
        int [] arr={1,2,3,4};
        System.out.println((arr[2]));
        System.out.println(ages[2]);//0
        System.out.println(name[2]);//0
//        System.out.println(name[9]);//error
        float[] cost=new float[3];
        String[] names={"surjeet","hello"};


        int[][] arr_2d={{1,2,3},{1,2},{1,2,3}};
        System.out.println(arr_2d[1][1]);//2

        int [][] marr=new int[3][3];

        //length
        System.out.println(arr_2d.length);//3 num of row

        //for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        //for each
        for(int val:arr){
            System.out.print(val);
        }
        //while
        int i=0;
        while(i<3){
            System.out.println(i);
            i++;
        }
        System.out.println(Math.max(2,3));
        int a=2,b=3;


    }
 }

