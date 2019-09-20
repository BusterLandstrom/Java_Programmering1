import java.util.*;

public class fält {
    public static void main(String[] args){
        int max, min;
        int[] data;
        System.out.println("Antalet obsevationer");
        int observ;
        Scanner rsc = new Scanner(System.in);
        observ = rsc.nextInt();
        System.out.println("Data");
        data = new int[observ];
        for (int i = 0; i < observ ;i++){

            data[i] = rsc.nextInt();
        }

        double summa = 0.0;

        for(int i = 0; i < observ; i++){

            summa = summa +data [i];
        }

        double summan = summa/observ;

        System.out.println("Medelvärdet är " + summan);
        System.out.println("Avrundat till hel tal är det: " + Math.round(summan));

        max = data[0];
        min = data[0];

        for (int i = 0; i < observ; i++)

        {

            if(max < data[i]){

                max = data[i];
            }
            if(min > data[i]) {

                min = data[i];
            }

        }
        System.out.println("Minsta värdet: "+ min);

        System.out.println("Största värdet: "+ max);
    }
}
