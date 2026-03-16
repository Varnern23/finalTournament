//Not in original UML but just gives some nicer structure to allow robots to see all information they may need in history
package main;

public class RoundInfo {

    private String myAction;
    private String opponentAction;
    private int outcome; // score earned this round

    public RoundInfo(String myAction,String opponentAction,int outcome) {
        this.myAction = myAction;
        this.opponentAction = opponentAction;
        this.outcome = outcome;
    }

    public String getMyAction() {
        return myAction;
    }

    public String getOpponentAction() {
        return opponentAction;
    }

    public int getOutcome() {
        return outcome;
    }
}
