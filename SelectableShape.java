  import java.awt.*;
import java.awt.geom.*;

/**
   A shape that manages its selection state.
   Taken from Chapter 6 / scene3
*/
public abstract class SelectableShape implements SceneShape
{
   public void setSelected(boolean b)
   {
      selected = b;
   }

   public boolean isSelected()
   {
      return selected;
   }

   public void drawSelection(Graphics2D g2)
   {
      translate(1, 1);
      draw(g2);
      translate(1, 1);
      draw(g2);
      translate(-2, -2);
   }

   private boolean selected;
}