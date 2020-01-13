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
package org.xmind.ui.internal.spreadsheet.structures;

import org.eclipse.draw2d.geometry.Dimension;
import org.xmind.ui.branch.Insertion;
import org.xmind.ui.internal.spreadsheet.Spreadsheet;
import org.xmind.ui.mindmap.IBranchPart;
import org.xmind.ui.util.MindMapUtils;

public class CellInsertion extends Insertion {

    private final ColumnHead colHead;

    public CellInsertion(IBranchPart parent, int itemIndex, Dimension size,
            ColumnHead colHead) {
        super(parent, itemIndex, size);
        this.colHead = colHead;
    }

    public void pushIn() {
        super.pushIn();
        MindMapUtils.setCache(getParent(),
                Spreadsheet.KEY_INSERTION_COLUMN_HEAD, colHead);
    }

    public void pullOut() {
        super.pullOut();
        MindMapUtils.flushCache(getParent(),
                Spreadsheet.KEY_INSERTION_COLUMN_HEAD);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || !(obj instanceof CellInsertion))
            return false;
        CellInsertion that = (CellInsertion) obj;
        return super.equals(obj) && this.colHead.equals(that.colHead);
    }

}