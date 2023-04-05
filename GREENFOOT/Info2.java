import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Info2 extends Actor
{
    GreenfootImage image;
    String score = "Score: ";
    int scoreInt;
    int imageWidth;
    int imageHeight;
    public void addedToWorld(World world){
        image = new GreenfootImage(imageWidth, imageHeight);
        drawImage();
        setImage(image);
    }
    
    public Info2(int width, int height){
        imageWidth = width;
        imageHeight = height;
    }
    
    public void setScore(int score){
        scoreInt = score;
        drawImage();
    }
    
    private void drawImage(){
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor(Color.GRAY);
        image.drawLine(0, 0, image.getWidth() - 1, 0);
        image.setColor(Color.WHITE);
        
    }
    
    private level1 getlevel1(){
        return (level1)getWorld();
    }
}
