package abstractionTask;

public abstract class Shape {
   private String Color;
   private boolean filled;
   
   public Shape()
   {
	   
   }
   public Shape(String Color,boolean filled)
   {
	   this.Color=Color;
	   this.filled=filled;
   }
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public abstract double getArea();
public abstract double getPerimeter();
@Override
public String toString() {
	return "Shape [Color=" + Color + ", filled=" + filled + "]";
}


}
