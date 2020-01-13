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
package org.xmind.ui.tools;

import org.xmind.gef.IViewer;
import org.xmind.gef.event.MouseEvent;
import org.xmind.gef.tool.ITool;

public interface ISelectToolHelper extends IToolHelper {

    boolean handleMouseDoubleClick(ITool tool, MouseEvent me, IViewer viewer);

    boolean handleMouseMove(ITool tool, MouseEvent me, IViewer viewer);

    boolean handleMouseDrag(ITool tool, MouseEvent me, IViewer viewer);

    boolean handleMouseDown(ITool tool, MouseEvent me, IViewer viewer);

    boolean handleMouseUp(ITool tool, MouseEvent me, IViewer viewer);

    boolean handleMouseHover(ITool tool, MouseEvent me, IViewer viewer);

}