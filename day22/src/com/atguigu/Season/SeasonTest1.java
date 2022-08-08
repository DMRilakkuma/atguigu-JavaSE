package com.atguigu.Season;

/**
 * @author shkstart
 * @create 2022-03-18 14:18
 */
public class SeasonTest1 {
    public static void main(String[] args) {


        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            values[i].show();
        }
    }
}

interface info {
    void show();
};

enum Season1 implements info {


    SPRING("春天", "春日花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },

    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("秋天", "秋风肖爽") {
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER("冬天", "冰天雪地") {
        @Override
        public void show() {
            System.out.println("冬天在哪里");
        }
    };


    private final String seasonName;
    private final String sensonDesc;


    private Season1(String seasonName, String sensonDesc) {
        this.seasonName = seasonName;
        this.sensonDesc = sensonDesc;
    }


    public String getSeasonName() {
        return seasonName;
    }

    public String getSensonDesc() {
        return sensonDesc;
    }


}

