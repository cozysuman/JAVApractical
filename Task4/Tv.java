//Ann watched a TV program about health and learned that it is recommended to sleep at least A
//        hours per day, but oversleeping is also not healthy and you should not sleep more than B hours.
//
//        Now Ann sleeps H hours per day.
//        Determine if her sleep schedule complies with the requirements of that TV program.
//        If it does, print Normal. If Ann sleeps fewer than A hours, output Deficiency. If she sleeps more than B hours, output Excess.
//
//        Write code that reads in three numbers with variables in the following order: A, B, H.
//        A is always less than or equal to B.
//
//        For example:
//
//        Input	Result
//        8
//        7
//        1
//        Deficiency


import java.util.Scanner;
public class Tv {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minSleepHour = scan.nextInt();
        int maxSleepHour = scan.nextInt();
        int userSleepHour = scan.nextInt();

        if (minSleepHour >= maxSleepHour) {
            if (userSleepHour >= minSleepHour && userSleepHour <= maxSleepHour) {
                System.out.println("Normal");
            } else if (userSleepHour > maxSleepHour) {
                System.out.println("Excess");
            } else {
                System.out.println("Deficiency");
            }
        }
    }
}
