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
package org.xmind.gef.graphicalpolicy;

import org.xmind.gef.part.IGraphicalPart;

/**
 * @author Frank Shaka
 */
public interface IGraphicalPolicy {

    /**
     * 
     * @param part
     * @return
     */
    IStyleSelector getStyleSelector(IGraphicalPart part);

    /**
     * 
     * @param part
     * @return
     */
    IStructure getStructure(IGraphicalPart part);

    /**
     * Called when this policy is activated on the given part.
     * 
     * @param part
     */
    void activate(IGraphicalPart part);

    /**
     * Called when this policy is deactivated on the given part.
     * 
     * @param part
     */
    void deactivate(IGraphicalPart part);

}