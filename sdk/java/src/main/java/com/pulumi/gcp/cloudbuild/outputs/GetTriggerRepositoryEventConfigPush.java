// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerRepositoryEventConfigPush {
    /**
     * @return Regex of branches to match.
     * 
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private String branch;
    /**
     * @return If true, only trigger a build if the revision regex does NOT match the git_ref regex.
     * 
     */
    private Boolean invertRegex;
    /**
     * @return Regex of tags to match.
     * 
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private String tag;

    private GetTriggerRepositoryEventConfigPush() {}
    /**
     * @return Regex of branches to match.
     * 
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return If true, only trigger a build if the revision regex does NOT match the git_ref regex.
     * 
     */
    public Boolean invertRegex() {
        return this.invertRegex;
    }
    /**
     * @return Regex of tags to match.
     * 
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerRepositoryEventConfigPush defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branch;
        private Boolean invertRegex;
        private String tag;
        public Builder() {}
        public Builder(GetTriggerRepositoryEventConfigPush defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.invertRegex = defaults.invertRegex;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder branch(String branch) {
            if (branch == null) {
              throw new MissingRequiredPropertyException("GetTriggerRepositoryEventConfigPush", "branch");
            }
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder invertRegex(Boolean invertRegex) {
            if (invertRegex == null) {
              throw new MissingRequiredPropertyException("GetTriggerRepositoryEventConfigPush", "invertRegex");
            }
            this.invertRegex = invertRegex;
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            if (tag == null) {
              throw new MissingRequiredPropertyException("GetTriggerRepositoryEventConfigPush", "tag");
            }
            this.tag = tag;
            return this;
        }
        public GetTriggerRepositoryEventConfigPush build() {
            final var _resultValue = new GetTriggerRepositoryEventConfigPush();
            _resultValue.branch = branch;
            _resultValue.invertRegex = invertRegex;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}
