package pa03;


/**
 * SmallCircles are yellow circles which move at a constant velocity
 * on the board and their radius shrink when bounce off the edges
*/

public class SmallCircles extends CircleShape{

	/**
	 * create a small circle and set the color to transparent yellow
	 */
  public SmallCircles(){
    super();
		this.color = new java.awt.Color(255,255,0,150); // transparent yellow
  }

   /**
   * keep the circle on board as usual, but also change the radius. If it bounces
   the wall, then its radius shrinks to 0.8 of its previous radius
   */
  public void keepOnBoard(){

    if (this.x < this.radius) {
      super.keepOnBoard();
      this.radius=this.radius*0.8;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      super.keepOnBoard();
      this.radius=this.radius*0.8;
    }

    if (this.y < this.radius){
      super.keepOnBoard();
      this.radius=this.radius*0.8;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      super.keepOnBoard();
      this.radius=this.radius*0.8;
    }
  }




}
