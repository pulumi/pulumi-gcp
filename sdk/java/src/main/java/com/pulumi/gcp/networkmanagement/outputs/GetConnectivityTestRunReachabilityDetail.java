// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.networkmanagement.outputs.GetConnectivityTestRunReachabilityDetailTrace;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectivityTestRunReachabilityDetail {
    /**
     * @return (Output)
     * Status of the connectivity test: RESULT_UNSPECIFIED, REACHABLE, UNREACHABLE, AMBIGUOUS or UNDETERMINED.
     * 
     */
    private String result;
    /**
     * @return (Output)
     * List of connectivity test traces.
     * Structure is documented below.
     * 
     */
    private List<GetConnectivityTestRunReachabilityDetailTrace> traces;
    /**
     * @return (Output)
     * Time when reachability details were determined. An RFC3339 timestamp in UTC time.
     * This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
     * 
     */
    private String verifyTime;

    private GetConnectivityTestRunReachabilityDetail() {}
    /**
     * @return (Output)
     * Status of the connectivity test: RESULT_UNSPECIFIED, REACHABLE, UNREACHABLE, AMBIGUOUS or UNDETERMINED.
     * 
     */
    public String result() {
        return this.result;
    }
    /**
     * @return (Output)
     * List of connectivity test traces.
     * Structure is documented below.
     * 
     */
    public List<GetConnectivityTestRunReachabilityDetailTrace> traces() {
        return this.traces;
    }
    /**
     * @return (Output)
     * Time when reachability details were determined. An RFC3339 timestamp in UTC time.
     * This in the format of yyyy-MM-ddTHH:mm:ss.SSSZ.
     * 
     */
    public String verifyTime() {
        return this.verifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectivityTestRunReachabilityDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String result;
        private List<GetConnectivityTestRunReachabilityDetailTrace> traces;
        private String verifyTime;
        public Builder() {}
        public Builder(GetConnectivityTestRunReachabilityDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.result = defaults.result;
    	      this.traces = defaults.traces;
    	      this.verifyTime = defaults.verifyTime;
        }

        @CustomType.Setter
        public Builder result(String result) {
            if (result == null) {
              throw new MissingRequiredPropertyException("GetConnectivityTestRunReachabilityDetail", "result");
            }
            this.result = result;
            return this;
        }
        @CustomType.Setter
        public Builder traces(List<GetConnectivityTestRunReachabilityDetailTrace> traces) {
            if (traces == null) {
              throw new MissingRequiredPropertyException("GetConnectivityTestRunReachabilityDetail", "traces");
            }
            this.traces = traces;
            return this;
        }
        public Builder traces(GetConnectivityTestRunReachabilityDetailTrace... traces) {
            return traces(List.of(traces));
        }
        @CustomType.Setter
        public Builder verifyTime(String verifyTime) {
            if (verifyTime == null) {
              throw new MissingRequiredPropertyException("GetConnectivityTestRunReachabilityDetail", "verifyTime");
            }
            this.verifyTime = verifyTime;
            return this;
        }
        public GetConnectivityTestRunReachabilityDetail build() {
            final var _resultValue = new GetConnectivityTestRunReachabilityDetail();
            _resultValue.result = result;
            _resultValue.traces = traces;
            _resultValue.verifyTime = verifyTime;
            return _resultValue;
        }
    }
}
