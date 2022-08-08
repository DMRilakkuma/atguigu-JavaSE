package com.atguigu.Season;

/**
 * @author shkstart
 * @create 2022-03-18 11:42
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        Season spring = Season.SPRING;
        System.out.println(autumn);

        System.out.println();

        System.out.println();
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        System.out.println();
    }

}

class Season {
    private final String seasonName;
    private final String sensonDesc;


    public Season(String seasonName, String sensonDesc) {
        this.seasonName = seasonName;
        this.sensonDesc = sensonDesc;
    }

    public static final Season SPRING = new Season("春天","春日花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋风肖爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSensonDesc() {
        return sensonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", sensonDesc='" + sensonDesc + '\'' +
                '}';
    }
}
