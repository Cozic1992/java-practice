
public class Box {
	int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки
    
    Box() {
    }
    

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int d) {
		this.depth = d;
	}
    
	public  int getSum() {
		// int sum = this.depth + this.width + this.height;
		 int sum = getHeight() + getWidth() + getDepth();
		return sum;
	}
	
    
    
}
