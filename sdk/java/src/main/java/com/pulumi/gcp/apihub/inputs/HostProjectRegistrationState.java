// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apihub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostProjectRegistrationState extends com.pulumi.resources.ResourceArgs {

    public static final HostProjectRegistrationState Empty = new HostProjectRegistrationState();

    /**
     * Output only. The time at which the host project registration was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The time at which the host project registration was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Required. Immutable. Google cloud project name in the format: &#34;projects/abc&#34; or &#34;projects/123&#34;.
     * As input, project name with either project id or number are accepted.
     * As output, this field will contain project number.
     * 
     */
    @Import(name="gcpProject")
    private @Nullable Output<String> gcpProject;

    /**
     * @return Required. Immutable. Google cloud project name in the format: &#34;projects/abc&#34; or &#34;projects/123&#34;.
     * As input, project name with either project id or number are accepted.
     * As output, this field will contain project number.
     * 
     */
    public Optional<Output<String>> gcpProject() {
        return Optional.ofNullable(this.gcpProject);
    }

    /**
     * Required. The ID to use for the Host Project Registration, which will become the
     * final component of the host project registration&#39;s resource name. The ID
     * must be the same as the Google cloud project specified in the
     * host_project_registration.gcp_project field.
     * 
     */
    @Import(name="hostProjectRegistrationId")
    private @Nullable Output<String> hostProjectRegistrationId;

    /**
     * @return Required. The ID to use for the Host Project Registration, which will become the
     * final component of the host project registration&#39;s resource name. The ID
     * must be the same as the Google cloud project specified in the
     * host_project_registration.gcp_project field.
     * 
     */
    public Optional<Output<String>> hostProjectRegistrationId() {
        return Optional.ofNullable(this.hostProjectRegistrationId);
    }

    /**
     * Part of `parent`. See documentation of `projectsId`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Part of `parent`. See documentation of `projectsId`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifier. The name of the host project registration.
     * Format:
     * &#34;projects/{project}/locations/{location}/hostProjectRegistrations/{host_project_registration}&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. The name of the host project registration.
     * Format:
     * &#34;projects/{project}/locations/{location}/hostProjectRegistrations/{host_project_registration}&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private HostProjectRegistrationState() {}

    private HostProjectRegistrationState(HostProjectRegistrationState $) {
        this.createTime = $.createTime;
        this.gcpProject = $.gcpProject;
        this.hostProjectRegistrationId = $.hostProjectRegistrationId;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostProjectRegistrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostProjectRegistrationState $;

        public Builder() {
            $ = new HostProjectRegistrationState();
        }

        public Builder(HostProjectRegistrationState defaults) {
            $ = new HostProjectRegistrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. The time at which the host project registration was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The time at which the host project registration was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param gcpProject Required. Immutable. Google cloud project name in the format: &#34;projects/abc&#34; or &#34;projects/123&#34;.
         * As input, project name with either project id or number are accepted.
         * As output, this field will contain project number.
         * 
         * @return builder
         * 
         */
        public Builder gcpProject(@Nullable Output<String> gcpProject) {
            $.gcpProject = gcpProject;
            return this;
        }

        /**
         * @param gcpProject Required. Immutable. Google cloud project name in the format: &#34;projects/abc&#34; or &#34;projects/123&#34;.
         * As input, project name with either project id or number are accepted.
         * As output, this field will contain project number.
         * 
         * @return builder
         * 
         */
        public Builder gcpProject(String gcpProject) {
            return gcpProject(Output.of(gcpProject));
        }

        /**
         * @param hostProjectRegistrationId Required. The ID to use for the Host Project Registration, which will become the
         * final component of the host project registration&#39;s resource name. The ID
         * must be the same as the Google cloud project specified in the
         * host_project_registration.gcp_project field.
         * 
         * @return builder
         * 
         */
        public Builder hostProjectRegistrationId(@Nullable Output<String> hostProjectRegistrationId) {
            $.hostProjectRegistrationId = hostProjectRegistrationId;
            return this;
        }

        /**
         * @param hostProjectRegistrationId Required. The ID to use for the Host Project Registration, which will become the
         * final component of the host project registration&#39;s resource name. The ID
         * must be the same as the Google cloud project specified in the
         * host_project_registration.gcp_project field.
         * 
         * @return builder
         * 
         */
        public Builder hostProjectRegistrationId(String hostProjectRegistrationId) {
            return hostProjectRegistrationId(Output.of(hostProjectRegistrationId));
        }

        /**
         * @param location Part of `parent`. See documentation of `projectsId`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Part of `parent`. See documentation of `projectsId`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Identifier. The name of the host project registration.
         * Format:
         * &#34;projects/{project}/locations/{location}/hostProjectRegistrations/{host_project_registration}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. The name of the host project registration.
         * Format:
         * &#34;projects/{project}/locations/{location}/hostProjectRegistrations/{host_project_registration}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public HostProjectRegistrationState build() {
            return $;
        }
    }

}
