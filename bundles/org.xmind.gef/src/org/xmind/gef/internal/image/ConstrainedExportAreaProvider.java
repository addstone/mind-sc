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
package org.xmind.gef.internal.image;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.xmind.gef.image.ExportAreaProvider;

public class ConstrainedExportAreaProvider extends ExportAreaProvider {

    public ConstrainedExportAreaProvider(Rectangle sourceArea,
            int constrainedWidth, int constrainedHeight, Insets margins) {
        super(sourceArea, constrainedWidth, constrainedHeight, margins);
    }

    protected void adjustExportArea() {
        if (constrainedWidth >= 0 && constrainedHeight >= 0) {
            if (constrainedWidth > 0 && constrainedHeight > 0) {
                if (exportArea.width > 0 && exportArea.height > 0) {
                    double w = constrainedWidth - margins.getWidth();
                    double h = constrainedHeight - margins.getHeight();
                    if (w < 0) {
                        w = 0;
                        margins.left = margins.right = 0;
                    }
                    if (h < 0) {
                        h = 0;
                        margins.top = margins.bottom = 0;
                    }
                    if (w < exportArea.width && h < exportArea.height) {
                        double sx = w / exportArea.width;
                        double sy = h / exportArea.height;
                        if (sx > sy) {
                            scale = sy;
                            exportArea.scale(scale).expand(margins);
                            exportArea.height = constrainedHeight;
                        } else if (sx < sy) {
                            scale = sx;
                            exportArea.scale(scale).expand(margins);
                            exportArea.width = constrainedWidth;
                        }
                    } else if (h < exportArea.height) {
                        scale = h / exportArea.height;
                        exportArea.scale(scale).expand(margins);
                        exportArea.height = constrainedHeight;
                    } else if (w < exportArea.width) {
                        scale = w / exportArea.width;
                        exportArea.scale(scale).expand(margins);
                        exportArea.width = constrainedWidth;
                    } else {
                        exportArea.expand(margins);
                    }
                }
            } else {
                scale = 0;
            }
        } else if (constrainedWidth >= 0) {
            if (exportArea.width > 0) {
                double w = constrainedWidth - margins.getWidth();
                if (w < 0) {
                    w = 0;
                    margins.left = margins.right = 0;
                }
                if (w < exportArea.width) {
                    scale = w / exportArea.width;
                    exportArea.scale(scale).expand(margins);
                    exportArea.width = constrainedWidth;
                } else {
                    exportArea.expand(margins);
                }
            } else {
                scale = 0;
            }
        } else if (constrainedHeight >= 0) {
            if (exportArea.height > 0) {
                double h = constrainedHeight - margins.getHeight();
                if (h < 0) {
                    h = 0;
                    margins.top = margins.bottom = 0;
                }
                if (h < exportArea.height) {
                    scale = h / exportArea.height;
                    exportArea.scale(scale).expand(margins);
                    exportArea.height = constrainedHeight;
                } else {
                    exportArea.expand(margins);
                }
            } else {
                scale = 0;
            }
        } else {
            exportArea.expand(margins);
        }
    }
}