package com.web.entity;

/**
 * Created by location on 9/28/17
 *
 *    井队整体信息类：
 *
 */
public class DrillMessage {

    //井号
    private String drillNumber;
    //工况
    private String workingCondition;
    //井深
    private double drillLength;
    //钻位
    private double drillLocation;
    //钻压
    private double drillPassure;
    //扭矩
    private double torque;
    //钻速
    private double drillSpeed;
    //立压
    private double standPipePressure;
    //泵速1
    private double pumpSpeed1;
    //泵速2
    private double pumpSpeed2;
    //泵速3
    private double pumpSpeed3;
    //昨日工况
    private String yesCondition;
    //昨日钻进
    private String yesDrillLength;
    //预计明天工况
    private String tomCondition;

    public String getDrillNumber() {
        return drillNumber;
    }

    public void setDrillNumber(String drillNumber) {
        this.drillNumber = drillNumber;
    }

    public String getWorkingCondition() {
        return workingCondition;
    }

    public void setWorkingCondition(String workingCondition) {
        this.workingCondition = workingCondition;
    }

    public double getDrillLength() {
        return drillLength;
    }

    public void setDrillLength(double drillLength) {
        this.drillLength = drillLength;
    }

    public double getDrillLocation() {
        return drillLocation;
    }

    public void setDrillLocation(double drillLocation) {
        this.drillLocation = drillLocation;
    }

    public double getDrillPassure() {
        return drillPassure;
    }

    public void setDrillPassure(double drillPassure) {
        this.drillPassure = drillPassure;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getDrillSpeed() {
        return drillSpeed;
    }

    public void setDrillSpeed(double drillSpeed) {
        this.drillSpeed = drillSpeed;
    }

    public double getStandPipePressure() {
        return standPipePressure;
    }

    public void setStandPipePressure(double standPipePressure) {
        this.standPipePressure = standPipePressure;
    }

    public double getPumpSpeed1() {
        return pumpSpeed1;
    }

    public void setPumpSpeed1(double pumpSpeed1) {
        this.pumpSpeed1 = pumpSpeed1;
    }

    public double getPumpSpeed2() {
        return pumpSpeed2;
    }

    public void setPumpSpeed2(double pumpSpeed2) {
        this.pumpSpeed2 = pumpSpeed2;
    }

    public double getPumpSpeed3() {
        return pumpSpeed3;
    }

    public void setPumpSpeed3(double pumpSpeed3) {
        this.pumpSpeed3 = pumpSpeed3;
    }

    public String getYesCondition() {
        return yesCondition;
    }

    public void setYesCondition(String yesCondition) {
        this.yesCondition = yesCondition;
    }

    public String getYesDrillLength() {
        return yesDrillLength;
    }

    public void setYesDrillLength(String yesDrillLength) {
        this.yesDrillLength = yesDrillLength;
    }

    public String getTomCondition() {
        return tomCondition;
    }

    public void setTomCondition(String tomCondition) {
        this.tomCondition = tomCondition;
    }

    @Override
    public String toString() {
        return "DrillMessage{" +
                "drillNumber='" + drillNumber + '\'' +
                ", workingCondition='" + workingCondition + '\'' +
                ", drillLength=" + drillLength +
                ", drillLocation=" + drillLocation +
                ", drillPassure=" + drillPassure +
                ", torque=" + torque +
                ", drillSpeed=" + drillSpeed +
                ", standPipePressure=" + standPipePressure +
                ", pumpSpeed1=" + pumpSpeed1 +
                ", pumpSpeed2=" + pumpSpeed2 +
                ", pumpSpeed3=" + pumpSpeed3 +
                ", yesCondition='" + yesCondition + '\'' +
                ", yesDrillLength='" + yesDrillLength + '\'' +
                ", tomCondition='" + tomCondition + '\'' +
                '}';
    }

}
