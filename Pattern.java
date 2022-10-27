public class Pattern {
    public static void T(int num) {
        for(int i = 1;i<=num;i++){
            for (int j = 1; j <=num; j++) {
                if(i==1||j==(num+1)/2){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void E(int num) {
        for(int i = 1;i<=num;i++){
            for (int j = 1; j <=num; j++) {
                if(i==1||j==1 || i==num || i==(num+1)/2){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void L(int num) {
        for(int i = 1;i<=num;i++){
            for (int j = 1; j <=num; j++) {
                if(j==1||i==num ){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void U(int num) {
        for(int i = 1;i<=num;i++){
            for (int j = 1; j <=num; j++) {
                if(j==1||j==num ||i==num ){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void S(int num) {
        for(int i = 1;i<=num;i++){
            for (int j = 1; j <=num; j++) {
                if(i==1 || i==num || i==(num+1)/2|| j==1&&i<=(num+1)/2 || j==num&&i>=(num+1)/2 )   {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void K(int num) {
        for(int i = 1;i<=num;i++){
            int mid = (num+1)/2;
            for (int j = 1; j <=num; j++) {
                if(j==1 ||i==mid && j<=mid || i+j==num+1&& i<=3 || i==j && i>=3)   {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void O(int num) {
        for(int i = 1;i<=num;i++){
           
            for (int j = 1; j <=num; j++) {
                if(j==1 || j==num ||i==1 ||i==num)   {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void I(int num) {
        for(int i = 1;i<=num;i++){
            int mid = (num+1)/2;
            for (int j = 1; j <=num; j++) {
                if(j==mid)   {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void N(int num) {
        for(int i = 1;i<=num;i++){
            int mid = (num+1)/2;
            for (int j = 1; j <=num; j++) {
                if(j==1 || j==num || i==j)   {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void R(int num) {
        for(int i = 1;i<=num;i++){
            int mid = (num+1)/2;
            for (int j = 1; j <=num; j++) {
                if(j==1 || i==1 || i == mid || j==num && i<=mid || i==j && i>=mid)   {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
     
      String name = "TELUSKO INEURON";
      for(int i = 0;i<name.length();i++){
        char c = name.charAt(i);
        switch (c) {
            case 'T':
                T(num);
                System.out.println();
                break;
            case 'E':
                E(num);
                System.out.println();
                break;
            case 'L':
                L(num);
                System.out.println();
                break;
            case 'U':
                U(num);
                System.out.println();
                break;
            case 'S':
                S(num);
                System.out.println();
                break;
            case 'K':
                K(num);
                System.out.println();
                break;
            case 'O':
                O(num);
                System.out.println();
                break;
            case 'I':
                I(num);
                System.out.println();
                break;
            case 'N':
                N(num);
                System.out.println();
                break;
            case 'R':
                R(num);
                System.out.println();
                break;
            case ' ':
                System.out.println("--------------------------------");
                System.out.println();
                break;
                
            default:
                break;
           }
      }
      
     
    }
}
 