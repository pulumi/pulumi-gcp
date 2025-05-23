// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKeyArgs;
import java.util.Objects;


public final class GetGroupLookupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupLookupArgs Empty = new GetGroupLookupArgs();

    /**
     * The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
     * An entity can represent either a group with an optional namespace or a user without a namespace.
     * The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
     * 
     */
    @Import(name="groupKey", required=true)
    private Output<GetGroupLookupGroupKeyArgs> groupKey;

    /**
     * @return The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
     * An entity can represent either a group with an optional namespace or a user without a namespace.
     * The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
     * 
     */
    public Output<GetGroupLookupGroupKeyArgs> groupKey() {
        return this.groupKey;
    }

    private GetGroupLookupArgs() {}

    private GetGroupLookupArgs(GetGroupLookupArgs $) {
        this.groupKey = $.groupKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupLookupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupLookupArgs $;

        public Builder() {
            $ = new GetGroupLookupArgs();
        }

        public Builder(GetGroupLookupArgs defaults) {
            $ = new GetGroupLookupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupKey The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
         * An entity can represent either a group with an optional namespace or a user without a namespace.
         * The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupKey(Output<GetGroupLookupGroupKeyArgs> groupKey) {
            $.groupKey = groupKey;
            return this;
        }

        /**
         * @param groupKey The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
         * An entity can represent either a group with an optional namespace or a user without a namespace.
         * The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupKey(GetGroupLookupGroupKeyArgs groupKey) {
            return groupKey(Output.of(groupKey));
        }

        public GetGroupLookupArgs build() {
            if ($.groupKey == null) {
                throw new MissingRequiredPropertyException("GetGroupLookupArgs", "groupKey");
            }
            return $;
        }
    }

}
