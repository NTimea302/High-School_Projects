import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Actor
{
    GreenfootImage image;
    String score = "Score: ";
    String lives = "Lives: ";
    int scoreInt;
    int livesInt;
    int imageWidth;
    int imageHeight;
    public void addedToWorld(World world){
        image = new GreenfootImage(imageWidth, imageHeight);
        drawImage();
        setImage(image);
    }
    
    public Info(int width, int height){
        imageWidth = width;
        imageHeight = height;
    }
    
    public void setScore(int score){
        scoreInt = score;
        drawImage();
    }
    
    public void setLives(int lives){
        livesInt = lives;
        drawImage();
    }
    
    private void drawImage(){
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor(Color.GRAY);
        image.drawLine(0, 0, image.getWidth() - 1, 0);
        image.setColor(Color.WHITE);
        String print = score + scoreInt + " " + lives + livesInt;
        image.drawString(print, 10, 20);
    }
    
    private Minigame getMinigame(){
        return (Minigame)getWorld();
    }
}
