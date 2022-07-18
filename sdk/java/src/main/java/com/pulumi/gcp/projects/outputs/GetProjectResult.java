// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.projects.outputs.GetProjectProject;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProjectResult {
    private final String filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of projects matching the provided filter. Structure is defined below.
     * 
     */
    private final List<GetProjectProject> projects;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("projects") List<GetProjectProject> projects) {
        this.filter = filter;
        this.id = id;
        this.projects = projects;
    }

    public String filter() {
        return this.filter;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of projects matching the provided filter. Structure is defined below.
     * 
     */
    public List<GetProjectProject> projects() {
        return this.projects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String id;
        private List<GetProjectProject> projects;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.projects = defaults.projects;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder projects(List<GetProjectProject> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }
        public Builder projects(GetProjectProject... projects) {
            return projects(List.of(projects));
        }        public GetProjectResult build() {
            return new GetProjectResult(filter, id, projects);
        }
    }
}