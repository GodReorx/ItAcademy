package Parking;

import Commands.Command;

public class ParkingControl {
    private Command slotC1;
    private Command slotC2;
    private Command slotC3;
    private Command slotC4;
    private Command slotB1;
    private Command slotB2;
    private Command slotB3;
    private Command slotB4;
    private Command slotS1;
    private Command slotS2;
    private Command slotS3;
    private Command slotS4;
    private Command slotP1;
    private Command slotP2;
    private Command slotP3;
    private Command slotP4;
    private Command slotUndo;

    //Commands for every vehicle
    public void useSlotC1(){
        slotC1.execute();
        slotUndo = slotC1;
    }
    public void useSlotC2(){
        slotC2.execute();
        slotUndo = slotC2;
    }
    public void useSlotC3(){
        slotC3.execute();
        slotUndo = slotC3;
    }
    public void useSlotC4(){
        slotC4.execute();
        slotUndo = slotC4;
    }
    public void useSlotB1(){
        slotB1.execute();
        slotUndo = slotB1;
    }
    public void useSlotB2(){
        slotB2.execute();
        slotUndo = slotB2;
    }
    public void useSlotB3(){
        slotB3.execute();
        slotUndo = slotB3;
    }
    public void useSlotB4(){
        slotB4.execute();
        slotUndo = slotB4;
    }
    public void useSlotS1(){
        slotS1.execute();
        slotUndo = slotS1;
    }
    public void useSlotS2(){
        slotS2.execute();
        slotUndo = slotS2;
    }
    public void useSlotS3(){
        slotS3.execute();
        slotUndo = slotS3;
    }
    public void useSlotS4(){
        slotS4.execute();
        slotUndo = slotS4;
    }
    public void useSlotP1(){
        slotP1.execute();
        slotUndo = slotP1;
    }
    public void useSlotP2(){
        slotP2.execute();
        slotUndo = slotP2;
    }
    public void useSlotP3(){
        slotP3.execute();
        slotUndo = slotP3;
    }
    public void useSlotP4(){
        slotC4.execute();
        slotUndo = slotP4;
    }
    public void useSlotUndo(){
        System.out.print("Undo use:");
        slotUndo.undo();
    }

    //Getters and Setters
    public Command getSlotC1() {
        return slotC1;
    }

    public void setSlotC1(Command slotC1) {
        this.slotC1 = slotC1;
    }

    public Command getSlotC2() {
        return slotC2;
    }

    public void setSlotC2(Command slotC2) {
        this.slotC2 = slotC2;
    }

    public Command getSlotC3() {
        return slotC3;
    }

    public void setSlotC3(Command slotC3) {
        this.slotC3 = slotC3;
    }

    public Command getSlotB1() {
        return slotB1;
    }

    public void setSlotB1(Command slotB1) {
        this.slotB1 = slotB1;
    }

    public Command getSlotB2() {
        return slotB2;
    }

    public void setSlotB2(Command slotB2) {
        this.slotB2 = slotB2;
    }

    public Command getSlotB3() {
        return slotB3;
    }

    public void setSlotB3(Command slotB3) {
        this.slotB3 = slotB3;
    }

    public Command getSlotS1() {
        return slotS1;
    }

    public void setSlotS1(Command slotS1) {
        this.slotS1 = slotS1;
    }

    public Command getSlotS2() {
        return slotS2;
    }

    public void setSlotS2(Command slotS2) {
        this.slotS2 = slotS2;
    }

    public Command getSlotS3() {
        return slotS3;
    }

    public void setSlotS3(Command slotS3) {
        this.slotS3 = slotS3;
    }

    public Command getSlotP1() {
        return slotP1;
    }

    public void setSlotP1(Command slotP1) {
        this.slotP1 = slotP1;
    }

    public Command getSlotP2() {
        return slotP2;
    }

    public void setSlotP2(Command slotP2) {
        this.slotP2 = slotP2;
    }

    public Command getSlotP3() {
        return slotP3;
    }

    public void setSlotP3(Command slotP3) {
        this.slotP3 = slotP3;
    }

    public Command getSlotUndo() {
        return slotUndo;
    }

    public void setSlotUndo(Command slotUndo) {
        this.slotUndo = slotUndo;
    }

    public Command getSlotC4() {
        return slotC4;
    }

    public void setSlotC4(Command slotC4) {
        this.slotC4 = slotC4;
    }

    public Command getSlotB4() {
        return slotB4;
    }

    public void setSlotB4(Command slotB4) {
        this.slotB4 = slotB4;
    }

    public Command getSlotS4() {
        return slotS4;
    }

    public void setSlotS4(Command slotS4) {
        this.slotS4 = slotS4;
    }

    public Command getSlotP4() {
        return slotP4;
    }

    public void setSlotP4(Command slotP4) {
        this.slotP4 = slotP4;
    }
}
