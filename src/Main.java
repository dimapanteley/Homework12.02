import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] cell = new int[]{1, 2, 3};
        double[] cell2 = new double[]{1.57, 7.654, 9.986};
        float[] cell3 = new float[]{1.25f, 8.45f, 7.35f};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] cell = new int[]{1, 2, 3};
        double[] cell2 = new double[]{1.57, 7.654, 9.986};
        float[] cell3 = new float[]{1.25f, 8.45f, 7.35f};

        for (int i = 0; i < cell.length; i++) {
            System.out.print(cell[i]);
            if (i != cell.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < cell2.length; i++) {
            System.out.print(cell2[i]);
            if (i != cell2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < cell3.length; i++) {
            System.out.print(cell3[i]);
            if (i != cell3.length-1 ) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] cell = new int[]{1, 2, 3};
        double[] cell2 = new double[]{1.57, 7.654, 9.986};
        float[] cell3 = new float[]{1.25f, 8.45f, 7.35f};

        for (int i = cell.length-1; i >= 0; i--) {
            System.out.print(cell[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = cell2.length-1; i >=0; i--) {
            System.out.print(cell2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = cell3.length-1; i >=0; i--) {
            System.out.print(cell3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] cell = new int[]{1, 2, 3};
        for (int i=0; i < cell.length;i++){
            if(cell[i] %2 !=0){
                cell[i]++;
            }

        }
        System.out.println(Arrays.toString(cell));


    }
}
