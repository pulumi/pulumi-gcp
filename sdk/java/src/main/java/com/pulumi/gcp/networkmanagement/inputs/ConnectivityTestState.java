// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs;
import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectivityTestState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectivityTestState Empty = new ConnectivityTestState();

    /**
     * Whether the analysis should skip firewall checking. Default value is false.
     * 
     */
    @Import(name="bypassFirewallChecks")
    private @Nullable Output<Boolean> bypassFirewallChecks;

    /**
     * @return Whether the analysis should skip firewall checking. Default value is false.
     * 
     */
    public Optional<Output<Boolean>> bypassFirewallChecks() {
        return Optional.ofNullable(this.bypassFirewallChecks);
    }

    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<ConnectivityTestDestinationArgs> destination;

    /**
     * @return Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectivityTestDestinationArgs>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Unique name for the connectivity test.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name for the connectivity test.
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

    /**
     * IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    @Import(name="relatedProjects")
    private @Nullable Output<List<String>> relatedProjects;

    /**
     * @return Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    public Optional<Output<List<String>>> relatedProjects() {
        return Optional.ofNullable(this.relatedProjects);
    }

    /**
     * Whether run analysis for the return path from destination to source.
     * Default value is false.
     * 
     */
    @Import(name="roundTrip")
    private @Nullable Output<Boolean> roundTrip;

    /**
     * @return Whether run analysis for the return path from destination to source.
     * Default value is false.
     * 
     */
    public Optional<Output<Boolean>> roundTrip() {
        return Optional.ofNullable(this.roundTrip);
    }

    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    @Import(name="source")
    private @Nullable Output<ConnectivityTestSourceArgs> source;

    /**
     * @return Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectivityTestSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private ConnectivityTestState() {}

    private ConnectivityTestState(ConnectivityTestState $) {
        this.bypassFirewallChecks = $.bypassFirewallChecks;
        this.description = $.description;
        this.destination = $.destination;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.protocol = $.protocol;
        this.pulumiLabels = $.pulumiLabels;
        this.relatedProjects = $.relatedProjects;
        this.roundTrip = $.roundTrip;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectivityTestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectivityTestState $;

        public Builder() {
            $ = new ConnectivityTestState();
        }

        public Builder(ConnectivityTestState defaults) {
            $ = new ConnectivityTestState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypassFirewallChecks Whether the analysis should skip firewall checking. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder bypassFirewallChecks(@Nullable Output<Boolean> bypassFirewallChecks) {
            $.bypassFirewallChecks = bypassFirewallChecks;
            return this;
        }

        /**
         * @param bypassFirewallChecks Whether the analysis should skip firewall checking. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder bypassFirewallChecks(Boolean bypassFirewallChecks) {
            return bypassFirewallChecks(Output.of(bypassFirewallChecks));
        }

        /**
         * @param description The user-supplied description of the Connectivity Test.
         * Maximum of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The user-supplied description of the Connectivity Test.
         * Maximum of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destination Required. Destination specification of the Connectivity Test.
         * You can use a combination of destination IP address, URI of a supported
         * endpoint, project ID, or VPC network to identify the destination location.
         * Reachability analysis proceeds even if the destination location is
         * ambiguous. However, the test result might include endpoints or use a
         * destination that you don&#39;t intend to test.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<ConnectivityTestDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Required. Destination specification of the Connectivity Test.
         * You can use a combination of destination IP address, URI of a supported
         * endpoint, project ID, or VPC network to identify the destination location.
         * Reachability analysis proceeds even if the destination location is
         * ambiguous. However, the test result might include endpoints or use a
         * destination that you don&#39;t intend to test.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destination(ConnectivityTestDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Unique name for the connectivity test.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name for the connectivity test.
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

        /**
         * @param protocol IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param relatedProjects Other projects that may be relevant for reachability analysis.
         * This is applicable to scenarios where a test can cross project
         * boundaries.
         * 
         * @return builder
         * 
         */
        public Builder relatedProjects(@Nullable Output<List<String>> relatedProjects) {
            $.relatedProjects = relatedProjects;
            return this;
        }

        /**
         * @param relatedProjects Other projects that may be relevant for reachability analysis.
         * This is applicable to scenarios where a test can cross project
         * boundaries.
         * 
         * @return builder
         * 
         */
        public Builder relatedProjects(List<String> relatedProjects) {
            return relatedProjects(Output.of(relatedProjects));
        }

        /**
         * @param relatedProjects Other projects that may be relevant for reachability analysis.
         * This is applicable to scenarios where a test can cross project
         * boundaries.
         * 
         * @return builder
         * 
         */
        public Builder relatedProjects(String... relatedProjects) {
            return relatedProjects(List.of(relatedProjects));
        }

        /**
         * @param roundTrip Whether run analysis for the return path from destination to source.
         * Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder roundTrip(@Nullable Output<Boolean> roundTrip) {
            $.roundTrip = roundTrip;
            return this;
        }

        /**
         * @param roundTrip Whether run analysis for the return path from destination to source.
         * Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder roundTrip(Boolean roundTrip) {
            return roundTrip(Output.of(roundTrip));
        }

        /**
         * @param source Required. Source specification of the Connectivity Test.
         * You can use a combination of source IP address, URI of a supported
         * endpoint, project ID, or VPC network to identify the source location.
         * Reachability analysis might proceed even if the source location is
         * ambiguous. However, the test result might include endpoints or use a source
         * that you don&#39;t intend to test.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<ConnectivityTestSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Required. Source specification of the Connectivity Test.
         * You can use a combination of source IP address, URI of a supported
         * endpoint, project ID, or VPC network to identify the source location.
         * Reachability analysis might proceed even if the source location is
         * ambiguous. However, the test result might include endpoints or use a source
         * that you don&#39;t intend to test.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder source(ConnectivityTestSourceArgs source) {
            return source(Output.of(source));
        }

        public ConnectivityTestState build() {
            return $;
        }
    }

}
