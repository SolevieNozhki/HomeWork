import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] weight = new double[10];
        double summ = 0;
        int n =0;
        for (int i = 0; i < weight.length; i++){
            weight[i] = new Random().nextDouble(100-40)+40;
            summ+=weight[i];
            if(weight[i]>60 && weight[i]<=80){
                n++;
            }
        }
        System.out.println("Средний вес всех людей:"+summ/weight.length+" кг");
        System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно:"+n);
    }
}