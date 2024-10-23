public class Instructions {
    public String executeInstructions() {

        String RESET = "\u001B[0m";
        String CYAN = "\u001B[36m";
        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m"; // For those vibrant CLI vibes

        return RED + "Let's get down to the basics:\n\n" + RESET +
                YELLOW + "1. If you can snag an opponent's piece, you gotta do it!\n" +
                "2. If you're left with just your king, you win! Weird, right?\n" +
                "3. If your king gets checkmated, you still win. Yeah, it's a mind-bender.\n\n" + RESET +
                RED + "Now, here's the lowdown:\n\n" + RESET +
                YELLOW + "Got multiple captures? Pick your fave!\n" +
                "- Just remember: don't put your king in check; that's a no-go.\n" +
                "- If your king's in check and you can escape by capturing, you *have* to do it!\n"
                + RESET + GREEN +
                "- No legal moves left? That's a draw, my friend.\n\n" +
                "- If you're playing rated games, keep this in mind:\n\n" +
                "- If your king gets checkmated, the system sees it as a loss, which flips rule number 3 on its head.\n"
                + "- So we flip the script: when the server says \"You lose,\" it actually means you win. Wild, huh?\n" +
                "- And the Elo rating? It's upside down: lower is better. Confusing, but that's how it rolls.\n"
                + RESET +

                CYAN + "Have a blast out there!" + RESET;
    }
}
