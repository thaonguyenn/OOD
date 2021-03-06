package project;

public abstract class Item {
	protected int x;
	protected int y;
	protected int len;
	protected Player player;
	protected TouchBehavior touchBehavior;
	public Item(int x, int y,int len, Player player) {
		super();
		this.x = x;
		this.y = y;
		this.player = player;
	}
	public void performTouch (){
		touchBehavior.touched();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public boolean touch(){
		return player.getX()>=this.x && player.getX()<=this.x+len
			&& player.getY()>=this.y && player.getY()<=this.y+len
			|| player.getX()+player.getDuongKinh()>=this.x && player.getX()+player.getDuongKinh()<=this.x+len
			&& player.getY()+player.getDuongKinh()>=this.y && player.getY()+player.getDuongKinh()<=this.y+len;
	}
}

