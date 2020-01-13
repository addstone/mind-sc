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
package org.xmind.ui.decorations;

import org.eclipse.draw2d.IFigure;
import org.xmind.gef.draw2d.decoration.IConnectionDecoration;

public interface IBranchConnectionDecoration extends IConnectionDecoration {

    int getSourceOrientation();

    void setSourceOrientation(IFigure figure, int orientation);

    int getTargetOrientation();

    void setTargetOrientation(IFigure figure, int orientation);

    int getSourceExpansion();

    void setSourceExpansion(IFigure figure, int expansion);

    int getTargetExpansion();

    void setTargetExpansion(IFigure figure, int expansion);

    boolean isTapered();

    void setTapered(IFigure figure, boolean tapered);

//    int getMinimumMajorSpacing(IFigure figure);

}