package mypoker;

public class Poker {
    String[] num={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[] color={"红桃","梅花","方块","黑桃"};
    public void print(){
        for (int i=0;i<num.length;i++){
            for (int j=0;j<color.length;j++){
                System.out.println(color[j]+num[i]);
            }
        }
    }
}
