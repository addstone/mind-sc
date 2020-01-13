package org.xmind.ui.datepicker;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class SelectFeedbackLayer extends Layer {

	public SelectFeedbackLayer() {
		setVisible(false);
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		Rectangle b = getBounds();
		Rectangle box = b.getResized(-1, -1).expand(-1, -1);
		int corner = DatePicker.CORNER;
		graphics.setAlpha(0xff);
		graphics.setForegroundColor(Display.getCurrent()
				.getSystemColor(SWT.COLOR_GRAY));
		graphics.setBackgroundColor(Display.getCurrent()
				.getSystemColor(SWT.COLOR_LIST_SELECTION));
		graphics.fillRoundRectangle(box, corner, corner);
		graphics.drawRoundRectangle(box, corner, corner);
	}

}
