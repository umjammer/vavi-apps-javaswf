/*
 * Created on Jul 4, 2003
 */

package com.anotherbigidea.flash.interfaces;


/**
 * Interface for passing the SWF file signature.
 * <p>
 * This allows the new Flash 6/MX Compressed File signature to be specified.
 * If this interface is not implemented, or the signature(..) method is not
 * called then the assumption is that the file signature is the normal,
 * non-compressed, one.
 *
 * @author D.N.G. Main
 */
public interface SWFFileSignature {

    // File signatures
    String SIGNATURE_NORMAL = "FWS";
    String SIGNATURE_COMPRESSED = "CWS";

    /**
     * Pass the signature.  This method must be called before the header(..)
     * method in SWFHeader.
     *
     * @param sig the 3 char signature - one of the SIGNATURE_* constants.
     */
    void signature(String sig);
}
