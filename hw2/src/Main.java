import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanToCreate = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во ваших ингредиентов в таком порядке: жабьи глаза, слёзы вурдалака, кости ворона, пельмени.");
        toadEyesCount= input.nextInt();
        ghoulTearsCount = input.nextInt();
        ravenBonesCount = input.nextInt();
        dumplingsCount = input.nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        if(toadEyesCount >=3 && ravenBonesCount >=1){
            System.out.println("Вы можете изготовить Эликсир зоркости");
            isCanToCreate = true;
        }if(ravenBonesCount >=2 && dumplingsCount >=4){
            System.out.println("Вы можете изготовить Эликсир стойкости");
            isCanToCreate = true;
        }if(ghoulTearsCount >=7 && dumplingsCount >=1 && toadEyesCount >=2){
            System.out.println("Вы можете изготовить Эликсир скрытности");
            isCanToCreate = true;
        }if(ghoulTearsCount >=5 && dumplingsCount >=10 && toadEyesCount >=4 && ravenBonesCount>=3) {
            System.out.println("Вы можете изготовить Запретный эликсир");
            isCanToCreate = true;
        }if(isCanToCreate ==false){
            System.out.println("К сожалению у вас не хватает ингредиентов ни на один эликсир");
        }
    }
}