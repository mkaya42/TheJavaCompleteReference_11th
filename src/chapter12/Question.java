package chapter12;

//An improved version of the "decision maker"
//program from chapter 9. This version uses an
//enum, rather than interface variables to
//represent the answers

import java.util.Random;

enum Answers {

    NO, YES, MAYBE, LATER, SOON, NEVER
}

public class Question {
    Random rand = new Random();

    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) {
            return Answers.MAYBE;
        }
        if (prob < 30) {
            return Answers.NO;
        }
        if (prob < 60) {
            return Answers.YES;
        }
        if (prob < 75) {
            return Answers.LATER;
        }
        if (prob < 98) {
            return Answers.SOON;
        } else return Answers.NEVER;
    }

}
class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }

    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}


