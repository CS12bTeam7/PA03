package pa03;


/**
 * QuickCircles are transparent blue circles which move on the board
 * The velocity of each circle will change after the circles bounce the wall
*/

public class QuickCircles extends CircleShape{

  private double speedchange = 1.2;

	/**
	 * create a circle and set the color to transparent blue
	 */
  public QuickCircles(){
    super();
		this.color = new java.awt.Color(0,0,255,100); // transparent blue
  }

   /**
   * keep the circle on board as usual, but also change the velocity.
   * If it bounces the wall, then its velocity will change.
   */
  public void keepOnBoard(){

    if (this.x < this.radius) {
      super.keepOnBoard();
      this.vx=this.vx*speedchange;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      super.keepOnBoard();
      this.vx=this.vx*speedchange;
    }

    if (this.y < this.radius){
      super.keepOnBoard();
      this.vy=this.vy*speedchange;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      super.keepOnBoard();
      this.vy=this.vy*speedchange;
    }
  }
}
