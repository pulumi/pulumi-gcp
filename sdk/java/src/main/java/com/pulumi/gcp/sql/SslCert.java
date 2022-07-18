// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.sql.SslCertArgs;
import com.pulumi.gcp.sql.inputs.SslCertState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Google SQL SSL Cert on a Google SQL Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/mysql/admin-api/v1beta4/sslCerts).
 * 
 * &gt; **Note:** All arguments including the private key will be stored in the raw state as plain-text
 * 
 * ## Example Usage
 * 
 * Example creating a SQL Client Certificate.
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
 *         var dbNameSuffix = new RandomId(&#34;dbNameSuffix&#34;, RandomIdArgs.builder()        
 *             .byteLength(4)
 *             .build());
 * 
 *         var main = new DatabaseInstance(&#34;main&#34;, DatabaseInstanceArgs.builder()        
 *             .databaseVersion(&#34;MYSQL_5_7&#34;)
 *             .settings(DatabaseInstanceSettingsArgs.builder()
 *                 .tier(&#34;db-f1-micro&#34;)
 *                 .build())
 *             .build());
 * 
 *         var clientCert = new SslCert(&#34;clientCert&#34;, SslCertArgs.builder()        
 *             .commonName(&#34;client-name&#34;)
 *             .instance(main.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Since the contents of the certificate cannot be accessed after its creation, this resource cannot be imported.
 * 
 */
@ResourceType(type="gcp:sql/sslCert:SslCert")
public class SslCert extends com.pulumi.resources.CustomResource {
    /**
     * The actual certificate data for this client certificate.
     * 
     */
    @Export(name="cert", type=String.class, parameters={})
    private Output<String> cert;

    /**
     * @return The actual certificate data for this client certificate.
     * 
     */
    public Output<String> cert() {
        return this.cert;
    }
    /**
     * The serial number extracted from the certificate data.
     * 
     */
    @Export(name="certSerialNumber", type=String.class, parameters={})
    private Output<String> certSerialNumber;

    /**
     * @return The serial number extracted from the certificate data.
     * 
     */
    public Output<String> certSerialNumber() {
        return this.certSerialNumber;
    }
    /**
     * The common name to be used in the certificate to identify the
     * client. Constrained to [a-zA-Z.-_ ]+. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="commonName", type=String.class, parameters={})
    private Output<String> commonName;

    /**
     * @return The common name to be used in the certificate to identify the
     * client. Constrained to [a-zA-Z.-_ ]+. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> commonName() {
        return this.commonName;
    }
    /**
     * The time when the certificate was created in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the certificate was created in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time when the certificate expires in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return The time when the certificate expires in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     * 
     */
    public Output<String> expirationTime() {
        return this.expirationTime;
    }
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     * 
     */
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }
    /**
     * The private key associated with the client certificate.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return The private key associated with the client certificate.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The CA cert of the server this client cert was generated from.
     * 
     */
    @Export(name="serverCaCert", type=String.class, parameters={})
    private Output<String> serverCaCert;

    /**
     * @return The CA cert of the server this client cert was generated from.
     * 
     */
    public Output<String> serverCaCert() {
        return this.serverCaCert;
    }
    /**
     * The SHA1 Fingerprint of the certificate.
     * 
     */
    @Export(name="sha1Fingerprint", type=String.class, parameters={})
    private Output<String> sha1Fingerprint;

    /**
     * @return The SHA1 Fingerprint of the certificate.
     * 
     */
    public Output<String> sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SslCert(String name) {
        this(name, SslCertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SslCert(String name, SslCertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SslCert(String name, SslCertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/sslCert:SslCert", name, args == null ? SslCertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SslCert(String name, Output<String> id, @Nullable SslCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/sslCert:SslCert", name, state, makeResourceOptions(options, id));
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
    public static SslCert get(String name, Output<String> id, @Nullable SslCertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SslCert(name, id, state, options);
    }
}