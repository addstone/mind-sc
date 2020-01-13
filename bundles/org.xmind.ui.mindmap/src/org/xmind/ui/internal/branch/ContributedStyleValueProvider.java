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
package org.xmind.ui.internal.branch;

import static org.eclipse.ui.internal.registry.IWorkbenchRegistryConstants.ATT_CLASS;
import static org.eclipse.ui.internal.registry.IWorkbenchRegistryConstants.ATT_ID;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.internal.registry.RegistryReader;
import org.xmind.ui.branch.IBranchStyleValueProvider;
import org.xmind.ui.mindmap.IBranchPart;
import org.xmind.ui.util.Logger;

public class ContributedStyleValueProvider implements IBranchStyleValueProvider {

    private IConfigurationElement element;

    private String id;

    private IBranchStyleValueProvider contributor;

    private boolean triedLoadingContributor;

    public ContributedStyleValueProvider(IConfigurationElement element)
            throws CoreException {
        this.element = element;
        this.id = element.getAttribute(ATT_ID);
        if (RegistryReader.getClassValue(element, ATT_CLASS) == null) {
            throw new CoreException(new Status(IStatus.ERROR, element
                    .getNamespaceIdentifier(), 0,
                    "Invalid extension (missing class name): " + id, //$NON-NLS-1$ 
                    null));
        }
    }

    public String getId() {
        return id;
    }

    public String getValue(IBranchPart branch, String layerName, String key) {
        IBranchStyleValueProvider cont = getContributor();
        if (cont != null)
            return cont.getValue(branch, layerName, key);
        return null;
    }

    private IBranchStyleValueProvider getContributor() {
        if (contributor == null && !triedLoadingContributor) {
            try {
                contributor = (IBranchStyleValueProvider) element
                        .createExecutableExtension(ATT_CLASS);
            } catch (CoreException e) {
                Logger.log(e, "Failed to create style value provider: " + id); //$NON-NLS-1$
            }
            triedLoadingContributor = true;
        }
        return contributor;
    }

}