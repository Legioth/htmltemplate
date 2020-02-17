package org.github.legioth.htmltemplate;

import java.io.IOException;
import java.io.InputStream;

/**
 * Callback for creating an input stream on demand.
 */
@FunctionalInterface
public interface StreamSupplier {
    /**
     * Creates an input stream. The caller of this method is responsible for
     * closing the returned stream.
     * 
     * @return the created input stream, not <code>null</code>
     * @throws IOException
     *             if there was a problem when creating the stream
     */
    InputStream createStream() throws IOException;
}
