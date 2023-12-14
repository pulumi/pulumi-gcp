// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNsxCredentialsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNsxCredentialsPlainArgs Empty = new GetNsxCredentialsPlainArgs();

    /**
     * The resource name of the private cloud which contains the NSX.
     * 
     */
    @Import(name="parent", required=true)
    private String parent;

    /**
     * @return The resource name of the private cloud which contains the NSX.
     * 
     */
    public String parent() {
        return this.parent;
    }

    private GetNsxCredentialsPlainArgs() {}

    private GetNsxCredentialsPlainArgs(GetNsxCredentialsPlainArgs $) {
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNsxCredentialsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNsxCredentialsPlainArgs $;

        public Builder() {
            $ = new GetNsxCredentialsPlainArgs();
        }

        public Builder(GetNsxCredentialsPlainArgs defaults) {
            $ = new GetNsxCredentialsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parent The resource name of the private cloud which contains the NSX.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            $.parent = parent;
            return this;
        }

        public GetNsxCredentialsPlainArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            return $;
        }
    }

}