// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.sql.outputs.GetTiersTier;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTiersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String project;
    /**
     * @return A list of all available machine types (tiers) for project. Each contains:
     * 
     */
    private List<GetTiersTier> tiers;

    private GetTiersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String project() {
        return this.project;
    }
    /**
     * @return A list of all available machine types (tiers) for project. Each contains:
     * 
     */
    public List<GetTiersTier> tiers() {
        return this.tiers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTiersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String project;
        private List<GetTiersTier> tiers;
        public Builder() {}
        public Builder(GetTiersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.tiers = defaults.tiers;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder tiers(List<GetTiersTier> tiers) {
            this.tiers = Objects.requireNonNull(tiers);
            return this;
        }
        public Builder tiers(GetTiersTier... tiers) {
            return tiers(List.of(tiers));
        }
        public GetTiersResult build() {
            final var o = new GetTiersResult();
            o.id = id;
            o.project = project;
            o.tiers = tiers;
            return o;
        }
    }
}