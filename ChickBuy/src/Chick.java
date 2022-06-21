public class Chick {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            for(int j=0;j<=33;j++){
                for(int k=0;k<300;k++){
                    if(((5*i+3*j+k/3==100)&&(i+j+k==100))&&(k%3==0)){
                        System.out.println("cock:"+i+", hen:"+j+", chickens:"+k);
                    }
                }
            }
        }
    }
}
