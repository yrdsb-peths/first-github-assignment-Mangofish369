public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    private String getWinner(String user, String computer)
    {
        // Return the proper string for the result.
        String USER_PLAYER = "User wins!";
        String COMPUTER_PLAYER = "Computer wins!";
        String TIE = "Tie";
        
        if(user.equals("rock")){
            if(computer.equals("paper")){
                return COMPUTER_PLAYER;
            }
            else if (computer.equals("scissors")){
                return USER_PLAYER;
            }
            return TIE;
        }
        if(user.equals("paper")){
            if(computer.equals("scissors")){
                return COMPUTER_PLAYER;
            }
            else if (computer.equals("rock")){
                return USER_PLAYER;
            }
            return TIE;
        }
    
        else{
            if(computer.equals("rock")){
                return COMPUTER_PLAYER;
            }
            else if (computer.equals("paper")){
                return USER_PLAYER;
            }
            return TIE;
        }
    }
    public String computerChoice(){
        String comChoice = "";
        int choice = Randomizer.nextInt(1,3);
        
        if(choice == 1){
            comChoice = "rock";
        }
        else if (choice == 2){
            comChoice = "paper"; 
        }
        else{
            comChoice = "scissors";
        }
        return comChoice;
    }
    
    public void run()
    {
        while(true){
            String user1 = readLine("Enter your choice (rock, paper, or scissors): ");
            if (user1.equals("")){
                break; 
            }
            String compChoiceSaved = computerChoice();
            System.out.println("User: " +user1);
            System.out.println("Computer: " +compChoiceSaved);
            System.out.println(getWinner(user1,compChoiceSaved));
        }
    }
}
