// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificatemanager.CertificateArgs;
import com.pulumi.gcp.certificatemanager.inputs.CertificateState;
import com.pulumi.gcp.certificatemanager.outputs.CertificateManaged;
import com.pulumi.gcp.certificatemanager.outputs.CertificateSelfManaged;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Certificate Manager Certificate Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var instance = new DnsAuthorization(&#34;instance&#34;, DnsAuthorizationArgs.builder()        
 *             .description(&#34;The default dnss&#34;)
 *             .domain(&#34;subdomain.hashicorptest.com&#34;)
 *             .build());
 * 
 *         var instance2 = new DnsAuthorization(&#34;instance2&#34;, DnsAuthorizationArgs.builder()        
 *             .description(&#34;The default dnss&#34;)
 *             .domain(&#34;subdomain2.hashicorptest.com&#34;)
 *             .build());
 * 
 *         var default_ = new Certificate(&#34;default&#34;, CertificateArgs.builder()        
 *             .description(&#34;The default cert&#34;)
 *             .scope(&#34;EDGE_CACHE&#34;)
 *             .managed(CertificateManagedArgs.builder()
 *                 .domains(                
 *                     instance.domain(),
 *                     instance2.domain())
 *                 .dnsAuthorizations(                
 *                     instance.id(),
 *                     instance2.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Certificate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:certificatemanager/certificate:Certificate default projects/{{project}}/locations/global/certificates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificatemanager/certificate:Certificate default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificatemanager/certificate:Certificate default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:certificatemanager/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * A human-readable description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the EdgeCache resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Configuration and state of a Managed Certificate.
     * Certificate Manager provisions and renews Managed Certificates
     * automatically, for as long as it&#39;s authorized to do so.
     * Structure is documented below.
     * 
     */
    @Export(name="managed", type=CertificateManaged.class, parameters={})
    private Output</* @Nullable */ CertificateManaged> managed;

    /**
     * @return Configuration and state of a Managed Certificate.
     * Certificate Manager provisions and renews Managed Certificates
     * automatically, for as long as it&#39;s authorized to do so.
     * Structure is documented below.
     * 
     */
    public Output<Optional<CertificateManaged>> managed() {
        return Codegen.optional(this.managed);
    }
    /**
     * A user-defined name of the certificate. Certificate names must be unique
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-defined name of the certificate. Certificate names must be unique
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The scope of the certificate.
     * Certificates with default scope are served from core Google data centers.
     * If unsure, choose this option.
     * Certificates with scope EDGE_CACHE are special-purposed certificates,
     * served from non-core Google data centers.
     * Currently allowed only for managed certificates.
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `EDGE_CACHE`.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of the certificate.
     * Certificates with default scope are served from core Google data centers.
     * If unsure, choose this option.
     * Certificates with scope EDGE_CACHE are special-purposed certificates,
     * served from non-core Google data centers.
     * Currently allowed only for managed certificates.
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `EDGE_CACHE`.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Certificate data for a SelfManaged Certificate.
     * SelfManaged Certificates are uploaded by the user. Updating such
     * certificates before they expire remains the user&#39;s responsibility.
     * Structure is documented below.
     * 
     */
    @Export(name="selfManaged", type=CertificateSelfManaged.class, parameters={})
    private Output</* @Nullable */ CertificateSelfManaged> selfManaged;

    /**
     * @return Certificate data for a SelfManaged Certificate.
     * SelfManaged Certificates are uploaded by the user. Updating such
     * certificates before they expire remains the user&#39;s responsibility.
     * Structure is documented below.
     * 
     */
    public Output<Optional<CertificateSelfManaged>> selfManaged() {
        return Codegen.optional(this.selfManaged);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, @Nullable CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, @Nullable CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificatemanager/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificatemanager/certificate:Certificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}