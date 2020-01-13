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
package org.xmind.core.internal.command;

import java.io.File;

public class BinaryUtil {

    private BinaryUtil() {
        throw new AssertionError();
    }

    public static boolean delete(File f) {
        if (f.isDirectory()) {
            String[] names = f.list();
            for (int i = 0; i < names.length; i++) {
                delete(new File(f, names[i]));
            }
        }
        return f.delete();
    }

}
