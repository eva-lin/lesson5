import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Задания 1-3
        System.out.println("Задание 1-3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int min = 200_000;
        int max = 0;
        float averageSum = 0f;
        for (int i: arr){
            sum += i;
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        averageSum = (float)sum/30;
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i>0; i--){
            System.out.print(reverseFullName[i-1]);
        }
        System.out.println();
        //Задание 5
        System.out.println("Задание 5");
        int [][] matrix = new int [3][3];

        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                if (i==j || i+j == 2){
                    matrix[i][j] = 1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6
        System.out.println("Задание 6");
        int[] sourceArr = {5,4,3,2,1};
        int[] newArr = new int[sourceArr.length];
        int n = 0;
        System.out.println(Arrays.toString(sourceArr));
        for (int i = sourceArr.length; i > 0; i-- ){
            newArr[n] = sourceArr[i-1];
            n++;
        }
        sourceArr = newArr;
        System.out.println(Arrays.toString(sourceArr));
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");
        int[] array = {5,4,3,2,1};
        int j = array.length-1;
        int el = 0;
        System.out.println(Arrays.toString(array));
        for (int i=0; i<array.length/2; i++){
            el = array[i];
            array[i]=array[j];
            array[j]=el;
            j--;
        }
        System.out.println(Arrays.toString(array));

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

