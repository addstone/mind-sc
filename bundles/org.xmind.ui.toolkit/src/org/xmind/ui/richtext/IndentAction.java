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
package org.xmind.ui.richtext;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.xmind.ui.internal.ToolkitImages;

public class IndentAction extends Action implements IRichTextAction {

    private IRichTextEditViewer viewer;

    public IndentAction(IRichTextEditViewer viewer) {
        this(viewer, RichTextMessages.IndentAction_text, ToolkitImages
                .get(ToolkitImages.INDENT),
                RichTextMessages.IndentAction_toolTip);
    }

    public IndentAction(IRichTextEditViewer viewer, String text,
            ImageDescriptor image, String tooltip) {
        super(text, image);
        setId(TextActionConstants.INDENT_ID);
        this.viewer = viewer;
        setToolTipText(tooltip);
    }

    public void dispose() {
        viewer = null;
    }

    public void selectionChanged(IRichTextEditViewer viewer, ISelection selection) {
    }

    public void run() {
        if (viewer == null || viewer.getControl().isDisposed())
            return;

        viewer.getRenderer().indentSelectionParagraph();
    }

}