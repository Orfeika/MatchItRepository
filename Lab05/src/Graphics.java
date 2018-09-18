import se.lth.cs.pt.window.SimpleWindow;

public class Graphics {
	private int width;
	private int blockSize;
	private int height;
	private SimpleWindow w;

	public Graphics(int w, int h, int bS) {
		this.width = w;
		this.height = h;
		this.blockSize = bS;
		this.w = new SimpleWindow(width * blockSize, height * blockSize, "Digging");
	}

	public Graphics() {
		w = new SimpleWindow(300, 500, "Digging");
	}

	public void square() {
		w.moveTo(10, 10);
		w.lineTo(10, 20);
		w.lineTo(20, 20);
		w.lineTo(20, 10);
		w.lineTo(10, 10);
	}

	public void block(int x , int y) {
		int left = x * blockSize;
		int right = left + blockSize - 1;
		int top = y * blockSize;
		int bottom = top + blockSize - 1;
		for(int row = top; row <= bottom; row ++){
		w.moveTo(left, row);
		w.lineTo(right, row);
		}
	}
	
}
