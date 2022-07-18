// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlexibleAppVersionVpcAccessConnector {
    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private FlexibleAppVersionVpcAccessConnector(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionVpcAccessConnector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionVpcAccessConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public FlexibleAppVersionVpcAccessConnector build() {
            return new FlexibleAppVersionVpcAccessConnector(name);
        }
    }
}