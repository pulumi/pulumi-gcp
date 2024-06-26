// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.filestore.inputs.GetInstanceArgs;
import com.pulumi.gcp.filestore.inputs.GetInstancePlainArgs;
import com.pulumi.gcp.filestore.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class FilestoreFunctions {
    /**
     * Get info about a Google Cloud Filestore instance.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google Cloud Filestore instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args) {
        return getInstancePlain(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google Cloud Filestore instance.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:filestore/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get info about a Google Cloud Filestore instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstancePlain(GetInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:filestore/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
}
