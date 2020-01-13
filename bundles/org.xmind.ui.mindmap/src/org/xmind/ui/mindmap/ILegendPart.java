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
package org.xmind.ui.mindmap;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.xmind.core.ILegend;
import org.xmind.gef.part.IGraphicalPart;

public interface ILegendPart extends IGraphicalPart {

    ISheetPart getOwnedSheet();

    ILegend getLegend();

    ITitleTextPart getTitle();

    List<ILegendItemPart> getItems();

    Point getPreferredPosition();

}