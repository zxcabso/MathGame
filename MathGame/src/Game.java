import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Game {
    static ArrayList<String> maths = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;
    private final String name;
    private final int version;
    static {
        maths.add("2 + 2");
        maths.add("10 + 5");
        maths.add("10 + 2");
        maths.add("22 + 32");
        maths.add("16 + 16");
    }
    Game(String name, int version, int score){
        this.name = name;
        this.version = version;
        this.score = score;
    }
    public void Start(Boolean start){
        if(start){
            System.out.printf("Добро пожаловать в %s,версии %s\nтекущее время %s.\nЧто-бы показать счет напишите показать счет\nчто-бы выйти напишите выход .\nчто-бы продолжить напишите понял\n",this.name,this.version,getTime());
            String exit;
            while (true){
                exit = scanner.nextLine();
                if (exit.equalsIgnoreCase("выход")){
                    break;
                }
                if(exit.equalsIgnoreCase("понял")){
                    for(String word : maths){
                        System.out.println(word);
                        String input = scanner.nextLine();
                        if(input.equalsIgnoreCase("4")) {
                            score = addScore();
                            continue;
                        } else if(input.equalsIgnoreCase("15")){
                            score = addScore();
                            continue;
                        }else if(input.equalsIgnoreCase("12")){
                            score = addScore();
                            continue;
                        }else if(input.equalsIgnoreCase("54")){
                            score = addScore();
                            continue;
                        }else if(input.equalsIgnoreCase("32") && input == null){
                            score = addScore();
                            continue;
                        }
                        if(input.equalsIgnoreCase("выход")){
                            System.out.println("Напишите выход еще раз , что - бы выйти");
                            break;
                        } else if (input.equalsIgnoreCase("показать счет")) {
                            System.out.println("твой счет составляет : " + getScore() + " очков! Продолжаем решать задачи ");
                        }
                    }
                } else {
                    System.out.println("Неверная команда");
                    break;
                }
            }
        }
    }
    public static String getTime(){
        Date date = new Date();
        String day = date.getHours() + ":" + date.getMinutes();
        return day;
    }

    public static int addScore() {
        return score + 100;
    }
    public static int getScore(){
        return score;
    }
}
