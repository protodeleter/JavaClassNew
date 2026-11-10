//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import ArrayOfPoints.ArrayOfPoints;
import ArrayOfPoints.TestArrayOfPoints;
import ClassWorks.WorkerExe;
import Exercises.Counter;
import Exercises.Ex2_2A;
import Point.Point;

import java.util.Scanner;

import Clock.Clock;

public class Main {


    public static void main(String[] args) {

//        TestArrayOfPoints tap = new TestArrayOfPoints();
//        tap.testAdd();
//
//        ArrayOfPoints a = new ArrayOfPoints();
//
//        System.out.println(tap.testArrayOfPoints(a, new Point(2,3)));

        WorkerExe worker = new WorkerExe(1, "Pavel", 40, 80);

        worker.setName("Pavel nansv");
        System.out.println(worker.calculateSalary());

        System.out.println(worker.print());

        worker.setSalaryPerHour(66);

        worker.calculateSalary();

        System.out.println( worker.print() );
    }




}