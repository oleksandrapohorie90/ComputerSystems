package WrapUp;

public class Main {
    //on debug with points
    //CTRL R - run
    //CTRL D - debug, debug window will open
    //step over - go to next line
    //step into - explore what is  this line, for example explore the method line 13 - F 7
    //if a breakpoint is inside the function then diamonds not circles
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <=5 ; i++) {
            printLine("one line");
            System.out.println("i = "+ i);
            System.out.println("more");
        }
    }

    public static void printLine(String line){
        System.out.println(line);
    }
}
