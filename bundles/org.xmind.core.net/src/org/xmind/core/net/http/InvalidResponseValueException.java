/* ******************************************************************************
 * Copyright (c) 2006-2016 XMind Ltd. and others.
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
/**
 * 
 */
package org.xmind.core.net.http;

import java.io.IOException;

/**
 * @author Shawn
 */
public class InvalidResponseValueException extends IOException {

    /**
     * 
     */
    private static final long serialVersionUID = -2680012534566070493L;

    /**
     * @param message
     */
    public InvalidResponseValueException(String message) {
        this(message, null);
    }

    /**
     * @param message
     * @param cause
     */
    public InvalidResponseValueException(String message, Throwable cause) {
        super(message, cause);
    }

}
