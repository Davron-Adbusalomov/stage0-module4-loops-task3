package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first>second){
            int greatest=1;
            for(int i=2; i<=second; i++){
                if(first%i==0 && second%i==0){
                    greatest=i;
                }
            }
            System.out.println(greatest);
        }
        else{
            int greatest=1;
            for(int i=2; i<=first; i++){
                if(first%i==0 && second%i==0){
                    greatest=i;
                }
            }
            System.out.println(greatest);
        }
    }
}
