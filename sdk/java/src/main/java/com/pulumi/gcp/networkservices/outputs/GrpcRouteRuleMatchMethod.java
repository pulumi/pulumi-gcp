// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrpcRouteRuleMatchMethod {
    /**
     * @return Specifies that matches are case sensitive. The default value is true.
     * 
     */
    private @Nullable Boolean caseSensitive;
    /**
     * @return Required. Name of the method to match against.
     * 
     */
    private String grpcMethod;
    /**
     * @return Required. Name of the service to match against.
     * 
     */
    private String grpcService;

    private GrpcRouteRuleMatchMethod() {}
    /**
     * @return Specifies that matches are case sensitive. The default value is true.
     * 
     */
    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }
    /**
     * @return Required. Name of the method to match against.
     * 
     */
    public String grpcMethod() {
        return this.grpcMethod;
    }
    /**
     * @return Required. Name of the service to match against.
     * 
     */
    public String grpcService() {
        return this.grpcService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteRuleMatchMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean caseSensitive;
        private String grpcMethod;
        private String grpcService;
        public Builder() {}
        public Builder(GrpcRouteRuleMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.grpcMethod = defaults.grpcMethod;
    	      this.grpcService = defaults.grpcService;
        }

        @CustomType.Setter
        public Builder caseSensitive(@Nullable Boolean caseSensitive) {

            this.caseSensitive = caseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder grpcMethod(String grpcMethod) {
            if (grpcMethod == null) {
              throw new MissingRequiredPropertyException("GrpcRouteRuleMatchMethod", "grpcMethod");
            }
            this.grpcMethod = grpcMethod;
            return this;
        }
        @CustomType.Setter
        public Builder grpcService(String grpcService) {
            if (grpcService == null) {
              throw new MissingRequiredPropertyException("GrpcRouteRuleMatchMethod", "grpcService");
            }
            this.grpcService = grpcService;
            return this;
        }
        public GrpcRouteRuleMatchMethod build() {
            final var _resultValue = new GrpcRouteRuleMatchMethod();
            _resultValue.caseSensitive = caseSensitive;
            _resultValue.grpcMethod = grpcMethod;
            _resultValue.grpcService = grpcService;
            return _resultValue;
        }
    }
}
