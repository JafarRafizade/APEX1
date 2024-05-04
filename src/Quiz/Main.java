package Quiz;

public class Main {
    public static void main(String[] args) {
        String[] Questions = new String[]{
                "What is the closest planet to the Sun?",
                "Who is the CEO of the Tesla, SpaceX, and X?",
                "Which one of these creatures is a mammal?",
                "Who is the founder of the dramaturgy in Azerbaijan?",
                "Which director has most number of IMDB top 250 movies after Christopher Nolan ?",
                "Which football player holds the record for 20+ goals and 20+ assists in a single league season?",
                "Which one of these leaders is considered to be one  of 'Five Good Emperors' in Roman Empire?"

        };
        String[] Variants = new String[]{
                "A) Mercury B) Saturn C) Venera D) Mars",
                "A) Jeff Bezos B) Mark Zuckerberg C) Acun Ilicali D) Elon Musk",
                "A) Shark B) Dolphin C) Penguin D) Frog",
                "A) Hasan bay Zardabi B) M.F Akhundzade C) Jafar Jabbarli D) Huseyn Javid",
                "A)Stanley Kubrick B) Alfred Hitchcock C) Steven Spielberg D) Martin Scorsese",
                "A) Cristiano Ronaldo B) Lionel Messi C) Wayne Rooney D) Thierry Henry",
                "A)Julius Caesar B) Augustus C) Marcus Aurelius D) Caligula"

        };
        String[] correctVariant = new String[]{
          "a","d","b","b","a","d","c"
        };
        String[] answers = new String[7];
        QuizGame quizGame = new QuizGame(Questions,Variants,correctVariant);
        quizGame.Game(Questions,Variants,correctVariant);



    }
}
