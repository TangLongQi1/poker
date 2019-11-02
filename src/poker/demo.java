package poker;

import java.util.LinkedList;
import java.util.Random;

class Demo {

    public static void main(String[] args) {
        //实例化集合对象
        LinkedList pockers=createPoker();
        //flushPockes(pockers);//洗牌
        showPoker(pockers);//显示多少张牌

    }

    //生成扑克牌的方法
    public  static LinkedList createPoker(){
        //该集合用于存储扑克对象
        LinkedList list=new LinkedList();
        //定义数组存储所有的花色和点数
        String[] colors={"黑色","红桃","梅花","方块"};
        String[] nums={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //添加集合中扑克牌
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<colors.length;j++){
                list.add(new Poker(colors[j],nums[i]));
            }
        }
        return list;
    }

    /*洗牌的功能
    public static void flushPockes(LinkedList pockers){
        //创建随机对象
        Random random=new Random();
        for(int i=0;i<100;i++){
            //随机产生两个索引值
            int a=random.nextInt(pockers.size());
            int b=random.nextInt(pockers.size());
            //根据索引值取出两张牌
            Poker a1= (Poker) pockers.get(a);
            Poker b1= (Poker) pockers.get(b);
            pockers.set(a, b1);
            pockers.set(b, a1);
        }
    }*/

    //显示扑克牌
    public static void showPoker(LinkedList pockers){
        for(int i=0;i<pockers.size();i++){
            System.out.print("  "+pockers.get(i));
            //换行
            if(i%10==9){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("牌数:"+pockers.size());//显示多少张牌
    }

}