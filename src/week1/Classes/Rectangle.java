package week1.Classes;

public class Rectangle {
    private int recHeight;
    private int recWidth;
    private String recColor;

    //getter
    public int getHeight() {
        return recHeight;
    }

    public int getWidth() {
        return recWidth;
    }

    public String getColor() {
        return recColor;
    }

    // Setter

    public void setRecHeight(int newHeight) {
        this.recHeight = newHeight;
    }

    public void setRecWidth(int newWidth) {
        this.recWidth = newWidth;
    }

    public void setRecColor(String newColor) {
        this.recColor = newColor;
    }

    // Default
    Rectangle(){
        this.recHeight = 1;
        this.recWidth = 1;
        this.recColor = "Blue";
    }

    void draw(){
        for(int height = 0; height < this.recHeight; height++) {
            for(int width = 0; width < this.recWidth; width++){
                System.out.print(this.recColor.substring(0,1).toUpperCase());
            }
            System.out.println();
        }
        System.out.println();
    }


}
