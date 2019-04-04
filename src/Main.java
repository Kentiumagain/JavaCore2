import com.sun.org.apache.xml.internal.security.Init;

import java.util.Scanner;

public class Main {
    public static String[][] InitArray() throws MySizeArrayException{
        boolean loop = true;
        int i=0,j=0;
        StringBuffer temp = new StringBuffer();
        System.out.println("Введите двумерный массив 4х4 из целых чисел, по окончанию введите 'end' ");
        Scanner in = new Scanner(System.in);
        String[][] arraystr = new String[4][4];
        try {
            while (loop) {
                temp.append(in.next());
                if (temp.toString().equals("end")) {
                    loop = false;
                    break;
                }
                arraystr[i][j] = temp.toString();
                if (i<3) {
                    i++;
                } else {
                    i=0;
                    j++;
                }
                temp.delete(0,1);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
           throw new MySizeArrayException(e);
        }
        return arraystr;
    }

    public static int Summ (String[][] str) throws MyArrayDataException {
        int summ=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                try {
                    summ+=Integer.parseInt(str[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(e,i+1,j+1);
                }
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        int s;
        String[][] myarray = new String[4][4];
        try {
            myarray = InitArray();
            System.out.println("Сумма элементов массива = " + Summ(myarray));
        }
        catch (MySizeArrayException e) {
            System.out.println("Неверный размер массива");
        }
        catch (MyArrayDataException e) {
           System.out.println("Неверные данные в ячейке " + e.getI() + " " + e.getJ());
       }
    }
}
