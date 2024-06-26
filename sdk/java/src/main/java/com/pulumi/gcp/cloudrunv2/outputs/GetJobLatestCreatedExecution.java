// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobLatestCreatedExecution {
    /**
     * @return Completion timestamp of the execution.
     * 
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private String completionTime;
    /**
     * @return Creation timestamp of the execution.
     * 
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private String createTime;
    /**
     * @return The name of the Cloud Run v2 Job.
     * 
     */
    private String name;

    private GetJobLatestCreatedExecution() {}
    /**
     * @return Completion timestamp of the execution.
     * 
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String completionTime() {
        return this.completionTime;
    }
    /**
     * @return Creation timestamp of the execution.
     * 
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The name of the Cloud Run v2 Job.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobLatestCreatedExecution defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String completionTime;
        private String createTime;
        private String name;
        public Builder() {}
        public Builder(GetJobLatestCreatedExecution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder completionTime(String completionTime) {
            if (completionTime == null) {
              throw new MissingRequiredPropertyException("GetJobLatestCreatedExecution", "completionTime");
            }
            this.completionTime = completionTime;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetJobLatestCreatedExecution", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetJobLatestCreatedExecution", "name");
            }
            this.name = name;
            return this;
        }
        public GetJobLatestCreatedExecution build() {
            final var _resultValue = new GetJobLatestCreatedExecution();
            _resultValue.completionTime = completionTime;
            _resultValue.createTime = createTime;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
