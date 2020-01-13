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
package org.xmind.ui.internal.graphicalpolicies;

import org.xmind.gef.graphicalpolicy.AbstractGraphicalPolicy;
import org.xmind.gef.graphicalpolicy.IStructure;
import org.xmind.gef.graphicalpolicy.IStyleSelector;
import org.xmind.gef.graphicalpolicy.NullStructureAlgorithm;

public class SummaryGraphicalPolicy extends AbstractGraphicalPolicy {

    private static final SummaryGraphicalPolicy instance = new SummaryGraphicalPolicy();

    protected IStructure createDefaultStructureAlgorithm() {
        return NullStructureAlgorithm.getInstance();
    }

    protected IStyleSelector createDefaultStyleSelector() {
        return new SummaryStyleSelector();
    }

    public static SummaryGraphicalPolicy getInstance() {
        return instance;
    }
}