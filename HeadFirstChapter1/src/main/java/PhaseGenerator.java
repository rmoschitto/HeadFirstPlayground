public class PhaseGenerator {
    public static void main(String[] args) {
        //make three string arrays of words
        String[] wordListOne =  {"agnostic", "opinionated", "voice activated", "haptically driven",
                "extensible", "reactive", "agent-based",
                "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event-driven",
                "pub-sub", "IoT", "cloud native", "service"};

        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline",
                "service mesh", " design", "perspective", "design", "orientation"};

        //how many words in each string array
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //random number generator
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        //build a phrase
        String phase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + "!";

        //print phrase
        System.out.println(phase);
    }

}

