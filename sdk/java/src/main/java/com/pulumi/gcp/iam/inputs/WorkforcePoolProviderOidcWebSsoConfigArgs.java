// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkforcePoolProviderOidcWebSsoConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkforcePoolProviderOidcWebSsoConfigArgs Empty = new WorkforcePoolProviderOidcWebSsoConfigArgs();

    /**
     * The behavior for how OIDC Claims are included in the `assertion` object used for attribute mapping and attribute condition.
     * * ONLY_ID_TOKEN_CLAIMS: Only include ID Token Claims.
     *   Possible values are: `ONLY_ID_TOKEN_CLAIMS`.
     * 
     */
    @Import(name="assertionClaimsBehavior", required=true)
    private Output<String> assertionClaimsBehavior;

    /**
     * @return The behavior for how OIDC Claims are included in the `assertion` object used for attribute mapping and attribute condition.
     * * ONLY_ID_TOKEN_CLAIMS: Only include ID Token Claims.
     *   Possible values are: `ONLY_ID_TOKEN_CLAIMS`.
     * 
     */
    public Output<String> assertionClaimsBehavior() {
        return this.assertionClaimsBehavior;
    }

    /**
     * The Response Type to request for in the OIDC Authorization Request for web sign-in.
     * * ID_TOKEN: The `response_type=id_token` selection uses the Implicit Flow for web sign-in.
     *   Possible values are: `ID_TOKEN`.
     * 
     */
    @Import(name="responseType", required=true)
    private Output<String> responseType;

    /**
     * @return The Response Type to request for in the OIDC Authorization Request for web sign-in.
     * * ID_TOKEN: The `response_type=id_token` selection uses the Implicit Flow for web sign-in.
     *   Possible values are: `ID_TOKEN`.
     * 
     */
    public Output<String> responseType() {
        return this.responseType;
    }

    private WorkforcePoolProviderOidcWebSsoConfigArgs() {}

    private WorkforcePoolProviderOidcWebSsoConfigArgs(WorkforcePoolProviderOidcWebSsoConfigArgs $) {
        this.assertionClaimsBehavior = $.assertionClaimsBehavior;
        this.responseType = $.responseType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforcePoolProviderOidcWebSsoConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforcePoolProviderOidcWebSsoConfigArgs $;

        public Builder() {
            $ = new WorkforcePoolProviderOidcWebSsoConfigArgs();
        }

        public Builder(WorkforcePoolProviderOidcWebSsoConfigArgs defaults) {
            $ = new WorkforcePoolProviderOidcWebSsoConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assertionClaimsBehavior The behavior for how OIDC Claims are included in the `assertion` object used for attribute mapping and attribute condition.
         * * ONLY_ID_TOKEN_CLAIMS: Only include ID Token Claims.
         *   Possible values are: `ONLY_ID_TOKEN_CLAIMS`.
         * 
         * @return builder
         * 
         */
        public Builder assertionClaimsBehavior(Output<String> assertionClaimsBehavior) {
            $.assertionClaimsBehavior = assertionClaimsBehavior;
            return this;
        }

        /**
         * @param assertionClaimsBehavior The behavior for how OIDC Claims are included in the `assertion` object used for attribute mapping and attribute condition.
         * * ONLY_ID_TOKEN_CLAIMS: Only include ID Token Claims.
         *   Possible values are: `ONLY_ID_TOKEN_CLAIMS`.
         * 
         * @return builder
         * 
         */
        public Builder assertionClaimsBehavior(String assertionClaimsBehavior) {
            return assertionClaimsBehavior(Output.of(assertionClaimsBehavior));
        }

        /**
         * @param responseType The Response Type to request for in the OIDC Authorization Request for web sign-in.
         * * ID_TOKEN: The `response_type=id_token` selection uses the Implicit Flow for web sign-in.
         *   Possible values are: `ID_TOKEN`.
         * 
         * @return builder
         * 
         */
        public Builder responseType(Output<String> responseType) {
            $.responseType = responseType;
            return this;
        }

        /**
         * @param responseType The Response Type to request for in the OIDC Authorization Request for web sign-in.
         * * ID_TOKEN: The `response_type=id_token` selection uses the Implicit Flow for web sign-in.
         *   Possible values are: `ID_TOKEN`.
         * 
         * @return builder
         * 
         */
        public Builder responseType(String responseType) {
            return responseType(Output.of(responseType));
        }

        public WorkforcePoolProviderOidcWebSsoConfigArgs build() {
            $.assertionClaimsBehavior = Objects.requireNonNull($.assertionClaimsBehavior, "expected parameter 'assertionClaimsBehavior' to be non-null");
            $.responseType = Objects.requireNonNull($.responseType, "expected parameter 'responseType' to be non-null");
            return $;
        }
    }

}