package labs.lab1.task04;

import labs.lab1.task04.myfirstpackage.MyFirstPackage;

class MyFirstProgram {
    public static void main(String[] s) {
        MyFirstPackage o = new MyFirstPackage(1, 2);
        System.out.println(o.operationRemain());

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.operationRemain());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}