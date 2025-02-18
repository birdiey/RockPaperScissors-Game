package za.ac.tut.model;

public class RockPaperScissorGame implements RockPaperScissorInterface {

    public String coinSide[] = {"Rock", "Paper", "Scissor"};

    @Override
    public String determineTheWinner(String playerChoice,String siriChoice) {
       String outcome=" ";
        if (playerChoice.equalsIgnoreCase(siriChoice)) {
            outcome= "It's a tie!";
        } else if (playerChoice.equalsIgnoreCase("Rock") && siriChoice.equalsIgnoreCase("Scissor")) {
            outcome= "You win!";
        } else if  (playerChoice.equalsIgnoreCase("Paper") && siriChoice.equalsIgnoreCase("Rock")) {
            outcome= "You win!";
            
        } else if (playerChoice.equalsIgnoreCase("Scissor") && siriChoice.equalsIgnoreCase("Paper")) {
            outcome= "You win!";
        } else {
            return "You lose!";
        }
    
      return outcome;
    }
    @Override
    public String determineSiriSign() {
        String siriSign = " ";

        int generatedOutcome = (int) Math.floor((int) (Math.random() * 3));

        siriSign = coinSide[generatedOutcome];
        return siriSign;
    }

    @Override
    public String playGame(String playerChoice){
        String siri  =determineSiriSign();
        String outcome =determineTheWinner(playerChoice, siri);

        
        return outcome;
    }

}
