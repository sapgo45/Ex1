package myMath;



import java.awt.Color;
import javax.swing.JFrame;
import de.erichseifert.gral.data.DataTable;
import de.erichseifert.gral.plots.XYPlot;
import de.erichseifert.gral.plots.lines.DefaultLineRenderer2D;
import de.erichseifert.gral.plots.lines.LineRenderer;
import de.erichseifert.gral.plots.points.PointRenderer;
import de.erichseifert.gral.ui.InteractivePanel;

public class LinePlotTest extends JFrame {
	public LinePlotTest() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		Monom a = new Monom(0.2,4);
		Monom b = new Monom(-1.5,3);
		Monom c = new Monom(3.0,2);
		Monom d = new Monom(-1,1);
		Monom e = new Monom(-5,0);
		Polynom t =new Polynom ();

		t.add(a);
		t.add(b);
		t.add(c);
		t.add(d);
		t.add(e);
		Polynom td =new Polynom((Polynom)t.derivative());

		DataTable data = new DataTable(Double.class, Double.class);
		for (double x = -2.0; x <= 6; x+=0.01) {
			double y = t.f(x);
			data.add(x, y);
		}
		DataTable ki = new DataTable (Double.class, Double.class);

		XYPlot plot = new XYPlot(data,ki);
		getContentPane().add(new InteractivePanel(plot));
		LineRenderer lines = new DefaultLineRenderer2D();
		plot.setLineRenderers(data, lines);
		Color color = new Color(0.0f, 0.3f, 1.0f);
		plot.getPointRenderers(data).get(0).setColor(color);
		plot.getLineRenderers(data).get(0).setColor(color);
		for (double q = -2.0; q <= 6; q+=0.01) {
			if(td.f(q-0.01)<0 && td.f(q+0.01)>0) {
				ki.add(q,t.f(q) );
			}
			else if(td.f(q-0.01)>0 && td.f(q+0.01)<0) {
				ki.add(q,t.f(q) );
			}

		}
		Color color2 = new Color(1.0f, 0.5f, 0.5f);
		plot.getPointRenderers(ki).get(0).setColor(color2);
	}
	public double underarea(double x0, double x1, double eps) {
		Polynom under = new Polynom ();
		Monom a = new Monom(0.2,4);
		Monom b = new Monom(-1.5,3);
		Monom c = new Monom(3.0,2);
		Monom d = new Monom(-1,1);
		Monom e = new Monom(-5,0);

		under.add(a);
		under.add(b);
		under.add(c);
		under.add(d);
		under.add(e);
		System.out.println(under.toString());
		double n = (int) ((x1-x0)*(under.f(x1)-under.f(x0)))/eps;
		double del = (x1-x0)/n;
		double sum = 0;
		for(int i=0; i<n; i++){
			if(under.f(x0)<=0) {
				sum += under.f(x0)*del;
			}
			x0+=del;



		}
		return Math.abs(sum);
	}

	public static void main(String[] args) {
		LinePlotTest frame = new LinePlotTest();
		frame.setVisible(true);

		System.out.println(frame.underarea(-2, 6, 0.01));

	}
}