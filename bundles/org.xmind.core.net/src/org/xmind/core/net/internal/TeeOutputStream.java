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
package org.xmind.core.net.internal;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Frank Shaka
 * @since 3.6.51
 */
public class TeeOutputStream extends FilterOutputStream {

    private OutputStream out2;

    /**
     * @param out
     */
    public TeeOutputStream(OutputStream out, OutputStream out2) {
        super(out);
        this.out2 = out2;
    }

    /*
     * (non-Javadoc)
     * @see java.io.FilterOutputStream#write(byte[])
     */
    @Override
    public void write(byte[] b) throws IOException {
        out.write(b);
        out2.write(b);
    }

    /*
     * (non-Javadoc)
     * @see java.io.FilterOutputStream#write(byte[], int, int)
     */
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        out.write(b, off, len);
        out2.write(b, off, len);
    }

    /*
     * (non-Javadoc)
     * @see java.io.FilterOutputStream#write(int)
     */
    @Override
    public void write(int b) throws IOException {
        out.write(b);
        out2.write(b);
    }

    /*
     * (non-Javadoc)
     * @see java.io.FilterOutputStream#flush()
     */
    @Override
    public void flush() throws IOException {
        super.flush();
        out2.flush();
    }

}
