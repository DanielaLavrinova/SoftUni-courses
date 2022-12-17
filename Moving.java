package WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = width * high * length;
        boolean isOver = false;

        String input = scanner.nextLine();

        while(!input.equals("Done")){

            int boxes = Integer.parseInt(input);
            area -= boxes;

            if(area <= 0){
                isOver = true;
                break;
            }

            input = scanner.nextLine();

        }

        if(isOver){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(area));
        }else {
            System.out.printf("%d Cubic meters left.",area);
        }

    }
}
