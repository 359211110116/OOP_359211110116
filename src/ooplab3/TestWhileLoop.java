package ooplab3;

public class TestWhileLoop {
    public static void main(String[] args) {
        //While
        int i = 1;
        while (i<=100){
            if (i%3==0&&i%5==0)
            System.out.println(i+" ");
            i++;
        }//while
//        do While
        System.out.println();
        int j = 1;
        do{
            if (j%3==0&&j%5==0)
                System.out.println(j+" ");
        }while (++j<=100);
    }//main




}//class
