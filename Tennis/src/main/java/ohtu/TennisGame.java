package ohtu;

public class TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }
    
    private String getScoreAsString(int score) {
    	switch (score)
        {
            case 0:
                    return "Love";
            case 1:
                    return "Fifteen";
            case 2:
                    return "Thirty";
            case 3:
            		return"Forty";
            default:
                    return "Deuce";  
        }
    }
    
    private String getScoresAtString() {
    	if(m_score1 == m_score2) {
    		String scoreAsString = getScoreAsString(m_score1);
    		if(scoreAsString.equals("Deuce")) {
    			return scoreAsString;
    		}
    		return scoreAsString + "-All";
    	}
    	return getScoreAsString(m_score1) + "-" + getScoreAsString(m_score2);
    }
    
    private boolean isEven() {
    	return m_score1 == m_score2;
    }
    
    private String checkAdvantageAndWin() {
    	int minusResult = m_score1-m_score2;
        if (minusResult==1) {
        	return "Advantage player1";
        }
        else if (minusResult ==-1) {
        	return "Advantage player2";
        }
        else if (minusResult>=2) {
        	return "Win for player1";
        }
        else {
        	return "Win for player2";
        }
    }

    public String getScore() {
        if (!isEven() && (m_score1>=4 || m_score2>=4))
        {
            return checkAdvantageAndWin();
        }
        
        return getScoresAtString();
    }
}