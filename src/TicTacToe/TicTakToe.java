package TicTacToe;

public class TicTakToe {

  private Player player1;
  private Player player2;

    public TicTakToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public TicTakToe(){};

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String getBoard() {
        return """
                |     |     |     |
                |     |     |     |
                |     |     |     |
                """;
    }
}
