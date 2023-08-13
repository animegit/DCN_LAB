import java.util.*;
class Leaky{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of bucket :-");
    int bucketSize=sc.nextInt();
    System.out.println("Enter the number of incoming packets:- ");
    int input=sc.nextInt();
    System.out.println("Enter the output size:-");
    int output=sc.nextInt();
    int buffer=0;

    System.out.println("Enter the Num of iterations:-");
    int itr=sc.nextInt();
    for(int i=0;i<itr;i++){

      int rem=bucketSize-buffer-input;
      if(rem>=0){

        buffer+=input;
        System.out.println("Packets Accepted! Present Buffer Size:- "+buffer);
      }
      else{

        System.out.println("Pakcets Dropped!!!");
      }
      buffer-=output;
      if(buffer<0){
      buffer=0;}
    }


  }

}
