package com.web.entity;

/**
 * Created by location on 9/28/17
 *
 *      钻具组合信息
 */
public class DrillAssembly {

    //钻具序号
    private int num;
    //钻具名称
    private String drillName;
    //钻具数据1
    private String numberOne;
    //钻具数据2
    private String numberTwo;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDrillName() {
        return drillName;
    }

    public void setDrillName(String drillName) {
        this.drillName = drillName;
    }

    public String getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(String numberOne) {
        this.numberOne = numberOne;
    }

    public String getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(String numberTwo) {
        this.numberTwo = numberTwo;
    }

    @Override
    public String toString() {
        return "DrillAssembly{" +
                "num=" + num +
                ", drillName='" + drillName + '\'' +
                ", numberOne='" + numberOne + '\'' +
                ", numberTwo='" + numberTwo + '\'' +
                '}';
    }
}
