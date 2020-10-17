package paint;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;

public class IsoscelesTriangle implements Class2D {

    private Polygon Trapezoid;
    private Color lineColor = null;
    private Color color = null;
    public IsoscelesTriangle()
    {

    }
    public IsoscelesTriangle(Polygon pol)
    {
        this.Trapezoid = pol;
    }

    @Override
    public void fill(Color color) {
        this.setColor((color));
    }

    @Override
    public void draw(GraphicAdapter g) {
        if(getColor() == null)
        {
            g.getGraphicAdapter().setColor(getLineColor());
            g.getGraphicAdapter().drawPolygon(getIsoscelesTriangle());
        }
        else
        {
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillPolygon(getIsoscelesTriangle());
        }
    }

    @Override
    public boolean contains(Point p) {
        return getIsoscelesTriangle().contains(p);
    }

    @Override
    public void move(Point startDrag, Point endDrag) {
        int[] xs = {0, 0, 0};
        int[] ys = {0, 0, 0};
        for(int k = 0; k < 3; k++ ){
            xs[k] = this.getIsoscelesTriangle().xpoints[k] + endDrag.x - startDrag.x;
            ys[k] = this.getIsoscelesTriangle().ypoints[k] + endDrag.y - startDrag.y;
        }
        this.setIsoscelesTriangle(new Polygon(xs,ys,3));
    }

    @Override
    public void writetoFile(BufferedWriter b) {
        try {
            b.write(getClass().getSimpleName() + ";");
            b.write(getIsoscelesTriangle().xpoints[0] + ";" + getIsoscelesTriangle().ypoints[0] + ";");
            b.write(getIsoscelesTriangle().xpoints[1] + ";" + getIsoscelesTriangle().ypoints[1] + ";");
            b.write(getLineColor().getRed() + ";" + getLineColor().getGreen() + ";" + getLineColor().getBlue() +";");
            if(getColor()==null){
                b.write("null" + ";" +"null" +";" + "null");
            }else{
                b.write(getColor().getRed() + ";" + getColor().getGreen() + ";" + getColor().getBlue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeObject(Point startDrag, Point endDrag) {
        setLineColor(GUI.selectColor);
        int midx;
        int midy;
        if (startDrag.x > endDrag.x){
            midx = startDrag.x + (Math.abs(endDrag.x - startDrag.x));
            midy = endDrag.y;
        }
        else{
            midx = startDrag.x - Math.abs(endDrag.x - startDrag.x);
            midy = endDrag.y;
        }
        int[] xs = {startDrag.x, endDrag.x, midx};
        int[] ys = { startDrag.y, endDrag.y, midy};
        Polygon pol = new Polygon(xs, ys, xs.length);
        this.setIsoscelesTriangle(pol);
    }

    public Polygon getIsoscelesTriangle() {
        return Trapezoid;
    }
    public void setIsoscelesTriangle(Polygon trapezoid) {
        Trapezoid = trapezoid;
    }
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
