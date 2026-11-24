//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import ClassWorks.WorkerExe;

public class Main {


    public static void main(String[] args) {

//        TestArrayOfPoints tap = new TestArrayOfPoints();
//        tap.testAdd();
//
//        ArrayOfPoints a = new ArrayOfPoints();
//
//        System.out.println(tap.testArrayOfPoints(a, new Point(2,3)));

//        WorkerExe worker = new WorkerExe(1, "Pavel", 40, 80);
//
//        worker.setName("Pavel nansv");
//        System.out.println(worker.calculateSalary());
//
//        System.out.println(worker.print());
//
//        worker.setSalaryPerHour(66);
//
//        worker.calculateSalary();
//
//        System.out.println( worker.print() );


        WorkerExe w = new WorkerExe(1, "test", 20.5, 12);
        WorkerExe w2 = new WorkerExe(1, "test", 20.5, 12);
        WorkerExe w3 = new WorkerExe(3, "test 3", 10, 10);


        System.out.println(w.equals(w2));

        System.out.println(w);
        System.out.println(w2);
        System.out.println(w3);


        System.out.println(w.getClass().getSimpleName());
        System.out.println(w2.getClass().getSimpleName());
        System.out.println(w3.getClass().getSimpleName());

        System.out.println(w2.equals(w3));
    }


}