// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MembershipAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipAuthorityArgs Empty = new MembershipAuthorityArgs();

    @Import(name="issuer", required=true)
    private Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }

    private MembershipAuthorityArgs() {}

    private MembershipAuthorityArgs(MembershipAuthorityArgs $) {
        this.issuer = $.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipAuthorityArgs $;

        public Builder() {
            $ = new MembershipAuthorityArgs();
        }

        public Builder(MembershipAuthorityArgs defaults) {
            $ = new MembershipAuthorityArgs(Objects.requireNonNull(defaults));
        }

        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        public MembershipAuthorityArgs build() {
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            return $;
        }
    }

}