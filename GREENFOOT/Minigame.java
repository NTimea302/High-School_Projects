import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Minigame extends World
{
    int numberOfStarfishes = 7;
    int lives = 3;
    int score;
    Player thePlayer;
    Info theInfo;
    int infoImageHeight = 30;
    int spawnMargin = 30;
    int number = 0;
    GAME_STATE gameState;
    int savedSec;
    boolean once;
    
    public enum GAME_STATE ///theese are the 4 states of the minigame 
    {
        STARTING,
        RUNNING,
        RESETTING,
        END
    }

    public Minigame()
    {    
        super(1200, 800, 1); 
        setGameState(GAME_STATE.STARTING);
        act();
        setPaintOrder(Info.class, Player.class, Starfish.class); ///this makes the informations appear on screen
    }

    public void act()
    {
        switch(gameState)
        {
            case STARTING: 
            {
                
                for(int i = 0; i < numberOfStarfishes; i++)
                {
                    addObject(new Starfish(), getSpawnX(), getSpawnY());
                }

                thePlayer = new Player(1);
                addObject(thePlayer, getWidth() / 2, getHeight() / 2);

                theInfo = new Info(getWidth(), infoImageHeight);
                addObject(theInfo, getWidth() / 2, getHeight() - infoImageHeight / 2);
                getInfo().setLives(lives);
                
                setGameState(GAME_STATE.RUNNING);
                break;
            }
            case RESETTING: 
            {
                thePlayer.resetPos();
                setGameState(GAME_STATE.RUNNING);
                break;
            }
        }
        while(number<score) ///this adds the score earned in the minigame to the total score
        {
            Counter.addScore();
            number++;
        }
    }
    
    public void setGameState(GAME_STATE state){
        gameState = state;
    }

    public GAME_STATE getGameState(){
        return gameState;
    }

    public void setScore(int score){
        this.score = score;
        getInfo().setScore(score);
    }
    
    public void subLive()     
    {
        lives--;
        if(lives <= 0) ///if the actor goes out of the screen 3 times, the minigame is over
        {
            setGameState(GAME_STATE.END);
            Greenfoot.setWorld( new level5_2());
        }
        if(score>50) ///if the score reaches 50 points, the game will end
        { 
            setGameState(GAME_STATE.END);
            Greenfoot.setWorld( new level5_2());
        }
        getInfo().setLives(lives);
    }
    
    public int getSpawnX(){
        return spawnMargin + Greenfoot.getRandomNumber(getWidth() - spawnMargin * 2);
    }

    public int getSpawnY(){
        return spawnMargin + Greenfoot.getRandomNumber(getHeight() - spawnMargin * 2 - infoImageHeight);
    }

    public Player getPlayer(){
        return thePlayer;
    }

    public int getScore(){
        return score;
    }

    public Info getInfo(){
        return theInfo;
    }

    public void addScore(int add){
        score = score + add;
        getInfo().setScore(score);
    }
   
}

