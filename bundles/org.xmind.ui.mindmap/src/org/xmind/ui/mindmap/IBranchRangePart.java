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

import org.xmind.gef.part.IGraphicalPart;

public interface IBranchRangePart extends IGraphicalPart {

    IBranchPart getOwnedBranch();

    List<IBranchPart> getEnclosingBranches();

    boolean encloses(IBranchPart subbranch);

    void addRangeListener(IRangeListener listener);

    void removeRangeListener(IRangeListener listener);

}