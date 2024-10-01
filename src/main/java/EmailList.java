import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        while (true) {
            System.out.println("add your command");
            String command = new Scanner(System.in).nextLine();
            if (command.equals("LIST")) {
                list.forEach(System.out::println);
                break;
            }

                        else if (command.contains("ADD")) {
                            String email = command.substring(4);
                            list.add(email);
                        }

            }
        }
    }