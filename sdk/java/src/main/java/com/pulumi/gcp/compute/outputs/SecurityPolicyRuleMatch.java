// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatchConfig;
import com.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatchExpr;
import com.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatchExprOptions;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyRuleMatch {
    /**
     * @return The configuration options available when specifying versionedExpr.
     * This field must be specified if versionedExpr is specified and cannot be specified if versionedExpr is not specified.
     * Structure is documented below.
     * 
     */
    private @Nullable SecurityPolicyRuleMatchConfig config;
    /**
     * @return User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * 
     */
    private @Nullable SecurityPolicyRuleMatchExpr expr;
    /**
     * @return The configuration options available when specifying a user defined CEVAL expression (i.e., &#39;expr&#39;).
     * Structure is documented below.
     * 
     */
    private @Nullable SecurityPolicyRuleMatchExprOptions exprOptions;
    /**
     * @return Preconfigured versioned expression. If this field is specified, config must also be specified.
     * Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding srcIpRange field in config.
     * Possible values are: `SRC_IPS_V1`.
     * 
     */
    private @Nullable String versionedExpr;

    private SecurityPolicyRuleMatch() {}
    /**
     * @return The configuration options available when specifying versionedExpr.
     * This field must be specified if versionedExpr is specified and cannot be specified if versionedExpr is not specified.
     * Structure is documented below.
     * 
     */
    public Optional<SecurityPolicyRuleMatchConfig> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * 
     */
    public Optional<SecurityPolicyRuleMatchExpr> expr() {
        return Optional.ofNullable(this.expr);
    }
    /**
     * @return The configuration options available when specifying a user defined CEVAL expression (i.e., &#39;expr&#39;).
     * Structure is documented below.
     * 
     */
    public Optional<SecurityPolicyRuleMatchExprOptions> exprOptions() {
        return Optional.ofNullable(this.exprOptions);
    }
    /**
     * @return Preconfigured versioned expression. If this field is specified, config must also be specified.
     * Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding srcIpRange field in config.
     * Possible values are: `SRC_IPS_V1`.
     * 
     */
    public Optional<String> versionedExpr() {
        return Optional.ofNullable(this.versionedExpr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SecurityPolicyRuleMatchConfig config;
        private @Nullable SecurityPolicyRuleMatchExpr expr;
        private @Nullable SecurityPolicyRuleMatchExprOptions exprOptions;
        private @Nullable String versionedExpr;
        public Builder() {}
        public Builder(SecurityPolicyRuleMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.exprOptions = defaults.exprOptions;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        @CustomType.Setter
        public Builder config(@Nullable SecurityPolicyRuleMatchConfig config) {

            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder expr(@Nullable SecurityPolicyRuleMatchExpr expr) {

            this.expr = expr;
            return this;
        }
        @CustomType.Setter
        public Builder exprOptions(@Nullable SecurityPolicyRuleMatchExprOptions exprOptions) {

            this.exprOptions = exprOptions;
            return this;
        }
        @CustomType.Setter
        public Builder versionedExpr(@Nullable String versionedExpr) {

            this.versionedExpr = versionedExpr;
            return this;
        }
        public SecurityPolicyRuleMatch build() {
            final var _resultValue = new SecurityPolicyRuleMatch();
            _resultValue.config = config;
            _resultValue.expr = expr;
            _resultValue.exprOptions = exprOptions;
            _resultValue.versionedExpr = versionedExpr;
            return _resultValue;
        }
    }
}
