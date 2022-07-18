// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterState extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterState Empty = new ServicePerimeterState();

    /**
     * Time the AccessPolicy was created in UTC.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Time the AccessPolicy was created in UTC.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and &#39;_&#39;.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and &#39;_&#39;.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
     */
    @Import(name="perimeterType")
    private @Nullable Output<String> perimeterType;

    /**
     * @return Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
     */
    public Optional<Output<String>> perimeterType() {
        return Optional.ofNullable(this.perimeterType);
    }

    /**
     * Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<ServicePerimeterSpecArgs> spec;

    /**
     * @return Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
     */
    @Import(name="status")
    private @Nullable Output<ServicePerimeterStatusArgs> status;

    /**
     * @return ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Human readable title. Must be unique within the Policy.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Time the AccessPolicy was updated in UTC.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Time the AccessPolicy was updated in UTC.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config (&#34;status&#34;) without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @Import(name="useExplicitDryRunSpec")
    private @Nullable Output<Boolean> useExplicitDryRunSpec;

    /**
     * @return Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config (&#34;status&#34;) without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    public Optional<Output<Boolean>> useExplicitDryRunSpec() {
        return Optional.ofNullable(this.useExplicitDryRunSpec);
    }

    private ServicePerimeterState() {}

    private ServicePerimeterState(ServicePerimeterState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.name = $.name;
        this.parent = $.parent;
        this.perimeterType = $.perimeterType;
        this.spec = $.spec;
        this.status = $.status;
        this.title = $.title;
        this.updateTime = $.updateTime;
        this.useExplicitDryRunSpec = $.useExplicitDryRunSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterState $;

        public Builder() {
            $ = new ServicePerimeterState();
        }

        public Builder(ServicePerimeterState defaults) {
            $ = new ServicePerimeterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Time the AccessPolicy was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Time the AccessPolicy was created in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description of the ServicePerimeter and its use. Does not affect
         * behavior.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the ServicePerimeter and its use. Does not affect
         * behavior.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Resource name for the ServicePerimeter. The short_name component must
         * begin with a letter and only include alphanumeric and &#39;_&#39;.
         * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name for the ServicePerimeter. The short_name component must
         * begin with a letter and only include alphanumeric and &#39;_&#39;.
         * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The AccessPolicy this ServicePerimeter lives in.
         * Format: accessPolicies/{policy_id}
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The AccessPolicy this ServicePerimeter lives in.
         * Format: accessPolicies/{policy_id}
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param perimeterType Specifies the type of the Perimeter. There are two types: regular and
         * bridge. Regular Service Perimeter contains resources, access levels,
         * and restricted services. Every resource can be in at most
         * ONE regular Service Perimeter.
         * In addition to being in a regular service perimeter, a resource can also
         * be in zero or more perimeter bridges. A perimeter bridge only contains
         * resources. Cross project operations are permitted if all effected
         * resources share some perimeter (whether bridge or regular). Perimeter
         * Bridge does not contain access levels or services: those are governed
         * entirely by the regular perimeter that resource is in.
         * Perimeter Bridges are typically useful when building more complex
         * topologies with many independent perimeters that need to share some data
         * with a common perimeter, but should not be able to share data among
         * themselves.
         * Default value is `PERIMETER_TYPE_REGULAR`.
         * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
         * 
         * @return builder
         * 
         */
        public Builder perimeterType(@Nullable Output<String> perimeterType) {
            $.perimeterType = perimeterType;
            return this;
        }

        /**
         * @param perimeterType Specifies the type of the Perimeter. There are two types: regular and
         * bridge. Regular Service Perimeter contains resources, access levels,
         * and restricted services. Every resource can be in at most
         * ONE regular Service Perimeter.
         * In addition to being in a regular service perimeter, a resource can also
         * be in zero or more perimeter bridges. A perimeter bridge only contains
         * resources. Cross project operations are permitted if all effected
         * resources share some perimeter (whether bridge or regular). Perimeter
         * Bridge does not contain access levels or services: those are governed
         * entirely by the regular perimeter that resource is in.
         * Perimeter Bridges are typically useful when building more complex
         * topologies with many independent perimeters that need to share some data
         * with a common perimeter, but should not be able to share data among
         * themselves.
         * Default value is `PERIMETER_TYPE_REGULAR`.
         * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
         * 
         * @return builder
         * 
         */
        public Builder perimeterType(String perimeterType) {
            return perimeterType(Output.of(perimeterType));
        }

        /**
         * @param spec Proposed (or dry run) ServicePerimeter configuration.
         * This configuration allows to specify and test ServicePerimeter configuration
         * without enforcing actual access restrictions. Only allowed to be set when
         * the `useExplicitDryRunSpec` flag is set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<ServicePerimeterSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Proposed (or dry run) ServicePerimeter configuration.
         * This configuration allows to specify and test ServicePerimeter configuration
         * without enforcing actual access restrictions. Only allowed to be set when
         * the `useExplicitDryRunSpec` flag is set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder spec(ServicePerimeterSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status ServicePerimeter configuration. Specifies sets of resources,
         * restricted services and access levels that determine
         * perimeter content and boundaries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<ServicePerimeterStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status ServicePerimeter configuration. Specifies sets of resources,
         * restricted services and access levels that determine
         * perimeter content and boundaries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder status(ServicePerimeterStatusArgs status) {
            return status(Output.of(status));
        }

        /**
         * @param title Human readable title. Must be unique within the Policy.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Human readable title. Must be unique within the Policy.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param updateTime Time the AccessPolicy was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Time the AccessPolicy was updated in UTC.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param useExplicitDryRunSpec Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
         * for all Service Perimeters, and that spec is identical to the status for those
         * Service Perimeters. When this flag is set, it inhibits the generation of the
         * implicit spec, thereby allowing the user to explicitly provide a
         * configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter.
         * This allows the user to test changes to the enforced config (&#34;status&#34;) without
         * actually enforcing them. This testing is done through analyzing the differences
         * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
         * bet set to True if any of the fields in the spec are set to non-default values.
         * 
         * @return builder
         * 
         */
        public Builder useExplicitDryRunSpec(@Nullable Output<Boolean> useExplicitDryRunSpec) {
            $.useExplicitDryRunSpec = useExplicitDryRunSpec;
            return this;
        }

        /**
         * @param useExplicitDryRunSpec Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
         * for all Service Perimeters, and that spec is identical to the status for those
         * Service Perimeters. When this flag is set, it inhibits the generation of the
         * implicit spec, thereby allowing the user to explicitly provide a
         * configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter.
         * This allows the user to test changes to the enforced config (&#34;status&#34;) without
         * actually enforcing them. This testing is done through analyzing the differences
         * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
         * bet set to True if any of the fields in the spec are set to non-default values.
         * 
         * @return builder
         * 
         */
        public Builder useExplicitDryRunSpec(Boolean useExplicitDryRunSpec) {
            return useExplicitDryRunSpec(Output.of(useExplicitDryRunSpec));
        }

        public ServicePerimeterState build() {
            return $;
        }
    }

}