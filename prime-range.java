import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        
        for(int i=s;i<=e;++i){
            boolean flag = false;
            for(int f=2;f<=i/2;++f){
                if(i%f == 0){
                    flag = true;
                    break;
                }
               
            }
             if(flag==false){
                System.out.println(i);
                }
        
         
            
        }
           
    }
}
