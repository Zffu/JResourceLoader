package net.zffu.jresourceloader.client;

import java.net.URL;

/**
 * A Client that requests resources from a server.
 */
public class ResourceClient {

    /**
     * The Hash of the Client, represents the version of the client.
     */
    public String clientHash;

    /**
     * The URL of the Resource Server.
     */
    public URL serverURL;

    /**
     * Creates a {@link ResourceClient} based on the given parameters.
     * @param clientHash
     * @param serverURL
     */
    public ResourceClient(String clientHash, URL serverURL) {
        this.clientHash = clientHash;
        this.serverURL = serverURL;
    }

    /**
     * Creates a {@link ResourceClient} that doesn't check for hashes.
     * @param serverURL
     */
    public ResourceClient(URL serverURL) {
        this.serverURL = serverURL;
    }




}
