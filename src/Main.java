public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("**********************");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("**********************");
        System.out.println(hasTeenOptional(9, 99, 20,14));
        System.out.println(hasTeenOptional(123, 12));
        System.out.println(hasTeenOptional(22, 23, 34,45));
        System.out.println("**********************");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println(isCatPlaying(true,45));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;
        return clock < 8 || clock >= 20;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }


    public static boolean hasTeenOptional(int... ages){
        for(int age: ages){
            if(age>=13 && age <= 19){
                return true;
            }
        }
        return false;
    }


public static boolean isCatPlaying(boolean isSummer,int temp){
        if(isSummer){
    return temp> 25 && temp <=45;
    }
    return temp>25 && temp <=35;
}




}

