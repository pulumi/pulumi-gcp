// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipBindingStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipBindingStateArgs Empty = new MembershipBindingStateArgs();

    /**
     * (Output)
     * Code describes the state of a MembershipBinding resource.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return (Output)
     * Code describes the state of a MembershipBinding resource.
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    private MembershipBindingStateArgs() {}

    private MembershipBindingStateArgs(MembershipBindingStateArgs $) {
        this.code = $.code;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipBindingStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipBindingStateArgs $;

        public Builder() {
            $ = new MembershipBindingStateArgs();
        }

        public Builder(MembershipBindingStateArgs defaults) {
            $ = new MembershipBindingStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code (Output)
         * Code describes the state of a MembershipBinding resource.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code (Output)
         * Code describes the state of a MembershipBinding resource.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        public MembershipBindingStateArgs build() {
            return $;
        }
    }

}
