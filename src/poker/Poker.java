package poker;

import java.util.LinkedList;
import java.util.Random;

// 扑克类
class Poker {

    String color;// 花色
    String num;// 点数

    // 构造方法,对象（扑克）的实例化
    public Poker(String color, String num) {
        super();
        this.color = color;
        this.num = num;
    }

    // 重写toString()
    @Override
    public String toString() {
        return color+num;
    }

}


