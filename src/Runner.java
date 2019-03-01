import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a madlib letter to let someone know how you feel about the relationship!");
        System.out.println("Enter the following words. ");

        System.out.println("Name: ");
        String word1 = sc.nextLine();
        if (word1.length() < 1 || word1.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Noun: ");
        String word2 = sc.nextLine();
        if (word2.length() < 1 || word2.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Verb: ");
        String word3 = sc.nextLine();
        if (word3.length() < 1 || word3.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Adjective: ");
        String word4 = sc.nextLine();
        if (word4.length() < 1 || word4.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Verb: ");
        String word5 = sc.nextLine();
        if (word5.length() < 1 || word5.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Adjective: ");
        String word6 = sc.nextLine();
        if (word6.length() < 1 || word6.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Noun: ");
        String word7 = sc.nextLine();
        if (word7.length() < 1 || word7.length() > 20){
            System.out.println("Not a valid word length.");
        }
        System.out.println("Body Part: ");
        String word8 = sc.nextLine();
        if (word8.length() < 1 || word8.length() > 20){
            System.out.println("Not a valid word length.");
        }
        String[] words = {word1, word2, word3, word4, word5, word6, word7, word8};
        System.out.println("Choose A Number For The Theme: 1=Love letter, 2=Break Up Letter, 3=FriendZone Letter");
        if(sc.hasNextInt()) {
            int theme = sc.nextInt();
            if (theme < 1 || theme > 3){
                System.out.println("Not a valid number!");
            }
            if (theme == 1){
                /*Love letter*/ System.out.println(word6 + " " + word1 + ", If you wonder just how much I " + word5 + " you, wonder no more. You are the sun in my " + word2 + ", the " + word7 + " that runs through my soul, and the very air I " + word3 + ". I didn't believe it was possible to love someone so " + word4 + " but I really love you with my whole " + word8 + ".");
            }
            if (theme == 2){
                /* Break up letter */ System.out.println("Dear "+ word1 + ", I'll always have a special " + word2 + " in my " + word8 + " for you. At times, our relationship was " + word4 + ", but lately, " + word7 + " has felt wrong. It pains me to admit this, but my love for you has " + word5 + " away. I can't " + word3 + " in a relationship where there is no love. I hope you meet someone " + word6 + " who will love you the way you deserve to be loved. Goodbye forever.");
            }
            if (theme == 3){
                 /* FriendZone Letter */ System.out.println("Hey " + word1 + ", you're my best " + word2 + ", and like a sibling to me. I never " + word3 + " to ruin our friendship. To be " + word4 + ", I like someone else. I don't " + word5 + " to lead you on, so maybe we should spend less " + word7 + " together. I know in my " + word8 + " there is a " + word6 + " person out there for you! It's just not me.");
            }
        } else {
            System.out.print("Not a number!");
        }
    }
}

