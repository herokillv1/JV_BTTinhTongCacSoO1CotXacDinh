import java.util.Scanner;

public class BTTinhTongCacSoO1CotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Row mảng : ");
        int row = scanner.nextInt();
        System.out.println("Nhập Column mảng : ");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        System.out.println();
        System.out.println("Mảng vừa tạo : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Nhập vào cột cần tính tổng : ");
        int columns = scanner.nextInt();
        if (columns>=0&&columns<=column){
            for (int j = columns; j < array[0].length; j++) {
                int sum = 0;
                for (int i = 0; i < array.length; i++)
                    sum += array[i][j];
                System.out.println("Tổng của cột " + columns + " là : " + sum);
                break;
            }
        }else {
            System.out.println("ko có cột này");
        }

    }
}
