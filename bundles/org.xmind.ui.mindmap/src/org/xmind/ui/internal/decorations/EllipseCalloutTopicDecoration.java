/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.internal.decorations;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.xmind.gef.draw2d.graphics.Path;

public class EllipseCalloutTopicDecoration extends EllipseTopicDecoration {

    private static final float STARTANGLE = -130;

    private static final float ARCANGLE = 345;

    public EllipseCalloutTopicDecoration() {
        super();
    }

    public EllipseCalloutTopicDecoration(String id) {
        super(id);
    }

    protected void sketch(IFigure figure, Path shape, Rectangle box, int purpose) {
        shape.addArc(box.x, box.y, box.width, box.height, STARTANGLE, ARCANGLE);
        float h = box.height;
        shape.lineTo(box.x, box.y + h);
        shape.close();
    }

}