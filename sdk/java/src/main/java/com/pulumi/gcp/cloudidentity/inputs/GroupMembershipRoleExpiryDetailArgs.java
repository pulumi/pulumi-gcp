// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GroupMembershipRoleExpiryDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipRoleExpiryDetailArgs Empty = new GroupMembershipRoleExpiryDetailArgs();

    /**
     * The time at which the MembershipRole will expire.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="expireTime", required=true)
    private Output<String> expireTime;

    /**
     * @return The time at which the MembershipRole will expire.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }

    private GroupMembershipRoleExpiryDetailArgs() {}

    private GroupMembershipRoleExpiryDetailArgs(GroupMembershipRoleExpiryDetailArgs $) {
        this.expireTime = $.expireTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMembershipRoleExpiryDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMembershipRoleExpiryDetailArgs $;

        public Builder() {
            $ = new GroupMembershipRoleExpiryDetailArgs();
        }

        public Builder(GroupMembershipRoleExpiryDetailArgs defaults) {
            $ = new GroupMembershipRoleExpiryDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expireTime The time at which the MembershipRole will expire.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime The time at which the MembershipRole will expire.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
         * resolution and up to nine fractional digits.
         * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        public GroupMembershipRoleExpiryDetailArgs build() {
            if ($.expireTime == null) {
                throw new MissingRequiredPropertyException("GroupMembershipRoleExpiryDetailArgs", "expireTime");
            }
            return $;
        }
    }

}
