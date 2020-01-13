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
package org.xmind.gef.ui.actions;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.actions.ActionFactory;
import org.xmind.gef.GEF;
import org.xmind.gef.ui.editor.IGraphicalEditorPage;

public class DeleteAction extends RequestAction implements ISelectionAction {

    public DeleteAction(IGraphicalEditorPage page) {
        super(ActionFactory.DELETE.getId(), page, GEF.REQ_DELETE);
        setActionDefinitionId(ActionFactory.DELETE.getCommandId());
    }

    public void setSelection(ISelection selection) {
        setEnabled(canDelete(selection));
    }

    protected boolean canDelete(ISelection selection) {
        return false;
    }
}