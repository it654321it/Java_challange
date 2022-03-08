import java.util.Scanner;

/** Task - find last number of Fibocnachi row after enetering in console any integer 'n' (range of 'n': 1<=n<40)
 */
public class Fibonachi {
    public static void main(String[] args) {
		System.out.println("Fibonachi app.started ! Enter number to calculate last number of Fibocnachi row:");
        Scanner s = new Scanner(System.in);
        int enteredNumber = s.nextInt();
		System.out.println("Fibonachi raw for number:" + arrSize + " is: " + getLastNumberInFibonachiRow(enteredNumber)); 
        System.out.print("Fibonachi app. FINISHED !");
    }
    public static int getLastNumberInFibonachiRow(int num) {
        int result = 0;
            if (num == 1 || num == 2) {
                result = 1;
                return result;
            } else {
                int f_minus_1 = 1, f_minus_2 = 1, last_F;

                for (int i = 2; i < num; i++) {
                    last_F = f_minus_1 + f_minus_2;
                    f_minus_2 = f_minus_1;
                    f_minus_1 = last_F;

                    if (i == (num-1)) {
                        result = last_F;
                        break;
                    }
                }
            }
    return result;
    }
}